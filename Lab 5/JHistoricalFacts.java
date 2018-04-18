import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JHistoricalFacts extends JFrame implements ActionListener
{
   JLabel labels[] = new JLabel[5];
   private int count= 0;
   JLabel label = new JLabel("Predator was a neat movie from the 80's");
   JLabel label2 = new JLabel("The Matrix took place in the year 1999");
   JLabel label3 = new JLabel("Our America was founded in 1776Freedom");
   JLabel label4 = new JLabel("Paul Erdos was born in another country");
   JLabel label5 = new JLabel("Euler has even more theorems than Paul");
   JButton b1 = new JButton("Next Fact");
   JButton b2 = new JButton("Next Fact"); 
   JButton b3 = new JButton("Next Fact");
   JButton b4 = new JButton("Next Fact");
   JButton b5 = new JButton("Next Fact");
 
   final int WIDTH = 800;
   final int HEIGHT = 400;
   
   public static void main(String[] args)
   {
      JHistoricalFacts aframe = new JHistoricalFacts();
      aframe.setVisible(true);
      aframe.setLocationRelativeTo(null);
      
   }
   
   public JHistoricalFacts()
   {
      super("Historical Facts");
      setSize(WIDTH, HEIGHT);
      setLayout(new FlowLayout());
      add(label);
      add(b1);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
    
      
   }
   
   
public void actionPerformed(ActionEvent e) 
{ 
int click = 0;
 JHistoricalFacts aframe = new JHistoricalFacts();
Object source = e.getSource(); 
if(source == b1)
{
click++;
}

       if (source == b1)
         {
            label.setVisible(false);
            add(label2);
            remove(b1);
            add(b2);
            repaint();
         }
         else if(source == b2)
         {
         
         label2.setVisible(false);
         add(label3);
         remove(b2);
         add(b3);
         repaint();
         }
         else if(source == b3)
         {
         label3.setVisible(false);
         add(label4);
         remove(b3);
         add(b4);
         repaint();
         }
         else if(source == b4)
         {
         label4.setVisible(false);
         add(label5);
         remove(b4);
         add(b5);
         repaint();
         }
         else if(source == b5)
         {
         
         label5.setVisible(false);
         add(label);
         remove(b5);
         add(b1);
         label.setVisible(true);
         repaint();
         }


 }
      
      
   }
      
