import java.util.LinkedList;
import java.util.List;

public class History {
    private static History s_singleton;
    private int m_pos;  
    private List<Memento> m_history;

    protected History() {
        m_pos = 0;
        m_history = new LinkedList<Memento>();
    }

    public void save() {
        while(m_history.size() > m_pos) {
            m_history.removeLast();
        }
        m_history.add(ZoneDeTravail.getInstance().save());
        m_pos++;
    }

    public void undo() {
        // Si pas d'historique ou etat initial, ne rien faire
        if(m_pos <= 1) return;
        m_pos--;
        ZoneDeTravail.getInstance().restore(m_history.get(m_pos-1));
    }

    public void forward() {
        // Si pas d'action suivane
        if(m_pos == m_history.size()) return;
        m_pos++;
        ZoneDeTravail.getInstance().restore(m_history.get(m_pos-1));
    }

    public static History getInstance() {
        if(s_singleton == null) {
            s_singleton = new History();
        }
        return s_singleton;
    }
}
