import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {

  private JLabel l;
  private JFrame f;
  private static Window singleton;

  protected Window() {
    f = new JFrame("App");
    f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
    f.setSize(500, 500);

    l = new JLabel();
    printToWindow();
    f.add(l);
    f.setVisible(true);
    f.addKeyListener(Input.getInstance());

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static Window getInstance() {
    if (singleton == null) {
      singleton = new Window();
    }
    return singleton;
  }

  public void update() {
    printToWindow();
  }

  private void printToWindow(){
      ZoneDeTravail insDeTravail = ZoneDeTravail.getInstance();
        
      String txt = insDeTravail.getTexte();
      int pos1 = insDeTravail.getCursor1position();
      int pos2 = insDeTravail.getCursor2position();

      String newTxt = "";
      for(int i = 0 ; i < txt.length()+1 ; i++){
        if(i == pos1) newTxt += '|';
        else if(i == pos2) newTxt += '|';
        if(i < txt.length())newTxt += txt.charAt(i);
      }
      l.setText(newTxt);
  }

}
