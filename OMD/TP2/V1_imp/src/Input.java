import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Input implements KeyListener {

private static Input singleton;

char key = ' ';

InsertChar insert = new InsertChar();
Delete delete = new Delete();
MoveCursor1 leftCursor1 = new MoveCursor1(-1);
MoveCursor1 rightCursor1 = new MoveCursor1(1);


protected Input(){

}

public static Input getInstance(){
    if(singleton == null){
        singleton = new Input();
    }
    return singleton;
}





@Override
public void keyPressed(KeyEvent e) {

    // la touche backspace appele la commande delete
    if(e.getKeyCode() == 8){
        delete.Execute();
    }
    else if(e.getModifiers() == e.CTRL_MASK && e.getKeyCode() == 67){
    
        System.out.println("copier");
    }
    else if(((e.getKeyCode() >= 44 && e.getKeyCode()<= 111) || e.getKeyCode()==32) && e.getModifiers() == 0){
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