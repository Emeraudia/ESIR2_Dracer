public class Undo implements Command {

    @Override
    public void Execute() {
        History.getInstance().undo();
    }
    
}
