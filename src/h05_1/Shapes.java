package h05_1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Shapes extends Applet{

	Color fillColor;
	Color lineColor;
	int width;
	int height;
	int circle;
	
	public void init(){
		fillColor = Color.magenta;
		lineColor = Color.black;
		width = 150;
		height = 50;
		circle = 50;
	}
	
	public void paint(Graphics g){
		g.drawLine(5, 10, 155, 10);
		g.drawString("Lijn", 60, 25);
		
		g.drawRect(5, 30, width, height);
		g.drawString("Rechthoek", 50, 95);
		g.drawRoundRect(5, 100, width, height, 30, 30);
		g.drawString("Afgeronde rechthoek", 25, 165);
		
		g.setColor(fillColor);
		g.fillRect(170, 30, width, height);
		g.setColor(lineColor);
		g.drawOval(170, 30, width, height);
		g.drawString("Gevulde rechthoek met ovaal", 165, 95);
		g.setColor(fillColor);
		g.fillOval(170, 100, width, height);
		g.setColor(lineColor);
		g.drawString("Gevulde ovaal", 205, 165);

		g.setColor(fillColor);
		g.fillArc(335, 30, width, height, 0, 45);
		g.setColor(lineColor);
		g.drawOval(335, 30, width, height);
		g.drawString("Taartpunt met ovaal eromheen", 335, 95);
		g.drawOval(385, 100, circle, circle);
		g.drawString("Cirkel", 395, 165);

	}
	
}

