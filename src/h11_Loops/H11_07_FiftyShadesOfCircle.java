package h11_Loops;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_07_FiftyShadesOfCircle extends Applet {

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
			int out = (y-50);		// size of outer circle
			int cur = out/amt*i;	// size of current circle
			int dis = (out-cur)/2;	// distance between outer circle and current circle
			g.drawOval((x/2-out/2)+dis, 40+dis, cur, cur);
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