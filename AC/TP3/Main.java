import java.util.LinkedList;
import java.util.List;

import robdd.ROBDD;
import expression.*;

public class Main {

	public static void main(String[] args) {
		//EXEMPLE 
		// Expression exp = new Et(new Atome("x"),new Atome("y")); // représente (x ^ y)
		// System.out.println(exp.atomes()); // affiche la liste des atomes (=variables booléennes) présents dans exp
		// exp = exp.remplace("x",true); // exp vaut maintenant (true ^ y)
		// System.out.println(exp.evalue()); // <- erreur car (true ^ y) ne peut pas être évalué
		// exp = exp.remplace("y",false); // exp vaut maintenant (true ^ false)
		// System.out.println(exp.evalue());
		
		// //Affichage de l'arbre associé à l'expression exp pour l'ordre x > y 
		// List<String> ordre_atomes = new LinkedList<String>();
		// ordre_atomes.add("x");
		// ordre_atomes.add("y");
		// System.out.println("\n Arbre de exp : \n" + exp.arbre(ordre_atomes)); // <- que se passe-t-il ? 
		// Expression exp2 = new Et(new Atome("x"),new Atome("y")); // représente (x ^ y)
		// System.out.println("\n Arbre de exp2 : \n" + exp2.arbre(ordre_atomes));		

		Expression exp = new Et(new Equiv(new Atome("x1"), new Atome("y1")), new Equiv(new Atome("x2"), new Atome("y2")));
		System.out.println(exp.atomes());
		exp = exp.remplace("x1",false);
		exp = exp.remplace("y1",true);
		exp = exp.remplace("x2",false);
		exp = exp.remplace("y2",false);
		System.out.println(exp.evalue()); // (Faux <=> Vrai) ET (Faux <=> Faux)
		
		// Ex2	
		Expression exp1 = new Et(new Equiv(new Atome("x1"), new Atome("y1")), new Equiv(new Atome("x2"), new Atome("y2")));
		List<String> ordre_atomes = new LinkedList<String>();
		ordre_atomes.add("x1");
		ordre_atomes.add("x2");
		ordre_atomes.add("y1");
		ordre_atomes.add("y2");
		System.out.println("\n Arbre de exp : \n" + exp1.arbre(ordre_atomes));

		//Ex3
		Expression trueE = new Constante(true);
		System.out.println(trueE.estFaux());
		trueE = new Non(new Constante(true));
		System.out.println(trueE.estFaux());

		//Ex5
		Expression exp2 = new Ou(new Equiv(new Atome("x"), new Atome("y")), new Et(new Atome("z"), new Atome("y")));
		//System.out.println(exp2.robdd());

		//Ex6
		int n = 4;
		printSatQueen(queenn(n).robdd().trouve_sat(), n);

	}

	public static Expression queenn(int n) {
		// Au moins une ligne
		Expression ligne1p = new Constante(true);
		for (int i = 0; i < n; i++) {
			Expression ligne = new Constante(false);
			for (int j = 0; j < n; j++) {
				ligne = new Ou(ligne, new Atome(i + " " + j));
			}
			ligne1p = new Et(ligne1p, ligne);
		}

		// Pas plus d'une par ligne
		Expression ligne01 = new Constante(true);
		for (int j = 0; j < n; j++) {
			Expression ligneJ = new Constante(true);
			for (int i = 0; i < n; i++) {
				Expression caseIJ = new Atome(i + " " + j);
				for (int k = 0; k < n; k++) {
					if (k == i) continue;
					ligneJ = new Et(ligneJ, new Non(new Atome(k + " " + j)));
				}
				ligneJ = new Implique(caseIJ, ligneJ);
			}
			ligne01 = new Et(ligne01, ligneJ);
		}

		// Pas plus d'une par colonne
		Expression col01 = new Constante(true);
		for (int i = 0; i < n; i++) {
			Expression colI = new Constante(true);
			for (int j = 0; j < n; j++) {
				Expression caseIJ = new Atome(i + " " + j);
				for (int k = 0; k < n; k++) {
					if (k == j) continue;
					colI = new Et(colI, new Non(new Atome(i + " " + k)));
				}
				colI = new Implique(caseIJ, colI);
			}
			col01 = new Et(col01, colI);
		}

		// Pas plus d'une par diagonale

		
		return new Et(ligne1p, new Et(ligne01, col01));
	}

	public static void printSatQueen(String s, int n) {
		boolean[][] t = new boolean[n][n];
		String[] cases = s.split("\\[");
		for (String c : cases) {
			String[] infos = c.split(" ");
			if (infos.length <= 3) continue;
			int x = Integer.parseInt(infos[0]);
			int y = Integer.parseInt(infos[1]);
			t[x][y] = infos[3].charAt(0) == '1';
		}

		System.out.println();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++){
				if(t[i][j])
					System.out.print(".");
				else
					System.out.print("x");
			}
			System.out.println();
		}
	} 

}
