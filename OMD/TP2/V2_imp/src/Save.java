/**
 * Classe pour sauvegarde correspondant au "Concrete Memento" dans
 * le patron de conception "Mememto"
 */
public class Save implements Memento {
    private ZoneDeTravail m_state;

    public Save(ZoneDeTravail state) {
        m_state = state;
    }

    public ZoneDeTravail getState() {
        return m_state;
    }
}
