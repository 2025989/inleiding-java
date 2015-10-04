package h11_Loops;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_08_OneHundredAndEighty extends Applet {

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
			if (i%7 == 1) {g.setColor(Color.decode("0xFF0000"));}
			if (i%7 == 2) {g.setColor(Color.decode("0xFF7700"));}
			if (i%7 == 3) {g.setColor(Color.decode("0xFFDD00"));}
			if (i%7 == 4) {g.setColor(Color.decode("0x00FF00"));}
			if (i%7 == 5) {g.setColor(Color.decode("0x0000FF"));}
			if (i%7 == 6) {g.setColor(Color.decode("0x8A2BE2"));}
			if (i%7 == 0) {g.setColor(Color.decode("0xC77DF3"));}
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