/**
 * Classe pour la commandes "Copier"
 */
public class Copy implements Command {
    
    @Override
    /**
     * Copie la zone de texte selectionne
     */
    public void Execute() {
        ZoneDeTravail.getInstance().copy();
    }
}
