public class ZoneDeTravail {
    private static ZoneDeTravail s_Instance;

    private String m_text;
    private String m_buffer;
    private int m_posCursor1;
    private int m_posCursor2;

    // constructor
    protected ZoneDeTravail() {
        m_text = "";
        m_buffer = "";
        m_posCursor1 = 0;
        m_posCursor2 = 0;
    }

    /** Recupere l'instance du singleton */
    public static ZoneDeTravail getInstance() {
        if (s_Instance == null) {
            s_Instance = new ZoneDeTravail();
            History.getInstance().save();
        }
        return s_Instance;
    }

    /**
     * Modifie la position d'un curseur
     * 
     * @param nbCursor 1 : Curseur principal, 2 : curseur secondaire
     *                 si les 2 curseurs sont confondus bouger le principal bouge
     *                 aussi le secondaire
     * @param offset   decalage (positif ou negatif) du curseur desire
     */
    public void moveCursor(int nbCursor, int offset) {
        if (nbCursor == 1) {
            if (m_posCursor1 == m_posCursor2)
                moveCursor(2, offset);
            m_posCursor1 += offset;
            if (m_posCursor1 < 0)
                m_posCursor1 = 0;
            if (m_posCursor1 > getTexte().length())
                m_posCursor1 = getTexte().length();
        } else {
            m_posCursor2 += offset;
            if (m_posCursor2 <= 0)
                m_posCursor2 = 0;
            if (m_posCursor2 > getTexte().length())
                m_posCursor2 = getTexte().length();
        }

    }

    /**
     * Remplace le Buffer par le texte dans la sélection
     * si les curseurs sont confondus, vide le buffer
     */
    public void copy() {
        if (m_posCursor1 != m_posCursor2) {
            int minPos = Math.min(m_posCursor1, m_posCursor2);
            int maxPos = Math.max(m_posCursor1, m_posCursor2);
            m_buffer = getTexte().substring(minPos, maxPos);
        } else
            m_buffer = "";

    }

    /**
     * Copie le contenu du buffer dans le texte
     * /!\ la position des curseurs doivent etre confondue
     */
    public void paste() {
        assert (m_posCursor1 == m_posCursor2);
        if (!m_buffer.equals("")) {
            if (m_posCursor1 == getTexte().length())
                setTexte(getTexte().substring(0, m_posCursor1) + m_buffer);
            else
                setTexte(getTexte().substring(0, m_posCursor1) + m_buffer + getTexte().substring(m_posCursor1));
        }
        moveCursor(1, m_buffer.length());
    }

    /**
     * supprime le contenue du texte entre les 2 curseurs
     * si les curseurs sont au meme endroit, supprime le caractere precedent
     */
    public void delete() {
        int minPos = Math.min(m_posCursor1, m_posCursor2);
        int maxPos = Math.max(m_posCursor1, m_posCursor2);
        setTexte(getTexte().substring(0, minPos) + getTexte().substring(maxPos));
        m_posCursor1 = minPos;
        m_posCursor2 = minPos;
    }

    /**
     * Insert un caractere a la position du curseur
     * /!\ la position des curseurs doivent etre confondue
     * 
     * @param a le caractere a ajouter
     */
    public void InsertChar(char a) {
        if (m_posCursor1 == getTexte().length())
            setTexte(getTexte().substring(0, m_posCursor1) + a);
        else
            setTexte(getTexte().substring(0, m_posCursor1) + a + getTexte().substring(m_posCursor1));
        moveCursor(1, 1);
    }

    /**
     * Recupere le texte
     * 
     * @return le contenu du texte
     */
    public String getTexte() {
        return m_text;
    }

    private void setTexte(String text) {
        m_text = text;
    }

    public int getCursor1position() {
        return m_posCursor1;
    }

    public int getCursor2position() {
        return m_posCursor2;
    }

    public Memento save() {
        var copy = new ZoneDeTravail();
        copy.m_text = m_text;
        copy.m_posCursor1 = m_posCursor1;
        copy.m_posCursor2 = m_posCursor2;
        var state = new Save(copy);
        return state;
    }

    public void restore(Memento state) {
        var save = (Save) state;
        m_text = save.getState().m_text;
        m_posCursor1 = save.getState().m_posCursor1;
        m_posCursor2 = save.getState().m_posCursor2;
    }
}
