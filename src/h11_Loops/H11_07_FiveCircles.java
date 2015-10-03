package h11_Loops;

import java.applet.Applet;
import java.awt.Graphics;

public class H11_07_FiveCircles extends Applet {

	public void init() {
		setSize(210,210);
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		int sz = getHeight()/30;
		for (int i = 1; i <= 5; i++) {
			g.drawOval(x/2-sz*i, y/2-sz*i, 1+sz*2*i, 1+sz*2*i);
		}
	}

}