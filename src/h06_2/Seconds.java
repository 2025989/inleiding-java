package h06_2;

import java.applet.Applet;
import java.awt.Graphics;

public class Seconds extends Applet{

	int second = 1;
	int minute = 60 * second;
	int hour = 60 * minute;
	int day = 24 * hour;
	int year = (int) (365.25 * day);
	
	public void init() {
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Er zitten " +hour+ " seconden in een uur.", 20, 20);
		g.drawString("Er zitten " +day+ " seconden in een dag.", 20, 35);
		g.drawString("Er zitten gemiddeld " +year+ " seconden in een jaar, als je rekening houdt met schrikkeljaren.", 20, 50);
	}
	
}
