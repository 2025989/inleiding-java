package h04_1;

import java.awt.*;
import java.applet.*;

public class Triangle extends Applet{

	
	public void init() {
		
	}
	
	public void paint(Graphics g){
		g.drawLine(50, 150, 150, 150); //bottom
		g.drawLine(50, 150, 100, 63); //left
		g.drawLine(100, 63, 150, 150); //right
	}
}
