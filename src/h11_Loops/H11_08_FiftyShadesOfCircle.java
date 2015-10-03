package h11_Loops;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_08_FiftyShadesOfCircle extends Applet {

	Label label = new Label("Hoeveel cirkels wil je zien?");
	TextField input = new TextField("50", 5);
	Button ok = new Button("OK");
	int amt = Integer.parseInt(input.getText());
	
	public void init() {
		setSize(550, 550);
		add(label);
		add(input); input.addActionListener(new InputListener());
		add(ok); ok.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();

		for (int i = 1; i <= amt; i++) {
			int tot = (y-50);		// size of outer circle
			int sz = tot/amt*i;		// size of each individual circle
			int dis = (tot-sz)/2;	// distance between outer circle and the smaller ones
			g.drawOval((x/2-tot/2)+dis, 40+dis, sz, sz);
		}
	}

	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			amt = Integer.parseInt(input.getText());
			input.setText("");
			repaint();
		}
	}
	
}