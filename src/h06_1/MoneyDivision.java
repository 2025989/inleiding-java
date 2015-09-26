package h06_1;

import java.applet.Applet;
import java.awt.Graphics;

public class MoneyDivision extends Applet{
	
	public void init() {
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Jan krijgt €" + (double) 113/4, 20, 20);
		g.drawString("Ali krijgt €" + (double) 113/4, 20, 35);
		g.drawString("Jeanette krijgt €" + (double) 113/4, 20, 50);
		g.drawString("Daniel krijgt €" + (double) 113/4, 20, 65);
	}
	
}
