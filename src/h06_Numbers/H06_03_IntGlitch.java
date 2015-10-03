package h06_Numbers;

import java.applet.Applet;
import java.awt.Graphics;

public class H06_03_IntGlitch extends Applet{
	
	int glitch = 2147483647 + 1;
	
	public void init() {
		
	}
	
	public void paint(Graphics g) {
		g.drawString("" + glitch, 20, 20);
	}

}
