/**
 * Classe pour la commande "Supprimer"
*/
public class Delete implements Command  {

    @Override
    /**
     * Supprime la zone de texte
     */
    public void Execute() {
        ZoneDeTravail.getInstance().delete();
    }
}
