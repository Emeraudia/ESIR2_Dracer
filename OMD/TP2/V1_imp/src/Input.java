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
MoveCursor2 leftCursor2 = new MoveCursor2(-1);
MoveCursor2 rightCursor2 = new MoveCursor2(1);


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
        ZoneDeTravail z = ZoneDeTravail.getInstance();
        if(z.getCursor1position() == z.getCursor2position()){
            z.moveCursor(0, -1);
        }
        delete.Execute();
    }
    else if(e.getModifiers() == e.CTRL_MASK && e.getKeyCode() == 67){
    
        System.out.println("copier");
        copy.Execute();
        
    }
    else if(e.getModifiers() == e.CTRL_MASK && e.getKeyCode() == 86){
    
        System.out.println("coller");
        paste.Execute();
    }
    else if(e.getModifiers() == e.CTRL_MASK && e.getKeyCode() == 88){
    
        System.out.println("couper");
        cut.Execute();
    }
    

    
    else if(e.getModifiers() == e.CTRL_MASK && e.getKeyCode() == 37)
    {
        leftCursor2.Execute();
    }
    else if(e.getKeyCode() == 37)
    {
        leftCursor1.Execute();
    }

    
    if(e.getModifiers() == e.CTRL_MASK && e.getKeyCode() == 39)
    {
        rightCursor2.Execute();
    }
    else if(e.getKeyCode() == 39)
    {
        rightCursor1.Execute();
    }


    else if(((e.getKeyCode() >= 44 && e.getKeyCode()<= 111) || e.getKeyCode()==32) && (e.getModifiers() == 0 || e.getModifiers() == e.SHIFT_MASK)){
        key = e.getKeyChar();
        insert.Execute();
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