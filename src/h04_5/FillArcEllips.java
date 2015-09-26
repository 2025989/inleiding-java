package h04_5;

import java.awt.*;
import java.applet.*;

public class FillArcEllips extends Applet{
	
	public void init(){
		setBackground(Color.blue);
	}
	
	public void paint(Graphics g){
	g.setColor(Color.yellow);
	g.fillArc(50, 25, 100, 150, 90, 360);
	}

}
