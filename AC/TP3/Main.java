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
		Expression reineExp = nreine(5);
		ROBDD robddReine = reineExp.robdd();
		//System.out.println(robddReine);
		System.out.println(robddReine.trouve_sat());
		
	}


	public static Expression nreine(int N){
		Expression parLigne = new Constante(true);
		Expression reineLigne = new Constante(true);
		Expression reineColonne = new Constante(true);

		for(int i = 0 ; i < N ; i++){
			Expression tmpLigne = new Constante(false);
			Expression tmpReineLigne = new Constante(true);
			Expression tmpReineColonne = new Constante(true);
			for(int j = 0 ; j < N ; j++){
				tmpLigne = new Ou(new Atome(i+" "+j), tmpLigne);
				Expression tmpReineLigneTmp = new Constante(true);
				Expression tmpReineColonneTmp = new Constante(true);
				for(int k = 0 ; k < N ; k++){
					if(k != j){
						tmpReineLigneTmp = new Et(new Non(new Atome(i+" "+k)), tmpReineLigneTmp);
					}
					if(k != i){
						tmpReineColonneTmp = new Et(new Non(new Atome(k+" "+j)), tmpReineColonneTmp);
					}
				}
				
				tmpReineLigneTmp = new Implique(new Atome(i+" "+j), tmpReineLigneTmp);
				tmpReineLigne = new Et(tmpReineLigneTmp, tmpReineLigne);
				tmpReineColonneTmp = new Implique(new Atome(i+" "+j), tmpReineColonneTmp);
				tmpReineColonne = new Et(tmpReineColonneTmp, tmpReineColonne);
			}
			parLigne = new Et(tmpLigne, parLigne);
			reineLigne = new Et(tmpReineLigne,reineLigne);
			reineColonne = new Et(tmpReineColonne, reineColonne);
		}
		parLigne = parLigne.simplifier();
		reineColonne = reineColonne.simplifier();
		reineLigne = reineLigne.simplifier();
		Expression exp = new Et(new Et(reineLigne, reineColonne), parLigne);
		return exp;
	}
}
