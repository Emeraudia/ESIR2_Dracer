import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe pour la gestion de la fenetre
 */
public class Window {

  /** Pattern design "Singleton" */
  private static Window s_singleton;

  private JFrame m_frame;
  private JLabel m_label;

  protected Window() {
    m_frame = new JFrame("App");
    m_frame.setLayout(new BoxLayout(m_frame.getContentPane(), BoxLayout.Y_AXIS));
    m_frame.setSize(500, 500);

    m_label = new JLabel();

    printToWindow();
    m_frame.addKeyListener(Input.getInstance());
    m_frame.setResizable(false);
    m_frame.setSize(800, 600);
    m_frame.add(m_label);
    m_frame.setVisible(true);
    m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

  /** Recupere l'instance du singleton */
  public static Window getInstance() {
    if (s_singleton == null) {
      s_singleton = new Window();
    }
    return s_singleton;
  }

  /** Actualise la fenetre */
  public void update() {
    printToWindow();
  }

  private void printToWindow() {
    ZoneDeTravail insDeTravail = ZoneDeTravail.getInstance();
    String txt = insDeTravail.getTexte();
    int pos1 = insDeTravail.getCursor1position();
    int pos2 = insDeTravail.getCursor2position();
    String newTxt = "";
    newTxt += "<html>";
    for (int i = 0; i < txt.length() + 1; i++) {
      if (i == pos1)
        newTxt += '|';
      else if (i == pos2)
        newTxt += '|';
      if (i < txt.length())
        newTxt += txt.charAt(i);
    }
    newTxt += "</html>";
    m_label.setText(newTxt);
  }

}
