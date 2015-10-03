package h11_Loops;

import java.applet.Applet;
import java.awt.Graphics;

public class H11_01_VerticalLines extends Applet {
	
	public void init() {
		setSize(400, 400);
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		for (int iLine = 0; iLine < 10; iLine++) {
			g.drawLine(x/11+(x/11*iLine), 20, x/11+(x/11*iLine), y-20);
		}
	}
	
	
}
