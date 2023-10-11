

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Window {

    JLabel l;
    JFrame f;
    
    
    public Window(Input key){
        f = new JFrame("Demo");
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
	    f.setSize(500, 500);
        
	    l = new JLabel();
	    l.setText("This is a demonstration");
	    f.add(l);
	    f.setVisible(true);
        f.addKeyListener(key);

       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void printToWindow(String s){
        l.setText(s);
  }
    
}
