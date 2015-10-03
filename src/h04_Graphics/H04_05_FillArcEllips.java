package h04_Graphics;

import java.awt.*;
import java.applet.*;

public class H04_05_FillArcEllips extends Applet{
	
	public void init(){
		setBackground(Color.blue);
	}
	
	public void paint(Graphics g){
	g.setColor(Color.yellow);
	g.fillArc(50, 25, 100, 150, 90, 360);
	}

}
