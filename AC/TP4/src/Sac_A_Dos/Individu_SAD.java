package Sac_A_Dos;

import Algo_Genetiques.Individu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Individu_SAD implements Individu {

    private List<Boolean> stockage;
    private int capacite;
    private double[] poids;


    private Random rand;

    public Individu_SAD(int capacite, double[] poids) {
        this.capacite = capacite;
        this.poids = poids;
        this.rand = new Random();
        stockage = new ArrayList<>();
        for (int i = 0; i < poids.length; i++) {
            stockage.add(rand.nextBoolean());
        }
    }

    private Individu_SAD(Individu_SAD parent, Boolean copy_individu){
        this.capacite = parent.capacite;
        this.poids = parent.poids;
        this.rand = new Random();
        if(copy_individu) stockage = new ArrayList<>(parent.stockage);
        else stockage = new ArrayList<>();
    }

    /**
     * @return double : 
     *      < 0 : la capacite est depasser
     *      = 0 : la capacite est parafaitement remplie
     *      > 0 : la capacite n'est pas ateinte 
     */
    @Override
    public double adaptation() {
        int sum = 0;
        for(double i : poids){
            sum += i;
        }
        return capacite-sum;
    }

    @Override
    public Individu[] croisement(Individu conjoint) {
        Individu[] children = new Individu[2];
        children[0] = new Individu_SAD(this,false);
        children[1] = new Individu_SAD(((Individu_SAD)conjoint),false);

        int i = rand.nextInt(stockage.size());

        for (int j = 0; j < stockage.size(); j++) {
            if (j <= i) {
                ((Individu_SAD) children[0]).addList(this.stockage.get(j));
                ((Individu_SAD) children[1]).addList(((Individu_SAD) conjoint).stockage.get(j));
            } else {
                ((Individu_SAD) children[0]).addList(((Individu_SAD) conjoint).stockage.get(j));
                ((Individu_SAD) children[1]).addList(this.stockage.get(j));
            }

        }
        return children;
    }

    private void addList(boolean bit) {
        this.stockage.add(bit);
    }

    @Override
    public void mutation(double prob) {
        for (int i = 0; i < stockage.size(); i++) {
            if (rand.nextDouble() > prob)
                stockage.set(i, !stockage.get(i));
        }
    }

}
