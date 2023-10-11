public class Delete implements Command  {

    public Delete() {
    }

    @Override
    /**
     * Supprime la zone de texte
     */
    public void Execute() {
        ZoneDeTravail.getInstance().delete();
    }
}
