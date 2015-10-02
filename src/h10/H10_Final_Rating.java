package h10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_Final_Rating extends Applet {
	
	TextField field = new TextField("", 5);
	Button button = new Button("OK");
	String string = "";
	String error = "";
	
	public void init() {
		setSize(500, 200);
		add(field); field.addActionListener(new InputListener());
		add(button); button.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		g.drawString(""+string, x/2-50, y/2);
		g.drawString(""+error, x/2-100, y/2);
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			switch(Integer.parseInt(field.getText())) {
				case  1: error = ""; string = "Het cijfer "+ field.getText() +" is slecht."; break;
				case  2: error = ""; string = "Het cijfer "+ field.getText() +" is slecht."; break;
				case  3: error = ""; string = "Het cijfer "+ field.getText() +" is slecht."; break;
				case  4: error = ""; string = "Het cijfer "+ field.getText() +" is onvoldoende."; break;
				case  5: error = ""; string = "Het cijfer "+ field.getText() +" is matig."; break;
				case  6: error = ""; string = "Het cijfer "+ field.getText() +" is voldoende."; break;
				case  7: error = ""; string = "Het cijfer "+ field.getText() +" is voldoende."; break;
				case  8: error = ""; string = "Het cijfer "+ field.getText() +" is goed."; break;
				case  9: error = ""; string = "Het cijfer "+ field.getText() +" is goed."; break;
				case 10: error = ""; string = "Het cijfer "+ field.getText() +" is goed."; break;
				default: string = ""; error = "Syntax error. Kies een getal van 1 t/m 10."; break;
			}
			field.setText("");
			repaint();
		}
	}

}