package h04_Final;

import java.awt.*;
import java.applet.*;

public class Shapes extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		g.drawLine(5, 10, 155, 10);
		g.drawString("Lijn", 60, 25);
		
		g.drawRect(5, 30, 150, 50);
		g.drawString("Rechthoek", 50, 95);
		g.drawRoundRect(5, 100, 150, 50, 30, 30);
		g.drawString("Afgeronde rechthoek", 25, 165);
		
		g.setColor(Color.magenta);
		g.fillRect(170, 30, 150, 50);
		g.setColor(Color.black);
		g.drawOval(170, 30, 150, 50);
		g.drawString("Gevulde rechthoek met ovaal", 165, 95);
		g.setColor(Color.magenta);
		g.fillOval(170, 100, 150, 50);
		g.setColor(Color.black);
		g.drawString("Gevulde ovaal", 205, 165);

		g.setColor(Color.magenta);
		g.fillArc(335, 30, 150, 50, 0, 45);
		g.setColor(Color.black);
		g.drawOval(335, 30, 150, 50);
		g.drawString("Taartpunt met ovaal eromheen", 335, 95);
		g.drawOval(385, 100, 50, 50);
		g.drawString("Cirkel", 395, 165);

	}
	
}
