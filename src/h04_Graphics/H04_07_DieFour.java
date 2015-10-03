package h04_Graphics;

import java.awt.*;
import java.applet.*;

public class H04_07_DieFour extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		g.drawRoundRect(50, 50, 100, 100, 20, 20); //die
		g.fillOval(70, 70, 20, 20); //top left
		g.fillOval(110, 70, 20, 20); //top right
		g.fillOval(70, 110, 20, 20); //bottom left
		g.fillOval(110, 110, 20, 20); //bottom right
	}
	
}
