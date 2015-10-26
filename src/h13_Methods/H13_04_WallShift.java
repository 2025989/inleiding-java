package h13_Methods;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13_04_WallShift extends Applet {
	
	Color color = null;
	Button red = new Button("Rode bakstenen");
	Button gray = new Button("Grijze betonblokken");
	int sz = 0;
	
	public void init() {
		add(red);
		red.addActionListener(new RedListener());
		add(gray);
		gray.addActionListener(new GrayListener());
	}
	
	public void paint(Graphics g) {
		buildWall(g);
	}
	
	void buildWall(Graphics g) {
		g.setColor(color);
		for (int iRow = 0; 2+22*iRow < getHeight(); iRow++) {
			for (int iCol = 0; 2+52*(iCol-1) < getWidth(); iCol++) {
				if (iRow % 2 == 0) {g.fillRect(sz*(2+52*iCol), sz*(2+22*iRow), sz*50, sz*20);}
				else {g.fillRect(sz*(-25+52*iCol), sz*(2+22*iRow), sz*50, sz*20);}
			}
		}
	}
	
	class RedListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			color = Color.red;
			sz = 1;
			repaint();
		}
	}
	
	class GrayListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			color = Color.gray;
			sz = 2;
			repaint();
		}
	}
}