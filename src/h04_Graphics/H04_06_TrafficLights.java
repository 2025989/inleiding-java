package h04_Graphics;

import java.awt.*;
import java.applet.*;

public class H04_06_TrafficLights extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		g.fillRoundRect(50, 25, 100, 150, 50, 50);
		g.setColor(Color.red);
		g.fillOval(85, 50, 30, 30);
		g.setColor(Color.orange);
		g.fillOval(85, 85, 30, 30);
		g.setColor(Color.green);
		g.fillOval(85, 120, 30, 30);
	}
	
}
