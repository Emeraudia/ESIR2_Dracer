import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Classe pour la gestion des evenements des touches
 */
class Input implements KeyListener {

    /** Pattern design "Singleton" */
    private static Input singleton;

    private char m_key;
    boolean m_saveInput = false;
    Script script = Script.getInstance();

    // Commandes disponibles
    private Command m_insert;
    private Command m_delete;
    private Command m_copy;
    private Command m_paste;
    private Command m_cut;
    private Command m_leftCursor1;
    private Command m_rightCursor1;
    private Command m_leftCursor2;
    private Command m_rightCursor2;
    private Command m_useScript;
    private Command m_undo;
    private Command m_forward;

    protected Input() {
        m_key = ' ';

        m_insert = new InsertChar();
        m_delete = new Delete();
        m_copy = new Copy();
        m_paste = new Paste();
        m_cut = new Cut();
        m_leftCursor1 = new MoveCursor1(-1);
        m_rightCursor1 = new MoveCursor1(1);
        m_leftCursor2 = new MoveCursor2(-1);
        m_rightCursor2 = new MoveCursor2(1);
        m_useScript = new UseScript();
        m_undo = new Undo();
        m_forward = new Redo();
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

        if (m_saveInput && e.getExtendedKeyCode() != KeyEvent.VK_F1) {
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
                m_delete.Execute();
                History.getInstance().save();
            }

            // Fleche de gauche
            else if (e.getKeyCode() == KeyEvent.VK_LEFT)
                m_leftCursor1.Execute(); // Deplace le curseur vers la gauche

            // Fleche de droite
            else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                m_rightCursor1.Execute(); // Deplace le curseur vers la droite

            // Touche F1 (Rip moi c'est la touche de veille)
            else if (e.getExtendedKeyCode() == KeyEvent.VK_F1) {
                m_saveInput = !m_saveInput;
                if (m_saveInput)
                    script.newScript();
            }

            // Les caracteres possibles a inserer
            else if ((e.getKeyCode() >= KeyEvent.VK_COMMA && e.getKeyCode() <= KeyEvent.VK_DIVIDE)
                    || e.getKeyCode() == KeyEvent.VK_SPACE) {
                m_key = e.getKeyChar();
                m_insert.Execute();
                History.getInstance().save();
            }
        }
        // Touche Ctrl appuye
        else if (e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK) {
            // Crtl+C
            if (e.getKeyCode() == KeyEvent.VK_C) {
                m_copy.Execute(); // Copie
                History.getInstance().save();
            }

            // Ctrl+V
            else if (e.getKeyCode() == KeyEvent.VK_V) {
                m_paste.Execute(); // Coller
                History.getInstance().save();
            }

            // Ctrl+X
            else if (e.getKeyCode() == KeyEvent.VK_X) {
                m_cut.Execute(); // Couper
                History.getInstance().save();
            }

            // Ctrl+Fleche de gauche
            else if (e.getKeyCode() == KeyEvent.VK_LEFT)
                m_leftCursor2.Execute(); // Deplace le deuxieme curseur a gauche

            // Ctrl+Fleche de gauche
            else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                m_rightCursor2.Execute(); // Deplace le deuxieme curseur a droite

            // Ctrl+Z
            else if (e.getKeyCode() == KeyEvent.VK_Z)
                m_undo.Execute();

            // Ctrl+Y
            else if (e.getKeyCode() == KeyEvent.VK_Y)
                m_forward.Execute();

            // Crtl+F1
            else if (e.getExtendedKeyCode() == KeyEvent.VK_F1) {
                // Desactive l enregistrement de commandes
                m_saveInput = false;
                m_useScript.Execute();
            }
        }
        // Touche shift appuye
        else if (e.getModifiersEx() == KeyEvent.SHIFT_DOWN_MASK) {

            // Les caracteres possibles a inserer
            if ((e.getKeyCode() >= KeyEvent.VK_COMMA && e.getKeyCode() <= KeyEvent.VK_DIVIDE)
                    || e.getKeyCode() == KeyEvent.VK_SPACE) {
                m_key = e.getKeyChar();
                m_insert.Execute();
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

    public char getM_key() {
        return m_key;
    }

}