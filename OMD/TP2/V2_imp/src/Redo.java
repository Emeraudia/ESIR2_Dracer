/**
 * Classe pour la commande "Refaire"
 */
public class Redo implements Command {

    @Override
    public void Execute() {
        History.getInstance().redo();
    }
}
