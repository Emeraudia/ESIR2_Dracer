import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void permutation(String target, String original,boolean afficher){
	    int i;
	    String target1, original1;
	    if (original.length() == 0 && afficher){
	        System.out.println(target);
	    }
		else {
			i = 0;
			while (i < original.length()){
			    target1 = target + original.substring(i,i+1);
			    original1 = original.substring(0,i) + original.substring(i+1,original.length());
			    permutation(target1,original1,afficher);
			    i = i + 1;
			}
		} 
	}
	public static void main(String[] args) {
		String x="";
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n=0;
		String y=alphabet.substring(0, n);

		int iter = 10;

		List<Integer> tab_tailles = new ArrayList<Integer>();
		List<Integer> tab_temps = new ArrayList<Integer>();
		for(int i = 0 ; i < iter; i++){
			tab_tailles.add(i); //on sauvegarde la taille
			y=alphabet.substring(0, i);

			long date1 = System.currentTimeMillis(); //on lance le chrono
			permutation(x,y,false);
			long date2 = System.currentTimeMillis(); //on arrête le chrono

			tab_temps.add((int)(date2 - date1)); //on sauvegarde le temps
			System.out.println("Temps de calcul pour iter="+i+" : "+ tab_temps.get(tab_temps.size()-1)+" millisecondes.");
		} 
		
		Graph g = new Graph(tab_tailles,tab_temps);
		g.display();
	}

}
