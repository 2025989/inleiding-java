package h10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_02_HighestLowestNumber extends Applet{

	TextField number = new TextField("", 25);
	long lowestNumber = Long.MAX_VALUE;
	long highestNumber = Long.MIN_VALUE;
	String lowString = "";
	String highString = "";
	
	public void init() {
		setSize(600, 200);
		add(number); number.addActionListener(new NumberListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		g.drawString("" + lowString, x/2-100, y/2-05);
		g.drawString("" + highString, x/2-100, y/2+10);
	}
	
	class NumberListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (lowestNumber > Long.parseLong(number.getText())) {lowestNumber = Long.parseLong(number.getText());}
			if (highestNumber < Long.parseLong(number.getText())) {highestNumber = Long.parseLong(number.getText());}
			lowString = "Het laagste getal tot nu toe is " + lowestNumber;
			highString = "Het hoogste getal tot nu toe is " + highestNumber;
			number.setText("");
			repaint();
		}
	}

}