import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Input implements KeyListener {

char key = ' ';
private static Input singleton;

protected Input(){

}

public static Input getInstance(){
    if(singleton == null){
        singleton = new Input();
    }
    return singleton;
}

InsertChar insert = new InsertChar();
MoveCursor1 leftCursor1 = new MoveCursor1(-1);
MoveCursor1 rightCursor1 = new MoveCursor1(1);


@Override
public void keyPressed(KeyEvent e) {


    if((e.getKeyCode() >= 65 && e.getKeyCode()<= 90) || (e.getKeyCode() >= 97 && e.getKeyCode()<= 122) ){
        key = e.getKeyChar();
        insert.Execute();
    }

    if(e.getKeyCode() == 37)
    {
        leftCursor1.Execute();
    }

    if(e.getKeyCode() == 39)
    {
        rightCursor1.Execute();
    }
    
    Window.getInstance().update();
    
}

@Override
public void keyReleased(KeyEvent e) {
   
}

@Override
public void keyTyped(KeyEvent e) {
    
}

public char getKey(){
    return key;
}

}