package h10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_03_MonthName extends Applet {

	TextField input = new TextField("", 5);
	String month = "";
	
	public void init() {
		setSize(300, 200);
		add(input); input.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		g.drawString("" + month, x/2-100, y/2);
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			switch(Integer.parseInt(input.getText())) {
				case 1: month = "Januari heeft 31 dagen."; break;
				case 2: month = "Februari heeft 28 of 29 dagen."; break;
				case 3: month = "Maart heeft 31 dagen."; break;
				case 4: month = "April heeft 30 dagen."; break;
				case 5: month = "Mei heeft 31 dagen."; break;
				case 6: month = "Juni heeft 30 dagen."; break;
				case 7: month = "Juli heeft 31 dagen."; break;
				case 8: month = "Augustus heeft 31 dagen."; break;
				case 9: month = "September heeft 30 dagen."; break;
				case 10: month = "Oktober heeft 31 dagen."; break;
				case 11: month = "November heeft 30 dagen."; break;
				case 12: month = "December heeft 31 dagen."; break;
				default: month = ""; break;
			}
			input.setText("");
			repaint();
		}
	}
	
}
