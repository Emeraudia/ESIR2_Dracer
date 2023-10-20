import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Script {
    private static Script instance;
    private ArrayList<KeyEvent> listScript;
    protected Script(){
        listScript = new ArrayList<KeyEvent>();
    }

    public static Script getInstance() {
        if(instance == null) instance = new Script();
        return instance;
    }

    public void add(KeyEvent e){
        listScript.add(e);
    }

    public void newScript(){
        listScript = new ArrayList<KeyEvent>();
    }

    public void Execute(){
        Input input = Input.getInstance();
        for(int i = 0 ; i < listScript.size() ; i++){
            input.keyPressed(listScript.get(i));
        }
    }
}
