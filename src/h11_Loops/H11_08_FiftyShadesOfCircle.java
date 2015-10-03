package h11_Loops;

import java.applet.Applet;
import java.awt.Graphics;

public class H11_08_FiftyShadesOfCircle extends Applet {

	public void init() {
		setSize(550, 550);
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		int sz = getHeight()/110;
		for (int i = 1; i <= 50; i++) {
			g.drawOval(x/2-sz*i, y/2-sz*i, 1+sz*2*i, 1+sz*2*i);
		}
	}

}