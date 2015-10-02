package h04;

import java.awt.*;
import java.applet.*;

public class H04_02_House extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		
		g.drawLine(50, 100, 150, 100); //roof bottom
		g.drawLine(50, 100, 100, 13); //roof left
		g.drawLine(100, 13, 150, 100); //roof right
		
		g.drawRect(50, 100, 100, 80); //first story
		
		g.drawRect(90, 150, 20, 30); //front door
		g.drawOval(93, 165, 3, 3); //door knob
		
		g.drawRect(60, 140, 20, 20); //left window
		g.drawLine(70, 140, 70, 160); //vertical line
		g.drawLine(60, 150, 80, 150); //horizontal line
		
		g.drawRect(120, 140, 20, 20); //right window
		g.drawLine(130, 140, 130, 160); //vertical line
		g.drawLine(120, 150, 140, 150); //horizontal line
		
		
	}
	
	
}
