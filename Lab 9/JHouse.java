import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.applet.*;

// Program to draw a house
public class JHouse extends Applet 
{	
Color brown = new Color(156, 93, 82);
Color darkgreen = new Color(0, 100, 0);
Color darkergreen = new Color(0,50,0);
	public void paint(Graphics g) 
	{	
   //sun
		g.setColor(Color.yellow);
		g.fillOval(1000,20,100,100);
   //clouds
      g.setColor(Color.lightGray);
      g.fillOval(1100, 90, 300, 100);
      g.fillOval(1100, 80, 200, 100);
      g.fillOval(900,90,300,100);
      g.fillOval(900,70,200,100);
      g.fillOval(800,90,300,100);
   // Roof
		
      g.setColor(Color.black);
		int xs[] = {400,450,850,900};
		int ys[] = {400,275,275,400};
		Polygon poly = new Polygon(xs,ys,4);
		g.fillPolygon(poly);
   //chimey's
		g.setColor(Color.red);
		g.fillRect(825,245,20,30);
      g.setColor(Color.red);
		g.fillRect(500,245,20,30);
      g.setColor(Color.lightGray);
      g.fillOval(500, 230, 10,15);
      g.fillOval(500, 225, 5, 10);
      g.fillOval(500, 126, 5, 10);
      g.fillOval(500, 125, 10, 80);
      g.fillOval(501, 125, 10, 70);
      g.fillOval(502, 125, 10, 60);
      g.fillOval(504, 125, 50,10);

   // Body of house
		g.setColor(Color.blue);
		g.fillRect(400,400,500,200);
		
	// Door
		g.setColor(Color.darkGray);
		g.fillRect(625,500,50,100);
      //draw all the windows
      //left most windows
      g.setColor(Color.white);
      g.fillRect(450,430,20,20);
      g.fillRect(471,430,20,20);
      g.fillRect(450,451,20,20);
      g.fillRect(471,451,20,20);
      g.fillRect(450,472,20,20);
      g.fillRect(471,472,20,20);
      //inner left windows
      g.setColor(Color.white);
      g.fillRect(500,430,20,20);
      g.fillRect(521,430,20,20);
      g.fillRect(500,451,20,20);
      g.fillRect(521,451,20,20);
      g.fillRect(500,472,20,20);
      g.fillRect(521,472,20,20);
      //inner right windows
      g.setColor(Color.white);
      g.fillRect(775,430,20,20);
      g.fillRect(754,430,20,20);
      g.fillRect(775,451,20,20);
      g.fillRect(754,451,20,20);
      g.fillRect(775,472,20,20);
      g.fillRect(754,472,20,20);
      //right most windows
		g.setColor(Color.white);
      g.fillRect(825,430,20,20);
      g.fillRect(804,430,20,20);
      g.fillRect(825,451,20,20);
      g.fillRect(804,451,20,20);
      g.fillRect(825,472,20,20);
      g.fillRect(804,472,20,20);
		//trees
      g.setColor(brown);
      g.fillRect(200,300, 50, 800);
      g.setColor(darkgreen);
      g.fillOval(75, 100, 300, 300);
      g.setColor(darkergreen);
      g.fillOval(150, 150, 300, 300);
      g.fillOval(60, 150, 300, 300);
      g.setColor(darkgreen);
      g.fillOval(10, 150, 300, 300);
      //flowers
      g.setColor(Color.green);
      g.fillRect(500, 590, 2, 15);
      g.fillRect(505, 590, 2, 15);
      g.fillRect(510, 590, 2, 15);
      g.fillRect(800, 590, 2, 15);
      g.fillRect(805, 590, 2, 15);
      g.fillRect(810, 590, 2, 15);
      g.setColor(Color.pink);
      g.fillOval(498, 588, 5, 5);
      g.fillOval(503, 588, 5, 5);
      g.fillOval(507, 588, 5, 5);
      g.fillOval(797, 588, 5, 5);
      g.fillOval(802, 588, 5, 5);
      g.fillOval(807, 588, 5, 5);
      
		

	}
}
