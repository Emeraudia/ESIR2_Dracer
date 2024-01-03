package Voyageur_De_Commerce;

import java.util.Arrays;
import java.util.Random;

import Algo_Genetiques.Individu;

public class Individu_VDC implements Individu {

	private double[] coord_x;
	private double[] coord_y;

	public int[] parcours;
	private Random r;

	//Constructeur
	public Individu_VDC(double[] coord_x, double[] coord_y) {
		this.coord_x = coord_x;
		this.coord_y = coord_y;

		this.r = new Random();

		this.parcours = new int[coord_x.length];
		for(int i = 0 ; i < parcours.length ; i++) parcours[i] = i;
		for(int i = 0; i < parcours.length; i++){
			int indexSwap = r.nextInt(parcours.length);
			int tmp = parcours[indexSwap];
			parcours[indexSwap] = parcours[i];
			parcours[i] = tmp;
		}
	}

	/* Classes de l'interface Individu
	 */
	@Override
	public double adaptation() {
		double sum = 0;
		for(int i = 1 ; i < parcours.length ; i++){
			sum += Math.sqrt(Math.pow(2, coord_x[parcours[i]]-coord_x[parcours[i-1]]) +
			Math.pow(2, coord_y[parcours[i]]-coord_y[parcours[i-1]]));
		}
		return 1/sum;
	}
	@Override
	public Individu[] croisement(Individu conjoint) {
		// Une possibilité: croisement "prudent"
		// A COMPLETER ET A ADAPTER A VOS CHOIX DE REPRESENTATION

		Individu_VDC[] enfants = new Individu_VDC[2];
		enfants[0] = new Individu_VDC(coord_x, coord_y);
		enfants[1] = new Individu_VDC(coord_x, coord_y);

		Individu_VDC conjoint_vdc = (Individu_VDC)conjoint;

		boolean[] b1 = new boolean[parcours.length];
		boolean[] b2 = new boolean[parcours.length];
		for(int i=0;i<parcours.length;i++){
			b1[i]=false;
			b2[i]=false;
		}
		int ind = r.nextInt(parcours.length);

		// on regarde les villes qu'on rencontre dans la premiere partie
		for(int i=0;i<ind;i++){
			enfants[0].parcours[i] = this.parcours[i];
			b1[this.parcours[i]] = true;

			enfants[1].parcours[i] = conjoint_vdc.parcours[i];
			b2[conjoint_vdc.parcours[i]] = true;
		}
		
		//deuxieme partie : si la ville n'a pas été visitée dans la premiere partie, on prend
		int ind1 = ind;
		int ind2 = ind;
		for(int i=ind;i<parcours.length;i++){
			if(!b1[conjoint_vdc.parcours[i]]){
				enfants[0].parcours[ind1] = conjoint_vdc.parcours[i];
				b1[conjoint_vdc.parcours[i]] = true;
				ind1++;
			}
			else enfants[0].parcours[i] = -1;
			if(!b2[this.parcours[i]]){
				enfants[1].parcours[ind2] = this.parcours[i];
				b2[this.parcours[i]] = true;
				ind2++;
			}
			else enfants[1].parcours[i] = -1;
		}
		
		//fin : on complète avec les villes non rencontrées 
		for(int j = 0 ; j < parcours.length ; j++){
			if(!b1[j]){
				enfants[0].parcours[ind1] = j;
				ind1++;
			}
			if(!b2[j]){
				enfants[1].parcours[ind2] = j;
				ind2++;
			}
		}
		if(Math.random() < 0.8){
			enfants[0].optim_2opt();
			enfants[1].optim_2opt();
		}

		return enfants;
	}
	@Override
	public void mutation(double prob) {
		for(int i = 1 ; i < parcours.length ; i++){
			if(r.nextDouble() < prob) {
				int tmp = this.parcours[i];
				this.parcours[i] = this.parcours[i-1];
				this.parcours[i-1] = tmp;
			}
		}
		
	}
	
	/* Accesseurs (pour Display_VDC)
	 */
	public int[] get_parcours(){
		return this.parcours;
	}
	public double[] get_coord_x(){
		return this.coord_x;
	}
	
	public double[] get_coord_y(){
		return this.coord_y;
	}

	@Override
	public Individu copy() {
		Individu_VDC copy = new Individu_VDC(coord_x, coord_y);
		copy.parcours = this.parcours;
		return copy;
	}	


	public void optim_2opt(){
		for(int i=0;i<parcours.length;i++){
			for(int j=i+1;j<parcours.length;j++){
				if (gain(i,j)<0){ 
					for(int k=0;k<(j-i+1)/2;k++){
						int tmp = parcours[i+k];
						parcours[i+k] = parcours[j-k];
						parcours[j-k] = tmp;
						
					}
				}
			}
		}		    
	}
	
	private double gain(int i, int j){
		int nb_villes = parcours.length;
		 double gain = distance(parcours[i], parcours[(j+1)%nb_villes])
				 	 + distance(parcours[(i+nb_villes-1)%nb_villes], parcours[j])
				 	 - distance(parcours[(i+nb_villes-1)%nb_villes], parcours[i])
				 	 - distance(parcours[j], parcours[(j+1)%nb_villes]);
         return gain;
	}

	private double distance(int cite_a, int cite_b){
		return Math.sqrt(Math.pow(2, coord_x[parcours[cite_b]]-coord_x[parcours[cite_a]]) +
			Math.pow(2, coord_y[parcours[cite_b]]-coord_y[parcours[cite_a]]));
	}
}
