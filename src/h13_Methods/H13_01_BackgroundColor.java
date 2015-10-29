package h13_Methods;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13_01_BackgroundColor extends Applet {
	
	String text = "";
	
	public void init() {
		setSize(400, 400);
		buttons();
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		g.drawString(""+ text, x/2-10, y/2);
	}
	
	void buttons() {
		Color[] colors = {Color.cyan, Color.magenta, Color.pink, Color.yellow, Color.orange};
		String[] strings = {"cyan", "magenta", "pink", "yellow", "orange"};
		Button[] buttons = new Button[colors.length];
		for (int i = 0; i < colors.length; i++) {
			buttons[i] = new Button(strings[i]);
			add(buttons[i]);
			buttons[i].addActionListener(new ColorListener());
			buttons[i].setBackground(colors[i]);
		}
	}
	
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Button src = (Button)e.getSource();
			setBackground(src.getBackground());
			text = src.getLabel();
			repaint();
		}
	}

}