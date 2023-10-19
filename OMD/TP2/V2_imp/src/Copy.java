public class Copy implements Command {
    
    public Copy() {
        
    }

    @Override
    /**
     * Copie la zone de texte selectionne
     */
    public void Execute() {
        ZoneDeTravail.getInstance().copy();
        History.getInstance().save();
    }
}
