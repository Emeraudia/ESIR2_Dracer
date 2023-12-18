package Algo_Genetiques;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Population<Indiv extends Individu> {

	// Liste contenant les différents individus d'une génération
	private List<Indiv> population;

	/**
	 * construit une population à partir d'un tableau d'individu
	 */
	public Population(Indiv[] popu) {
		population = new ArrayList<Indiv>(popu.length);
		for (Indiv individu : popu) {
			population.add(individu);
		}
	}

	/**
	 * sélectionne un individu (sélection par roulette par exemple, cf TD)
	 * 
	 * @param adapt_totale somme des adaptations de tous les individus (pour ne pas
	 *                     avoir à la recalculer)
	 * @return indice de l'individu sélectionné
	 */
	public int selection(double adapt_totale) {
		int i = 0;

		double somme = 0;
		double somme_random = Math.random() * adapt_totale;
		// population.sort((i1, i2) -> {
		// 	return Double.compare(i1.adaptation(), i2.adaptation());
		// });
		do {
			somme += population.get(i).adaptation();
			i++;
		} while (somme < somme_random);
		return i - 1;
	}

	/**
	 * remplace la génération par la suivante
	 * (croisement + mutation)
	 * 
	 * @param prob_mut probabilité de mutation
	 */
	@SuppressWarnings("unchecked")
	public void reproduction(double prob_mut) {

		/***** on construit la nouvelle génération ****/
		List<Indiv> new_generation = new ArrayList<Indiv>();

		/* élitisme */
		new_generation.add((Indiv) individu_maximal().copy());
		new_generation.add((Indiv) individu_maximal().copy());
		new_generation.add((Indiv) individu_maximal().copy());

		// Adaptation Totale
		double adapt_totale = 0;
		for(Indiv individu : population)
			adapt_totale += individu.adaptation();


		// tant qu'on n'a pas le bon nombre
		while (new_generation.size() < population.size()-1) {
			// on sélectionne les parents
			Indiv papa =  population.get(selection(adapt_totale));
			Indiv maman = population.get(selection(adapt_totale));

			// ils se reproduisent
			// on les ajoute à la nouvelle génération
			for(Individu enfant: papa.croisement(maman)) {
				new_generation.add((Indiv)enfant);
			}
		}

		// on applique une éventuelle mutation à toute la nouvelle génération
		for(int i = 1 ; i < new_generation.size() ; i++) new_generation.get(i).mutation(prob_mut);

		// on remplace l'ancienne par la nouvelle
		population = new_generation;
	}

	/**
	 * renvoie l'individu de la population ayant l'adaptation maximale
	 */
	public Indiv individu_maximal() {
		Indiv individu_max = null;
		double adaptation_max = 0;
		for (Indiv individu : population) {
			double adaptation = individu.adaptation();
			if (individu_max == null || adaptation > adaptation_max) {
				adaptation_max = adaptation;
				individu_max = individu;
			}
		}
		return individu_max;
	}

	/**
	 * renvoie l'adaptation moyenne de la population
	 */
	public double adaptation_moyenne() {
		if (population.size() == 0)
			return 0;

		double somme = 0;
		for (Indiv individu : population) {
			somme += individu.adaptation();
		}

		return somme / (double) population.size();
	}

	/**
	 * renvoie l'adaptation maximale de la population
	 */
	public double adaptation_maximale() {
		double adaptation_max = 0;
		for (Indiv individu : population) {
			double adaptation = individu.adaptation();
			if (adaptation > adaptation_max) {
				adaptation_max = adaptation;
			}
		}
		return adaptation_max;
	}
}
