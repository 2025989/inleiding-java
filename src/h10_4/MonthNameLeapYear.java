package h10_4;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonthNameLeapYear extends Applet {

	Label monthLabel = new Label("Maand (1-12): ");
	Label yearLabel = new Label("Jaar: ");
	TextField monthInput = new TextField("", 5);
	TextField yearInput = new TextField("", 5);
	String text = "";
	
	public void init() {
		setSize(300, 200);
		add(monthLabel); add(monthInput); monthInput.addActionListener(new InputListener());
		add(yearLabel); add(yearInput); yearInput.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		g.drawString("" + text, x/2-100, y/2);
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int yearInt = Integer.parseInt(yearInput.getText());
			switch(Integer.parseInt(monthInput.getText())) {
				case 1: text = "In het jaar "+yearInt+" heeft januari 31 dagen."; break;
				case 2:
					if ((yearInt%4==0 && !(yearInt%100==0)) || yearInt%400==0) {
						text = "In het jaar "+yearInt+" heeft februari 29 dagen.";
					}
					else {text = "In het jaar "+yearInt+" heeft februari 28 dagen.";}
					break;
				case 3: text = "In het jaar "+yearInt+" heeft maart  31 dagen."; break;
				case 4: text = "In het jaar "+yearInt+" heeft april 30 dagen."; break;
				case 5: text = "In het jaar "+yearInt+" heeft mei 31 dagen."; break;
				case 6: text = "In het jaar "+yearInt+" heeft juni 30 dagen."; break;
				case 7: text = "In het jaar "+yearInt+" heeft juli 31 dagen."; break;
				case 8: text = "In het jaar "+yearInt+" heeft augustus 31 dagen."; break;
				case 9: text = "In het jaar "+yearInt+" heeft september 30 dagen."; break;
				case 10: text = "In het jaar "+yearInt+" heeft oktober 31 dagen."; break;
				case 11: text = "In het jaar "+yearInt+" heeft november 30 dagen."; break;
				case 12: text = "In het jaar "+yearInt+" heeft december 31 dagen."; break;
				default: text = ""; break;
			}
			monthInput.setText("");
			yearInput.setText("");
			monthInput.requestFocus();
			repaint();
		}
	}
	
}
