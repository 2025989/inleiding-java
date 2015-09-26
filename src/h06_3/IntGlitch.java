package h06_3;

import java.applet.Applet;
import java.awt.Graphics;

public class IntGlitch extends Applet{
	
	int glitch = 2147483647 + 1;
	
	public void init() {
		
	}
	
	public void paint(Graphics g) {
		g.drawString("" + glitch, 20, 20);
	}

}
