package h10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class H10_05_Grades extends Applet {
	
	TextField field = new TextField("", 5);
	Button button = new Button("OK");
	String cijfer = "";
	String gemiddelde = "";
	String geslaagd = "";
	int cijferCounter = 0;
	double totaal = 0;
	
	public void init() {
		setSize(500, 200);
		add(field); field.addActionListener(new InputListener());
		add(button); button.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		g.drawString(""+cijfer, x/2-100, y/2-5);
		g.drawString(""+gemiddelde, x/2-100, y/2+10);
		g.drawString(""+geslaagd, x/2-100, y/2+25);
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double input = Double.parseDouble(field.getText());
			if (input >= 01 && input <= 10) {
				if (Double.parseDouble(String.format(Locale.US, "%.1f", input)) >= 5.5) {
					if (input == (int) input) {cijfer = "Je hebt een "+ String.format("%.0f", input) +" behaald. Dit is voldoende.";}
					else {cijfer = "Je hebt een "+ String.format("%.1f", input) +" behaald. Dit is voldoende.";}
				}
				else {
					if (input == (int) input) {cijfer = "Je hebt een "+ String.format("%.0f", input) +" behaald. Dit is onvoldoende.";}
					else {cijfer = "Je hebt een "+ String.format("%.1f", input) +" behaald. Dit is onvoldoende.";}
				}
				cijferCounter++;
				totaal += Double.parseDouble(field.getText());
				if (totaal/cijferCounter == (int) totaal/cijferCounter) {gemiddelde = "Het gemiddelde van al je cijfers is: "+ String.format("%.0f", totaal/cijferCounter);}
				else {gemiddelde = "Het gemiddelde van al je cijfers is: "+ String.format("%.1f", totaal/cijferCounter);}
				if (Double.parseDouble(String.format(Locale.US, "%.1f", totaal/cijferCounter)) >= 5.5) {geslaagd = "Gefeliciteerd, je bent geslaagd!";}
				else {geslaagd = "Helaas, je bent niet geslaagd.";}
			}
			else {
				cijfer = "Syntax error.";
			}
			field.setText("");
			repaint();
		}
	}

}