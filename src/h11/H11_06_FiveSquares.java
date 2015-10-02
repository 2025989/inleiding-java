package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class H11_06_FiveSquares extends Applet {

	public void init() {
		setSize(400,400);
	}
	
	public void paint(Graphics g) {
		int x = 20;
		int y = 20;
		
		for (int i = 1; i <= 5; i++) {
			g.drawRoundRect(x*i, y*i, 20, 20, 2, 2);
			if (i > 1) {g.drawLine(x*i, y*i, x*i, y*i);}
		}
	}

}