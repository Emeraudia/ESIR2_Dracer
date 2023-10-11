import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Input implements KeyListener {

private static Input singleton;

char key = ' ';

InsertChar insert = new InsertChar();
Delete delete = new Delete();
Copy copy = new Copy();
Paste paste = new Paste();
Cut cut = new Cut();
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

    
    if(e.getKeyCode() == 8){ // la touche backspace appele la commande delete
        delete.Execute();
    }
    else if(e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyCode() == 67){ // ctrl+c, lance la copie
        copy.Execute();
    }
    else if(e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyCode() == 76){ // ctrl+v, lance le collage
        paste.Execute();
    }
    else if(e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyCode() == 78){// ctrl+x, lance le coupage
        cut.Execute();
    }
    else if(((e.getKeyCode() >= 44 && e.getKeyCode()<= 111) || e.getKeyCode()==32) && e.getModifiers() == 0){// le reste des touches
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