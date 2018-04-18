import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class JColorFrame extends JFrame implements ActionListener
{
   private JButton centerButton = new JButton("Change the color");
   private JPanel topPanel = new JPanel();
   private JLabel topLabel = new JLabel("Top",JLabel.CENTER);
   private JPanel bottomPanel = new JPanel();
   private JLabel bottomLabel = new JLabel("Bottom",JLabel.CENTER);
   private JPanel rightPanel = new JPanel();
   private JLabel rightLabel = new JLabel("Right");
   private JPanel leftPanel = new JPanel();
   private JLabel leftLabel = new JLabel("Left");
   private int click = 0;
  
   public static void main(String[] args)
   {
       JColorFrame frame=new JColorFrame();
       frame.setSize(350, 350);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }

   public JColorFrame()
   {
       setTitle("JColorFrame");
       setLayout(new BorderLayout());
       add(centerButton,BorderLayout.CENTER);
       topPanel.add(topLabel);  
       add(topPanel,BorderLayout.NORTH);
       bottomPanel.add(bottomLabel);
       add(bottomPanel,BorderLayout.SOUTH);
       rightPanel.setLayout(new BorderLayout());
       rightPanel.add(rightLabel,BorderLayout.CENTER);
       add(rightPanel,BorderLayout.EAST);
       leftPanel.setLayout(new BorderLayout());
       leftPanel.add(leftLabel);
       add(leftPanel,BorderLayout.WEST);
       centerButton.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)//Cycling through colors
   {
       if(click%5==0)
           topPanel.setBackground(Color.green);
       else if(click%5==1)
           rightPanel.setBackground(Color.red);
       else if(click%5==2)
           leftPanel.setBackground(Color.yellow);
       else if(click%5==3)
           bottomPanel.setBackground(Color.blue);
       else
       {
           rightPanel.setBackground(Color.white);
           bottomPanel.setBackground(Color.white);
           topPanel.setBackground(Color.white);
           leftPanel.setBackground(Color.white);
       }
       ++click;
   }

}