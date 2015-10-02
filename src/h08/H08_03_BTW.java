package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H08_03_BTW extends Applet {
	
	Label label = new Label("Vul hier een bedrag in.");
	TextField textField = new TextField("", 15);
	Button okButton = new Button("OK");
	
	public void init() {
		setSize(300, 200);
		add(label);
		add(textField); textField.addActionListener(new OkListener());
		add(okButton); okButton.addActionListener(new OkListener());
	}
	
	public void paint(Graphics g) {
		double btw = (Double.parseDouble(textField.getText()) * 1.19);
		if (btw == (int) btw) {
			g.drawString("Inclusief 19% BTW: €" +
			(String.format("%.0f" + ",-", btw)), 50, 80);
		} else {
			g.drawString("Inclusief 19% BTW: €" +
			(String.format("%.2f", btw)), 50, 80);
		}
		
	}
	
	class OkListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
			textField.requestFocus();
		}
	}
	
}