package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class H11_09_OneHundredAndEighty extends Applet {

	public void init() {
		setSize(800, 800);
	}
	
	public void paint(Graphics g) {
		int sz = 4;
		for (int i = 1; i <= 180; i++) {
			g.drawOval(sz, sz, sz*i-5, sz*i-5);
		}
	}

}