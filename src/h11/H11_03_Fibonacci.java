package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class H11_03_Fibonacci extends Applet {
	
	public void init() {
		setSize(1200, 230);
	}
	
	public void paint(Graphics g) {
		int y = 20;
		long a = 1;
		long b = 0;
		long c = 0;
		for (int i = 0; i < 100; i++) {
			c = a + b;
			if (i*200 > 1000 && y < 230) {y += 15; i = 0;}
			if (!(i*200 > 1000)) {g.drawString(""+ c, 20+i*200, y);}
			a = b;
			b = c;
		}
	}

}
