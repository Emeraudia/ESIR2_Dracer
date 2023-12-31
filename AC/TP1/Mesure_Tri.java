import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mesure_Tri {

	/* Affiche un tableau d'entiers
	 */
	public static void afficher(int [] t){
		System.out.print("[");
		for(int k=0;k<t.length;k++)
			System.out.print(" "+t[k]+" ");
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		//Vérification de l'implémentation des tris
		int [] t = new int[10];
		int [] t2 = new int[10];
		for(int k=0;k<t.length;k++){ //initialisation aléatoire
			t[k]=(int) (Math.random()*100);
			t2[k]=t[k];
		}
		System.out.print("Avant le tri : "); afficher(t);
		Tri.triInsertion(t);
		System.out.print("Après le tri par insertion: "); afficher(t);
		Tri.triFusion(t2);
		System.out.print("Après le tri fusion:        "); afficher(t2);
		
		//Analyse du temps d'exécution
		
		//A FAIRE : adapter les 3 valeurs suivantes pour avoir des mesures significatives
		// surtout la valeurs de la variable taille_fin
		int taille_init = 100000;
		int taille_fin  = 1000000;
		int nbrMesures = 30;
		
		int taille_incr = (taille_fin-taille_init)/(nbrMesures-1);

		List<Integer> tab_tailles = new ArrayList<Integer>();
		List<Integer> tab_temps = new ArrayList<Integer>();
		for(int n = taille_init; n<taille_fin; n=n+taille_incr){			  
			tab_tailles.add(n); //on sauvegarde la taille
			t = new int[n];

			//A FAIRE : initialisation de t
			for(int k=0;k<t.length;k++)	{ 
				//croissant
				/*
				 * use size :
				 * 10000000
				 * 100000000
				 */
				//t[k] = k;
				/*
				 * use size :
				 * 10000
				 * 100000
				 */
				//décroissant
				//t[k] = n+1-k;
				//aléatoire
				/*
				 * use size :
				 * 10000
				 * 100000
				 * 
				 * tri fusion size:
				 * 100000
				 * 1000000
				 */
				t[k]=(int) (Math.random()*n);
			}
			long date1 = System.currentTimeMillis(); //on lance le chrono
			Tri.triFusion(t); //on trie le tableau 
			long date2 = System.currentTimeMillis(); //on arrête le chrono
			tab_temps.add((int)(date2 - date1)); //on sauvegarde le temps
			System.out.println("Temps de calcul pour n="+n+" : "+ tab_temps.get(tab_temps.size()-1)+" millisecondes.");
		}
		
		// Affichage des mesures effectuées
		Graph g = new Graph(tab_tailles,tab_temps);
		g.display();
		
		
		// Régression manuelle 
		double a=0; 
		Scanner in = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("Attention ! les nombres décimaux doivent utiliser une virgule (et pas un point) !");
		System.out.println("------------------------------------------");
		do {
			System.out.print("Entrez le coefficient de la droite/parabole/nLogn : ");
			if (in.hasNextDouble()) {
				a = in.nextDouble();
				//g.addLine(a);
				//g.addQuadratic(a);
				g.addnLogn(a);
			}
			else
				System.out.println(in.next()+" n'a pas été reconnu comme un double.");
		} while(a!=-1);
		in.close();
	}

}
