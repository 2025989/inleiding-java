package h06_Numbers;

import java.applet.Applet;
import java.awt.Graphics;

public class H06_Final_Average extends Applet{

	double average = (double) (int) ((5.9 + 6.3 + 6.9) / 0.3)/10;
	
	public void init() {
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Het gemiddelde is: " + average, 20, 20);
	}
	
	
}
