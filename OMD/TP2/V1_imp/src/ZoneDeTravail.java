public class ZoneDeTravail {
    private static ZoneDeTravail s_Instance;

    private String m_Texte;
    private String m_Buffer;
    private int m_posCursor1;
    private int m_posCursor2;

    //constructor
    protected ZoneDeTravail() 
    {
        m_Texte = "";
        m_Buffer = "";
        m_posCursor1 = 0;
        m_posCursor2 = 0;
    }

    /*
     * Singleton getInstance de la class
     */
    public ZoneDeTravail getInstance()
    {
        if(s_Instance == null){
            s_Instance = new ZoneDeTravail();
        }
        return s_Instance;
    }

    /**
     * Modifie la position d'un curseur
     * @param nbCursor 1 : Curseur principal, 2 : curseur secondaire
     * si les 2 curseurs sont confondus bouger le principal bouge aussi le secondaire
     * @param offset decalage (positif ou negatif) du curseur desire
     */
    public void moveCursor(int nbCursor, int offset){
        if(nbCursor == 1) {
            if(m_posCursor1 == m_posCursor2) moveCursor(2, offset);
            m_posCursor1 += offset;
            if(m_posCursor1 <= 0) m_posCursor1 = 0;
        }
        else {
            m_posCursor2 += offset;
            if(m_posCursor2 <= 0) m_posCursor2 = 0;
        }
    }

    
    /**
     * Remplace le Buffer par le texte dans la sélection 
     * si les curseurs sont confondus, vide le buffer
     */
    public void copy()
    {
        if(m_posCursor1 != m_posCursor2){
            int minPos = Math.min(m_posCursor1,m_posCursor2);
            int maxPos = Math.max(m_posCursor1,m_posCursor2);
            m_Buffer = m_Texte.substring(minPos, maxPos);
        }
        else m_Buffer = "";
    }

    /**
     * Copie le contenu du buffer dans le texte
     * /!\ la position des curseurs doivent etre confondue
     */
    public void paste()
    {
        assert(m_posCursor1 == m_posCursor2);
        if(m_Buffer != "") m_Texte = m_Texte.substring(0, m_posCursor1) + m_Buffer + m_Texte.substring(m_posCursor1+1);
    }

    /**
     * supprime le contenue du texte entre les 2 curseurs
     */
    public void delete()
    {
        int minPos = Math.min(m_posCursor1,m_posCursor2);
        int maxPos = Math.max(m_posCursor1,m_posCursor2);
        m_Texte = m_Texte.substring(0, minPos) + m_Texte.substring(maxPos);
    }

    /**
     * Insert un caractere a la position du curseur
     * /!\ la position des curseurs doivent etre confondue
     * @param a le caractere a ajouter
     */
    public void InsertChar(char a)
    {
        m_Texte = m_Texte.substring(0, m_posCursor1) + a + m_Texte.substring(m_posCursor1+1);
    }

    /**
     * 
     * @return le contenu du texte
     */
    public String getTexte()
    {
        return m_Texte;
    }
}
