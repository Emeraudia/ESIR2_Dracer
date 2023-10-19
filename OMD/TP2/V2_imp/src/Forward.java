public class Forward implements Command {

    @Override
    public void Execute() {
        History.getInstance().forward();
    }
    
}
