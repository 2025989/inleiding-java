package h12_Arrays;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class H12_Final_Phonebook extends Applet {

	Label labelName = new Label("Naam: ");
	Label labelNumber = new Label("Telefoonnummer: ");
	TextField inputName = new TextField("", 15);
	TextField inputNumber = new TextField("", 15);
	Button ok = new Button("OK");
	String[] stringName = new String[10];
	String[] stringNumber = new String[10];
	int count = 0;
	
	public void init() {
		setSize(600, 200+35*stringName.length);
		add(labelName);
		add(inputName);
		inputName.addActionListener(new InputListener());
		add(labelNumber);
		add(inputNumber);
		inputNumber.addActionListener(new InputListener());
		add(ok);
		ok.addActionListener(new InputListener());
		for (int i = 0; i < stringName.length; i++) {
			stringName[i] = "";
			stringNumber[i] = "";
		}
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		for (int i = 0; i < stringName.length; i++) {
			if (count == 10) {
				g.drawString(""+ stringName[i], x/2-100, (y/2-35*stringName.length/2)+35*i);
				g.drawString(""+ stringNumber[i], x/2-100, (y/2-35*stringName.length/2)+15+35*i);
			}
		}
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			count++;
			stringName[(count-1)] = "Naam: "+ inputName.getText();
			stringNumber[(count-1)] = "Telefoonnummer: "+ inputNumber.getText();
			inputName.setText("");
			inputNumber.setText("");
			inputName.requestFocus();
			repaint();
		}
	}
}
