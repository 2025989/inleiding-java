package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class H11_02_Countdown extends Applet {
	
	public void init() {
		setSize(400, 400);
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		for (int iCount = 20; iCount > 10; iCount--) {
			g.drawString(""+ iCount, x/11+(x/11*(20-iCount)), y/2);
		}
	}
	
	
}
