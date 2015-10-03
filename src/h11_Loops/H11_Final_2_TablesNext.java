package h11_Loops;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_Final_2_TablesNext extends Applet {

	Button ok = new Button("OK");
	int num = 1;
	int i = 1;
	
	public void init() {
		setSize(400, 400);
		add(ok); ok.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		if (num <= 10) {
			for (i = 1; i <= 10; i++) {
				g.drawString(i +" × "+ num +" = "+ i*num, x/2-30, y/11*i+25);
			}
		}
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			num++;
			if (num > 10) {num = 1;}
			repaint();
		}
	}
	
}