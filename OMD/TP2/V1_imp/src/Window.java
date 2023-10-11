

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Window {

    private JLabel l;
    private JFrame f;
    private static Window singleton;
    
    protected Window(){
        f = new JFrame("Demo");
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
	    f.setSize(500, 500);
        
	    l = new JLabel();
	    l.setText("This is a demonstration");
	    f.add(l);
	    f.setVisible(true);
        f.addKeyListener(Input.getInstance());

       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static Window getInstance(){
    if(singleton == null){
      singleton = new Window();
    }
    return singleton;
  }

  public void update(){
    printToWindow();
  }

  private void printToWindow(){
        l.setText(ZoneDeTravail.getInstance().getTexte());
  }
    
}
