public class UseScript implements Command{

    private Script script;

    public UseScript(){
        script = Script.getInstance();
    }

    @Override
    public void Execute() {
        script.Execute();
    }
    
}
