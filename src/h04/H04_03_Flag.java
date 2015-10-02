package h04;

import java.awt.*;
import java.applet.*;

public class H04_03_Flag extends Applet{
	
	public void init(){
		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fillRect(52, 20, 75, 20); //flag: red
		g.setColor(Color.white);
		g.fillRect(52, 40, 75, 20); //flag: white
		g.setColor(Color.blue);
		g.fillRect(52, 60, 75, 20); //flag: blue
		
		g.setColor(Color.black);
		g.drawRect(50, 20, 2, 150); //flagpole
		g.drawRect(52, 20, 75, 20); //outline for red
		g.drawRect(52, 40, 75, 20); //outline for white
		g.drawRect(52, 60, 75, 20); //outline for blue
		
	}
	

}
