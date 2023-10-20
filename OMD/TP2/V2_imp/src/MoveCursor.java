/**
 * Commande pour deplacer un curseur
 */
public abstract class MoveCursor implements Command {
    /** Curseur a deplacer */
    private int m_cursor;

    /** Valeur du deplacement du curseur */
    private int m_offset;

    /**
     * Commande abstraite pour le deplacement de curseur
     * 
     * @param cursor Numero du curseur
     * @param offset Nombre de caracteres lors du deplacement
     */
    public MoveCursor(int cursor, int offset) {
        m_cursor = cursor;
        m_offset = offset;
    }

    @Override
    /**
     * Deplace le curseur
     */
    public void Execute() {
        ZoneDeTravail.getInstance().moveCursor(m_cursor, m_offset);
    }
}
