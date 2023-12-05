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

		/*
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
		ROBDD robdd2 = exp2.robdd();
		System.out.println(robdd2);
		System.out.println(robdd2.trouve_sat());

		*/

		//Partie 3
		int N = 5;
		Expression reineExp = nreine(N);
		ROBDD robddReine = reineExp.robdd();
		//System.out.println(robddReine);
		printSatQueen(robddReine.trouve_sat(),N);
		
	}


	public static Expression nreine(int N){
		Expression parLigne = new Constante(true);
		Expression reineLigne = new Constante(true);
		Expression reineColonne = new Constante(true);
		Expression reineDiagonal_1 = new Constante(true);
		Expression reineDiagonal_2 = new Constante(true);

		for(int i = 0 ; i < N ; i++){
			Expression tmpLigne = new Constante(false);
			Expression tmpReineLigne = new Constante(true);
			Expression tmpReineColonne = new Constante(true);
			Expression tmpReineDiagonal_1 = new Constante(true);
			Expression tmpReineDiagonal_2 = new Constante(true);
			for(int j = 0 ; j < N ; j++){
				tmpLigne = new Ou(new Atome(i+" "+j), tmpLigne);
				Expression tmpReineLigneTmp = new Constante(true);
				Expression tmpReineColonneTmp = new Constante(true);
				Expression tmpReineDiagonalTmp_1 = new Constante(true);
				Expression tmpReineDiagonalTmp_2 = new Constante(true);
				for(int k = 0 ; k < N ; k++){
					if(k != j){
						tmpReineLigneTmp = new Et(new Non(new Atome(i+" "+k)), tmpReineLigneTmp);
					}
					if(k != i){
						tmpReineColonneTmp = new Et(new Non(new Atome(k+" "+j)), tmpReineColonneTmp);
					}
					if(i-k>0 && j-k > 0 && k>0){
						tmpReineDiagonalTmp_1 = new Et(new Non(new Atome((i-k)+" "+(j-k))), tmpReineDiagonalTmp_1);
					}
					if(i-k>0 && j+k < N && k>0){
						tmpReineDiagonalTmp_2 = new Et(new Non(new Atome((i-k)+" "+(j+k))), tmpReineDiagonalTmp_2);
					}
				}
				
				tmpReineLigneTmp = new Implique(new Atome(i+" "+j), tmpReineLigneTmp);
				tmpReineLigne = new Et(tmpReineLigneTmp, tmpReineLigne);
				tmpReineColonneTmp = new Implique(new Atome(i+" "+j), tmpReineColonneTmp);
				tmpReineColonne = new Et(tmpReineColonneTmp, tmpReineColonne);

				tmpReineDiagonalTmp_1 = new Implique(new Atome(i+" "+j), tmpReineDiagonalTmp_1);
				tmpReineDiagonal_1 = new Et(tmpReineDiagonalTmp_1, tmpReineDiagonal_1);
				tmpReineDiagonalTmp_2 = new Implique(new Atome(i+" "+j), tmpReineDiagonalTmp_2);
				tmpReineDiagonal_2 = new Et(tmpReineDiagonalTmp_2, tmpReineDiagonal_2);
			}
			parLigne = new Et(tmpLigne, parLigne);
			reineLigne = new Et(tmpReineLigne,reineLigne);
			reineColonne = new Et(tmpReineColonne, reineColonne);
			reineDiagonal_1 = new Et(tmpReineDiagonal_1, reineDiagonal_1);
			reineDiagonal_2 = new Et(tmpReineDiagonal_2, reineDiagonal_2);
		}
		parLigne = parLigne.simplifier();
		reineColonne = reineColonne.simplifier();
		reineLigne = reineLigne.simplifier();
		reineDiagonal_1 = reineDiagonal_1.simplifier();
		reineDiagonal_2 = reineDiagonal_2.simplifier();
		Expression exp = new Et(new Et(new Et(reineLigne, reineColonne), new Et(reineDiagonal_1, reineDiagonal_2)), parLigne);
		return exp;
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
					System.out.print("X");
				else
					System.out.print(".");
			}
			System.out.println();
		}
	} 

}
