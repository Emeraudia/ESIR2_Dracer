import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Input implements KeyListener {


@Override
public void keyPressed(KeyEvent e) {
    // TODO Auto-generated method stub
    System.out.println("The key Typed was: " + e.getKeyChar());
    
}

@Override
public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub
   
}

@Override
public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub
    
}
}