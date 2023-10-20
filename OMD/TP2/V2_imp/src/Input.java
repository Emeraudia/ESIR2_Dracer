import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Classe pour la gestion des evenements des touches
 */
class Input implements KeyListener {

    /** Pattern design "Singleton" */
    private static Input singleton;

    private char key;
    boolean saveInput = false;
    Script script = Script.getInstance();

    // Commandes disponibles
    private Command insert;
    private Command delete;
    private Command copy;
    private Command paste;
    private Command cut;
    private Command leftCursor1;
    private Command rightCursor1;
    private Command leftCursor2;
    private Command rightCursor2;
    private Command useScript;
    private Command undo;
    private Command forward;

    protected Input() {
        key = ' ';

        insert = new InsertChar();
        delete = new Delete();
        copy = new Copy();
        paste = new Paste();
        cut = new Cut();
        leftCursor1 = new MoveCursor1(-1);
        rightCursor1 = new MoveCursor1(1);
        leftCursor2 = new MoveCursor2(-1);
        rightCursor2 = new MoveCursor2(1);
        useScript = new UseScript();
        undo = new Undo();
        forward = new Redo();
    }

    /** Recupere l'instance du singleton */
    public static Input getInstance() {
        if (singleton == null) {
            singleton = new Input();
        }
        return singleton;
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (saveInput && e.getExtendedKeyCode() != KeyEvent.VK_F1) {
            script.add(e);
        }

        // Pas de modifier (Ctrl, Alt, Shift, ...)
        if (e.getModifiersEx() == 0) {

            // Touche Retour Arriere
            if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                // Commande delete
                ZoneDeTravail z = ZoneDeTravail.getInstance();
                if (z.getCursor1position() == z.getCursor2position())
                    z.moveCursor(0, -1);
                delete.Execute();
                History.getInstance().save();
            }

            // Fleche de gauche
            else if (e.getKeyCode() == KeyEvent.VK_LEFT)
                leftCursor1.Execute(); // Deplace le curseur vers la gauche

            // Fleche de droite
            else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                rightCursor1.Execute(); // Deplace le curseur vers la droite

            // Touche F1 (Rip moi c'est la touche de veille)
            else if (e.getExtendedKeyCode() == KeyEvent.VK_F1) {
                saveInput = !saveInput;
                if (saveInput)
                    script.newScript();
            }

            // Les caracteres possibles a inserer
            else if ((e.getKeyCode() >= KeyEvent.VK_COMMA && e.getKeyCode() <= KeyEvent.VK_DIVIDE)
                    || e.getKeyCode() == KeyEvent.VK_SPACE) {
                key = e.getKeyChar();
                insert.Execute();
                History.getInstance().save();
            }
        }
        // Touche Ctrl appuye
        else if (e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK) {
            // Crtl+C
            if (e.getKeyCode() == KeyEvent.VK_C) {
                copy.Execute(); // Copie
                History.getInstance().save();
            }

            // Ctrl+V
            else if (e.getKeyCode() == KeyEvent.VK_V) {
                paste.Execute(); // Coller
                History.getInstance().save();
            }

            // Ctrl+X
            else if (e.getKeyCode() == KeyEvent.VK_X) {
                cut.Execute(); // Couper
                History.getInstance().save();
            }

            // Ctrl+Fleche de gauche
            else if (e.getKeyCode() == KeyEvent.VK_LEFT)
                leftCursor2.Execute(); // Deplace le deuxieme curseur a gauche

            // Ctrl+Fleche de gauche
            else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                rightCursor2.Execute(); // Deplace le deuxieme curseur a droite

            // Ctrl+Z
            else if (e.getKeyCode() == KeyEvent.VK_Z)
                undo.Execute();

            // Ctrl+Y
            else if (e.getKeyCode() == KeyEvent.VK_Y)
                forward.Execute();

            // Crtl+F1
            else if (e.getExtendedKeyCode() == KeyEvent.VK_F1) {
                // Desactive l enregistrement de commandes
                saveInput = false;
                useScript.Execute();
            }
        }
        // Touche shift appuye
        else if (e.getModifiersEx() == KeyEvent.SHIFT_DOWN_MASK) {

            // Les caracteres possibles a inserer
            if ((e.getKeyCode() >= KeyEvent.VK_COMMA && e.getKeyCode() <= KeyEvent.VK_DIVIDE)
                    || e.getKeyCode() == KeyEvent.VK_SPACE) {
                key = e.getKeyChar();
                insert.Execute();
                History.getInstance().save();
            }
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