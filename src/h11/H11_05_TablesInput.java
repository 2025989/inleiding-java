package h11;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_05_TablesInput extends Applet {

	TextField input = new TextField("", 15);
	long num = Long.MIN_VALUE;
	int i = 1;
	
	public void init() {
		setSize(400,400);
		add(input); input.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		if (num > Long.MIN_VALUE) {
			for (i = 1; i <= 10; i++) {
				g.drawString(i +" × "+ num +" = "+ i*num, x/2-30, y/11*i+25);
			}
		}
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			num = Long.parseLong(input.getText());
			input.setText("");
			repaint();
		}
	}
	
}