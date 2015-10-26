package h13_Methods;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class H13_Final_01_Tree extends Applet {
	
	public void init() {
		setSize(800, 800);
	}
	
	public void paint(Graphics g) {
		drawTree(g, 300, 600);
	}
	
	void drawTree(Graphics g, int x, int y) {
		int d = y/150;
		int[] xPoints = {x, x+d, x-d*8, x+d*2, x+d*3, x+d*4, x+d*14, x+d*4, x+d*6};
		int[] yPoints = {y, y-d*14, y-d*34, y-d*18, y-d*36, y-d*25, y-d*34, y-d*22, y};
		g.setColor(new Color(185, 75, 5));
		g.fillPolygon(xPoints, yPoints, 9);
		g.setColor(Color.green);
		g.fillOval(x-d*14, y-d*39, d*17, d*13);
		g.fillOval(x-d*3, y-d*40, d*15, d*12);
		g.fillOval(x+d*4, y-d*39, d*15, d*11);
	}
}