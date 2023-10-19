import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Input implements KeyListener {

private static Input singleton;

char key = ' ';
boolean saveInput = false;
Script script = Script.getInstance();

Command insert = new InsertChar();
Command delete = new Delete();
Command copy = new Copy();
Command paste = new Paste();
Command cut = new Cut();
Command leftCursor1 = new MoveCursor1(-1);
Command rightCursor1 = new MoveCursor1(1);
Command leftCursor2 = new MoveCursor2(-1);
Command rightCursor2 = new MoveCursor2(1);
Command useScript = new UseScript();

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
    if(saveInput && e.getExtendedKeyCode() != KeyEvent.VK_F1){
        script.add(e);
    }
    
    if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){// la touche backspace appele la commande delete
        ZoneDeTravail z = ZoneDeTravail.getInstance();
        if(z.getCursor1position() == z.getCursor2position()){
            z.moveCursor(0, -1);
        }
        delete.Execute();
    }
    else if(e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getKeyCode() == (int)('C')){ // ctrl+c, lance la copie
        copy.Execute();
    }
    else if(e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getKeyCode() == (int)('V')){ // ctrl+v, lance le collage
        paste.Execute();
    }
    else if(e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getKeyCode() == (int)('X')){// ctrl+x, lance le coupage
        cut.Execute();
    }
    else if(e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getKeyCode() == KeyEvent.VK_LEFT)// ctrl+<-, curseur secondaire vers la gauche
    {
        leftCursor2.Execute();
    }
    else if(e.getKeyCode() == KeyEvent.VK_LEFT)// <-, curseur principal vers la gauche
    {
        leftCursor1.Execute();
    }
    else if(e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getKeyCode() == KeyEvent.VK_RIGHT)// ctrl+->, curseur secondaire vers la droite
    {
        rightCursor2.Execute();
    }
    else if(e.getKeyCode() == KeyEvent.VK_RIGHT)// ->, curseur principal vers la gauche
    {
        rightCursor1.Execute();
    }
    else if(((e.getKeyCode() >= 44 && e.getKeyCode()<= 111) || e.getKeyCode()==38) && (e.getModifiersEx() == 0 || e.getModifiersEx() == KeyEvent.SHIFT_DOWN_MASK)){// le reste des touches
        key = e.getKeyChar();
        insert.Execute();

    }
    else if(e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getExtendedKeyCode() == KeyEvent.VK_F1){
        saveInput = false;
        useScript.Execute();
    }
    else if(e.getExtendedKeyCode() == KeyEvent.VK_F1) {
        saveInput = !saveInput;
        if(saveInput) script.newScript();
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