import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Jdsc extends JFrame implements ActionListener, MouseListener {

   JMenuBar bar = new JMenuBar();
   JMenu menu1 = new JMenu("Buisiness");
   JMenu menu2 = new JMenu("Education");
   JMenu menu3 = new JMenu("Health Profession");
   JMenu menu4 = new JMenu("Liberal Arts");
   JMenu menu5 = new JMenu("Math & Science");
   JLabel label= new JLabel("Do something with the mouse");
   
   JMenuItem Overview = new JMenuItem("Overview");
   JMenuItem Degrees = new JMenuItem("Degrees and Programs");
   JMenuItem Overview2 = new JMenuItem("Overview");
   JMenuItem Degrees2 = new JMenuItem("Degrees and Programs");
   JMenuItem Overview3 = new JMenuItem("Overview");
   JMenuItem Degrees3 = new JMenuItem("Degrees and Programs");
   JMenuItem Overview4 = new JMenuItem("Overview");
   JMenuItem Degrees4 = new JMenuItem("Degrees and Programs");
   JMenuItem Overview5 = new JMenuItem("Overview");
   JMenuItem Degrees5 = new JMenuItem("Degress and Programs");
   
   JLabel label1 = new JLabel("  ");
   JLabel label2 = new JLabel("          ");
   JLabel label3 = new JLabel();
   
   

   Container con = getContentPane();
	
     
   public Jdsc() {
      super("Dalton State College");
      setLayout(new FlowLayout());
      
      setJMenuBar(bar);
      bar.add(menu1);
      bar.add(menu2);
      bar.add(menu3);
      bar.add(menu4);
      bar.add(menu5);
      
      menu1.add(Overview);
      menu1.add(Degrees);
      menu2.add(Overview2);
      menu2.add(Degrees2);
      menu3.add(Overview3);
      menu3.add(Degrees3);
      menu4.add(Overview4);
      menu4.add(Degrees4);
      menu5.add(Overview5);
      menu5.add(Degrees5);
      
      Overview.addActionListener(this);
      Degrees.addActionListener(this);
      Overview2.addActionListener(this);
      Degrees2.addActionListener(this);
      Overview3.addActionListener(this);
      Degrees3.addActionListener(this);
      Overview4.addActionListener(this);
      Degrees4.addActionListener(this);
      Overview5.addActionListener(this);
      Degrees5.addActionListener(this);
       addMouseListener(this);
      
      con.add(label1);
      con.add(label2);
      con.add(label3);
      label3.setFont(new Font("Arial", Font.ITALIC, 16));
      label2.setForeground(Color.BLUE);
     
      
      
     
  
      
      
   }

     
   public void actionPerformed(ActionEvent c) {
      Object source = c.getSource();
      String msg = " ";
      if (source == Overview)
         msg = "The School of Business at Dalton State College offers undergraduate business programs.";
        
      else if (source == Degrees)
         msg = "BBA Accounting BBA Finance and Applied Economics BBA Management";
      else if (source == Overview2)
         msg = "The School of Education's mission is to prepare future educators.";
      else if (source == Degrees2)
         msg = "Bachelor of Science Early Childhood Education";
      else if (source == Overview3)
         msg = "Students in the School of Health Professions enjoy working.";
      else if (source == Degrees3)
         msg = "We offer a bachelor’s degrees in Health Information Management.";
      else if (source == Overview4)
         msg = "Making up the majority of the core curriculum, our courses provide the foundation for future study and for lifelong learning. The School’s talented and creative faculty members are dedicated teachers, many of whom are also published scholars, researchers, poets, and writers. Whether sponsoring a campus organization, participating in intramural sports, volunteering in the Writing Lab, taking part in discussions offered by the Center for Academic Excellence, or participating in the DSC Literary Club, liberal arts faculty are committed to creating a positive learning environment that enriches the lives of our students and campus community.";
      else if (source == Degrees4)
         msg = "The School of Liberal Arts encompasses a wide array of disciplines.";
      else if (source == Overview5)
         msg = "Welcome to the home page of the School of Science, Technology and Mathematics.";
      else if (source == Degrees5)
         msg = "Biology, B.S. (Secondary Teacher Certification option)";
      else
         msg = "Tennis lessons available year round";
   
         label3.setText(msg);
         repaint();                 
   }

      public void mouseEntered(MouseEvent e)
   {
   
   String msg = " ";
   msg = "Welcome to Dalton State College.";
   label2.setText(msg);
   }
   public void mouseExited(MouseEvent e)
   {
  
   }
   public void mousePressed(MouseEvent e)
{
}
public void mouseReleased(MouseEvent e)
{
}
public void mouseMoved(MouseEvent e)
{
}
public void mouseDragged(MouseEvent e)
{
}
public void mouseClicked(MouseEvent e)
{
}

 public static void main(String[] args) {
      Jdsc window = new Jdsc( );
      window.setSize(800,300);
      window.setLocation(500, 250);
      window.setVisible(true);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}   

