package h11_Loops;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_06_FiveSquares extends Applet {

	Label label = new Label("Hoeveel blokjes wil je zien?");
	TextField input = new TextField("5", 5);
	Button ok = new Button("OK");
	int amt = 5;
	
	public void init() {
		setSize(215, 215);
		add(label);
		add(input); input.addActionListener(new InputListener());
		add(ok); ok.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int sz = (getHeight()-75)/(amt+2);
		
		for (int i = 1; i <= amt; i++) {
			g.drawRect((x-sz*amt)/2+sz*(i-1), 75+sz*i, sz, sz);
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