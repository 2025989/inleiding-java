package h10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_01_HighestNumber extends Applet{

	TextField number = new TextField("", 25);
	long highestNumber = Long.MIN_VALUE;
	String highString = "";
	
	public void init() {
		setSize(600, 200);
		add(number); number.addActionListener(new NumberListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		g.drawString("" + highString, x/2-100, y/2);
	}
	
	class NumberListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (highestNumber < Long.parseLong(number.getText())) {highestNumber = Long.parseLong(number.getText());}
			highString = "Het hoogste getal tot nu toe is " + highestNumber;
			number.setText("");
			repaint();
		}
	}

}