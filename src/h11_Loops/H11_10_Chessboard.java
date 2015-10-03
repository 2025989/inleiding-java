package h11_Loops;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class H11_10_Chessboard extends Applet {
	
	public void init() {
		setSize(300, 300);
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int sz = getHeight()/10;
		
		for (int iRow = 1; iRow <= 8; iRow++) {
			for (int iCol = 1; iCol <= 8; iCol++) {
				if (iRow % 2 == 1 && iCol % 2 == 1) {g.setColor(Color.black);} //  oddRow &&  oddCol
				if (iRow % 2 == 1 && iCol % 2 == 0) {g.setColor(Color.white);} //  oddRow && evenCol
				
				if (iRow % 2 == 0 && iCol % 2 == 1) {g.setColor(Color.white);} // evenRow &&  oddCol
				if (iRow % 2 == 0 && iCol % 2 == 0) {g.setColor(Color.black);} // evenRow && evenCol
				
				g.fillRect((x-sz*8)/2+sz*(iCol-1), sz*iRow, sz, sz);
			}
		}
		g.drawRect((x-sz*8)/2, sz, sz*8, sz*8);
	}

}