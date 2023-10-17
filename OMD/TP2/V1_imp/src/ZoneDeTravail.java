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
    public static ZoneDeTravail getInstance()
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
            if(m_posCursor1 < 0) m_posCursor1 = 0;
            if(m_posCursor1 > m_Texte.length()) m_posCursor1 = m_Texte.length();
        }
        else {
            m_posCursor2 += offset;
            if(m_posCursor2 <= 0) m_posCursor2 = 0;
            if(m_posCursor2 > m_Texte.length()) m_posCursor2 = m_Texte.length();
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
        if(!m_Buffer.equals("")) {
            if(m_posCursor1 == m_Texte.length()) m_Texte = m_Texte.substring(0, m_posCursor1) + m_Buffer;
            else m_Texte = m_Texte.substring(0, m_posCursor1) + m_Buffer + m_Texte.substring(m_posCursor1);
        }
        moveCursor(1, m_Buffer.length());
    }

    /**
     * supprime le contenue du texte entre les 2 curseurs
     * si les curseurs sont au meme endroit, supprime le caractere precedent
     */
    public void delete()
    {
        int minPos = Math.min(m_posCursor1,m_posCursor2);
        int maxPos = Math.max(m_posCursor1,m_posCursor2);
        m_Texte = m_Texte.substring(0, minPos) + m_Texte.substring(maxPos);
        m_posCursor1 = minPos;
        m_posCursor2 = minPos;
    }

    /**
     * Insert un caractere a la position du curseur
     * /!\ la position des curseurs doivent etre confondue
     * @param a le caractere a ajouter
     */
    public void InsertChar(char a)
    {
        if(m_posCursor1 == m_Texte.length()) m_Texte = m_Texte.substring(0, m_posCursor1) + a ;
        else m_Texte = m_Texte.substring(0, m_posCursor1) + a + m_Texte.substring(m_posCursor1);



        moveCursor(1, 1);
    }

    /**
     * 
     * @return le contenu du texte
     */
    public String getTexte()
    {
        return m_Texte;
    }

    public int getCursor1position()
    {
        return m_posCursor1;
    }

    public int getCursor2position()
    {
        return m_posCursor2;
    }
}
