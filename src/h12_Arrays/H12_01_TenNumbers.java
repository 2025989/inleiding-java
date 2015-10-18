package h12_Arrays;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Locale;

public class H12_01_TenNumbers extends Applet {
	
	int[] numbers = {1, 64, -23, 2, -5, 239, -43, 0, 43, 151};
	
	public void init() {
		setSize(275, 200+15*numbers.length);
	}

	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		double avg = 0.0;
		
		for (int i = 0; i < numbers.length; i++) {
			g.drawString(""+ numbers[i], x/2, (y/2-15*numbers.length/2)+15*i);
			avg += numbers[i];
		}
		avg /= numbers.length;
		g.drawString("Het gemiddelde is "+ avg, x/2-50, (y/2+15*numbers.length/2)+10);
	}
	
}
