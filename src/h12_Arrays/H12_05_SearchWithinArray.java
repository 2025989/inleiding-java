package h12_Arrays;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_05_SearchWithinArray extends Applet {
	
	int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -43, 1984, 235240, -3000, 22, 2016};
	TextField input = new TextField("", 5);
	Button ok = new Button("OK");
	String string = "";
	boolean found = false;
	int index = -1;
	
	public void init() {
		setSize(400, 400);
		add(input);
		input.addActionListener(new InputListener());
		add(ok);
		ok.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		g.drawString(""+ string, x/2-100, y/2);
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int search = Integer.parseInt(input.getText());
			for (int i = 0; i < numbers.length && found == false; i++) {
				index++;
				if (numbers[i] == search) {
					found = true;
				}
			}
			if (found == true) {
				string = "De waarde is gevonden onder de index "+ index +".";
			} else {
				string = "De waarde is niet gevonden.";
			}
			index = -1;
			input.setText("");
			found = false;
			repaint();
		}
	}

}