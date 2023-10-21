/**
 * Classe pour la commande "Coller"
 */
public class Paste implements Command {
    private Command m_delete;

    public Paste() {
        m_delete = new Delete();
    }

    @Override
    /**
     * Colle la zone de texte copie dans la selection
     */
    public void Execute() {
        m_delete.Execute();
        ZoneDeTravail.getInstance().paste();
    }
}
