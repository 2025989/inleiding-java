package h11_Loops;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_09_OneHundredAndEighty extends Applet {

	Label label = new Label("Hoeveel cirkels wil je zien? (minimaal 100)");
	TextField input = new TextField("180", 5);
	Button ok = new Button("OK");
	int amt = Integer.parseInt(input.getText());
	
	public void init() {
		setSize(800, 800);
		add(label);
		add(input); input.addActionListener(new InputListener());
		add(ok); ok.addActionListener(new InputListener());
	}

	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		int sz = (y-10)/amt;
		for (int i = 1; i <= amt; i++) {
			if ((i+6) % 7 == 0) {g.setColor(Color.red);}
			if ((i+5) % 7 == 0) {g.setColor(Color.orange);}
			if ((i+4) % 7 == 0) {g.setColor(Color.yellow);}
			if ((i+3) % 7 == 0) {g.setColor(Color.green);}
			if ((i+2) % 7 == 0) {g.setColor(Color.blue);}
			if ((i+1) % 7 == 0) {g.setColor(Color.magenta);}
			if ((i+0) % 7 == 0) {g.setColor(Color.pink);}
			g.drawOval((x/2)-(sz*amt/2), 40+(y/2)-(sz*amt/2), (sz*i)-40, (sz*i)-40);
		}
	}

	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			amt = Integer.parseInt(input.getText());
			if (amt >= 100) {
				input.setText("");
				repaint();
			}
		}
	}
	
}