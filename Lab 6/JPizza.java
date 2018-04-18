import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener
{
  FlowLayout flow = new FlowLayout();
  JLabel companyName = new JLabel("Pizza Shop");
  JComboBox sizeBox = new JComboBox();
  JLabel sizeList = new JLabel("Size");
  JComboBox toppingBox = new JComboBox();
  JLabel toppingList = new JLabel("Toppings");
  JTextField totPrice = new JTextField(20);
  int totalCost = 0;
  int size, topping;
  double sPrice, tPrice, sumPrice;
  int[] sizePrice = {0,7,9,11,14};
  int[] toppingPrice = {0,0,5,5,5,5};
  String output;

  public JPizza()
  {
    super("Pizza Shop");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pane = new JPanel();
    pane.setLayout(flow);
    sizeBox.addItem("None");
    sizeBox.addItem("Small");
    sizeBox.addItem("Medium");
    sizeBox.addItem("Large");
    sizeBox.addItem("Extra large");
    toppingBox.addItem("None");
    toppingBox.addItem("Cheese");
    toppingBox.addItem("Pepperoni");
    toppingBox.addItem("Jalapenos");
    toppingBox.addItem("Mushroom");
    toppingBox.addItem("Anchovies");
    pane.add(sizeList);
    pane.add(sizeBox);
    sizeBox.addItemListener(this);
    pane.add(toppingList);
	pane.add(toppingBox);
    toppingBox.addItemListener(this);
    pane.add(companyName);
	pane.add(totPrice);
    setContentPane(pane);

  }
  public static void main(String[] arguments)
  {
    JPizza pframe = new JPizza();
  	pframe.setSize(400,200);
    pframe.setVisible(true);
    pframe.setLocationRelativeTo(null); 
  }

  public void itemStateChanged(ItemEvent list)
  {
      Object source = list.getSource();
      if (source == sizeBox)
      {
	   size = sizeBox.getSelectedIndex();
       sPrice = Double.parseDouble(sizePrice[size]);
       sumPrice = sPrice + tPrice;
       output = "Total Price $" + sumPrice;
       totPrice.setText(output);
	  }
	  else if (source == toppingBox)
	  {
	    topping = toppingBox.getSelectedIndex();
	    tPrice = toppingPrice[topping];
	    sumPrice = sPrice + tPrice;
	    output = "Total Price $" + sumPrice;
	    totPrice.setText(output);
	  }
  }
}