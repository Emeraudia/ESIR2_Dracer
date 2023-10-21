/**
 * Classe pour la commande "Retour"
 */
public class Undo implements Command {

    @Override
    public void Execute() {
        History.getInstance().undo();
    }
}
