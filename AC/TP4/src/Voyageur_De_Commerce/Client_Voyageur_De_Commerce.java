package Voyageur_De_Commerce;

import java.io.*;
import Util.Lecture;
import Algo_Genetiques.Population;
import Sac_A_Dos.Individu_SAD;

public class Client_Voyageur_De_Commerce {


	/**
	 * lit une liste de poids dans un fichier
	 * @param nomFichier  nom du fichier texte contenant les coordonnées des villes
	 * @param nbr_villes nombre de villes
	 * @param coord_x et coord_y : les 2 tableaux que la fonction remplit et qui vont contenir les coordonnées des villes
	 */
	public static void charge_coords(String nomFichier, int nbr_villes, double[] coord_x, double[] coord_y){
		assert(coord_x.length==coord_y.length) : "charge_coords : coord_x et coord_y n'ont pas la même taille ?";
		InputStream IS = Lecture.ouvrir(nomFichier);
		if (IS==null){
			System.err.println("pb d'ouverture du fichier "+nomFichier);
		}
		int i=0;
		while(!Lecture.finFichier(IS) && i<coord_x.length){
			coord_x[i] = Lecture.lireDouble(IS);
			coord_y[i] = Lecture.lireDouble(IS);
			i++;
		}
		Lecture.fermer(IS);
	}

	public static void main(String[] args) throws InterruptedException{

		/* paramètres */ 
		int nbr_indiv=100;
		double prob_mut=0.1;

		/* on initialise les coordonnées des villes en les lisant ds un fichier 
		 */

		int nbr_villes = 64;
		double[] coord_x = new double[nbr_villes];
		double[] coord_y = new double[nbr_villes];
		//charge_coords("data_vdc/"+nbr_villes+"coords.txt",nbr_villes, coord_x, coord_y);
		charge_coords("data_vdc/quadraturecercle_200.txt",nbr_villes, coord_x, coord_y);

		/* Exemple d'utilisation de Display_VDCC (il faut d'abord faire le constructeur pour ce test fonctionne, ainsi que compléter les accesseurs)
		 */
		// Individu_VDC ind1 = new Individu_VDC(coord_x, coord_y); //on crée un individu aléatoire
		// Display_VDC disp = new Display_VDC(ind1); //on l'affiche
		// Thread.sleep(1000); //pause de 1 seconde (pour avoir le temps de voir le premier affichage)
		// Individu_VDC ind2 = new Individu_VDC(coord_x, coord_y); //on en crée un autre
		// disp.refresh(ind2); //on met à jour l'affichage avec le nouveau


		/* on crée une population (aléatoire)
		 * de nbr_indiv individus associés au problème
		 * du sac à dos considéré 
		 */
		Individu_VDC[] list_individu = new Individu_VDC[nbr_indiv];
		for(int i = 0 ; i < nbr_indiv ; i++) list_individu[i] = new Individu_VDC(coord_x, coord_y);
		Population population = new Population<>(list_individu);


		/* on génére les générations successives
		 * en faisant se reproduire la population
		 * et on affiche l'adaptation moyenne et maximale de chaque génération
		 * on s'arrête si on fait un nombre donné (paramètre) d'itérations
		 * le résultat est alors donné par l'individu maximal obtenus lors des itérations
		 */
		int i = 0;
		double max_val = 0;
		Individu_VDC best_individu = new Individu_VDC(coord_x, coord_y);
		int can_break = 0;
		do{
			population.reproduction(prob_mut);
			if(i%20 == 0){
				System.out.println("Génération : "+i);
				System.out.println("adaptation maximale : " + population.adaptation_maximale());
				System.out.println("adaptation moyenne : " + population.adaptation_moyenne());
			}
			if(population.adaptation_maximale() > max_val){
				max_val = population.adaptation_maximale();
				best_individu = (Individu_VDC)population.individu_maximal().copy();
				can_break = 0;
			}
			can_break++;
			i++;
		}while(i < 5000 && can_break < 2500);

		
		System.out.println(best_individu.adaptation());
		System.out.println();
		System.out.println("Pour un Voyageur de commerce traversant "+nbr_villes+" villes.");
		System.out.println("On résoud le problème avec une population de "+nbr_indiv+" individus et une probabilité de mutation de "+prob_mut);
		System.out.println();
		System.out.println("Après "+i+" itération le résulat optimal ressemble à : ");
		Display_VDC disp = new Display_VDC(best_individu); 
	}
}