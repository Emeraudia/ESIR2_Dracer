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
    Undo undo;
    Forward forward;

    protected Input() {
        undo = new Undo();
        forward = new Forward();
    }

    public static Input getInstance() {
        if (singleton == null) {
            singleton = new Input();
        }
        return singleton;
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == 8) {// la touche backspace appele la commande delete
            ZoneDeTravail z = ZoneDeTravail.getInstance();
            if (z.getCursor1position() == z.getCursor2position()) {
                z.moveCursor(0, -1);
            }
            delete.Execute();
        } else if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyCode() == 67) { // ctrl+c, lance la copie
            copy.Execute();
        } else if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyCode() == 86) { // ctrl+v, lance le collage
            paste.Execute();
        } else if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyCode() == 88) {// ctrl+x, lance le coupage
            cut.Execute();
        }

        else if (e.getModifiers() == e.CTRL_MASK && e.getKeyCode() == 37)// ctrl+<-, curseur secondaire vers la gauche
        {
            leftCursor2.Execute();
        } else if (e.getKeyCode() == 37)// <-, curseur principal vers la gauche
        {
            leftCursor1.Execute();
        }

        else if (e.getModifiers() == e.CTRL_MASK && e.getKeyCode() == 39)// ctrl+->, curseur secondaire vers la droite
        {
            rightCursor2.Execute();
        } else if (e.getKeyCode() == 39)// ->, curseur principal vers la gauche
        {
            rightCursor1.Execute();
        } else if (e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getKeyCode() == KeyEvent.VK_Z) // ctrl+Z, commande retour
        {
            undo.Execute();
        } else if (e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getKeyCode() == KeyEvent.VK_Y) // ctrl+Y, commande avance
        {
            forward.Execute();
        }

        else if (((e.getKeyCode() >= 44 && e.getKeyCode() <= 111) || e.getKeyCode() == 32) && e.getModifiers() == 0) {// le
                                                                                                                      // reste
                                                                                                                      // des
                                                                                                                      // touches
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

    public char getKey() {
        return key;
    }

}