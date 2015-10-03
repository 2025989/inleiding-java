package h08_Objects;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H08_01_OkReset extends Applet{
	
	Label label = new Label("Type some text and print it on the screen.");
	TextField textField = new TextField("", 15);
	Button okButton = new Button("OK");
	Button resetButton = new Button("Reset");
	
	public void init() {
		setSize(400, 300);
		add(label);
		add(textField); textField.addActionListener(new OkListener());
		add(okButton); okButton.addActionListener(new OkListener());
		add(resetButton); resetButton.addActionListener(new ResetListener());
	}
	
	public void paint(Graphics g) {
		g.drawString(textField.getText(), getWidth()/2, getHeight()/2);
	}
	
	class OkListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
			textField.requestFocus();
		}
	}
	
	class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textField.setText(" "); textField.setText("");
			repaint();
			textField.requestFocus();
		}
	}
}