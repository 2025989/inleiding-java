package h13_Methods;

import java.applet.Applet;
import java.awt.Graphics;

public class H13_02_Triangle extends Applet {
	
	public void init() {
		setSize(200, 200);
	}
	
	public void paint(Graphics g) {
		tekenDriehoek(g, 25, 125, 100, 25, 175, 125);
	}
	
	void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x1, y1);
	}

}
