package h13_Methods;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13_Final_02_Orchard extends Applet {
	
	Button season = new Button("Volgende seizoen");
	int iSeason = 1;
	
	public void init() {
		setSize(1280, 860);
		add(season);
		season.addActionListener(new SeasonListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = 700;
		
		for (int iRow = 1; iRow <= 6; iRow++) {
			for (int iCol = -3; iCol <= 3; iCol++) {
				drawTree(g, x/2-iCol*drawTree(g, x/2, y), y);
			}
			y -= drawTree(g, x/2, y) + 10;
		}
	}
	
	int drawTree(Graphics g, int x, int y) {
		int d = y/150;
		int[] xPoints = {x, x+d, x-d*8, x+d*2, x+d*3, x+d*4, x+d*14, x+d*4, x+d*6};
		int[] yPoints = {y, y-d*14, y-d*34, y-d*18, y-d*36, y-d*25, y-d*34, y-d*22, y};
		g.setColor(new Color(185, 75, 5));
		g.fillPolygon(xPoints, yPoints, 9);
		if (iSeason%4 == 1) {g.setColor(new Color(105, 255, 40));}
		if (iSeason%4 == 2) {g.setColor(new Color(225, 220, 20));}
		if (iSeason%4 == 3) {g.setColor(new Color(235, 80, 0));}
		if (iSeason%4 != 0) {
			g.fillOval(x-d*14, y-d*39, d*17, d*13);
			g.fillOval(x-d*3, y-d*40, d*15, d*12);
			g.fillOval(x+d*4, y-d*39, d*15, d*11);
		}
		int sz = d*40;
		return sz;
	}
	
	class SeasonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			iSeason++;
			repaint();
		}
	}
	
}