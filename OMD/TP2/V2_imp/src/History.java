import java.util.LinkedList;
import java.util.List;

/**
 * Classe caretaker pour le design pattern "Memento"
 */
public class History {
    /** Pattern design "Singleton" */
    private static History s_singleton;

    /** Position dans l'historique des etats sauvegardes */
    private int m_pos;

    /** Liste des etats sauvegardes */
    private List<Memento> m_history;

    protected History() {
        m_pos = 0;
        m_history = new LinkedList<Memento>();
    }

    /** Sauvegarde l'etat actuel */
    public void save() {
        while(m_history.size() > m_pos) {
            ((LinkedList<Memento>) m_history).removeLast();
        }
        m_history.add(ZoneDeTravail.getInstance().save());
        m_pos++;
    }

    /** Restaure l'etat precedent */
    public void undo() {
        // Si pas d'historique ou etat initial, ne rien faire
        if(m_pos <= 1) return;
        m_pos--;
        ZoneDeTravail.getInstance().restore(m_history.get(m_pos-1));
    }

    /** Restaure l'etat suivant */
    public void redo() {
        // Si pas d'action suivane
        if(m_pos == m_history.size()) return;
        m_pos++;
        ZoneDeTravail.getInstance().restore(m_history.get(m_pos-1));
    }

    /** Recupere l'instance du singleton */
    public static History getInstance() {
        if(s_singleton == null) {
            s_singleton = new History();
        }
        return s_singleton;
    }
}
