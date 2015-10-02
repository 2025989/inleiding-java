package h04;

import java.awt.*;
import java.applet.*;

public class H04_04_Histogram extends Applet{
	
	public void init(){
		
	}
	
	public void paint(Graphics g){
		g.drawLine(70, 150, 170, 150);	//x-axis
		g.drawLine(70, 150, 70, 50); //y-axis
		
		g.drawString("y in kg", 5, 42);
		g.drawLine(20, 60, 20, 120); //arrow mid
		g.drawLine(20, 61, 15, 70); //arrow left
		g.drawLine(20, 61, 25, 70); //arrow right
		g.drawString("100", 40, 55);
		g.drawLine(65, 50, 75, 50); //y=100
		g.drawString("80", 47, 75);
		g.drawLine(65, 70, 75, 70); //y=80
		g.drawString("60", 47, 95);
		g.drawLine(65, 90, 75, 90); //y=60
		g.drawString("40", 47, 115);
		g.drawLine(65, 110, 75, 110); //y=40
		g.drawString("20", 47, 135);
		g.drawLine(65, 130, 75, 130); //y=20
		
		g.setColor(Color.magenta);
		g.fillRect(80, 110, 25, 40); //Valerie
		g.fillRect(105, 158, 10, 10); //Valerie legend
		g.setColor(Color.cyan);
		g.fillRect(110, 50, 25, 100); //Jeroen
		g.fillRect(105, 173, 10, 10); //Jeroen legend
		g.setColor(Color.yellow);
		g.fillRect(140, 70, 25, 80); //Hans
		g.fillRect(105, 188, 10, 10); //Hans legend
		g.setColor(Color.black);
		g.drawRect(80, 110, 25, 40); //Valerie outline
		g.drawRect(105, 158, 10, 10); //Valerie legend outline
		g.drawRect(110, 50, 25, 100); //Jeroen outline
		g.drawRect(105, 173, 10, 10); //Jeroen legend outline
		g.drawRect(140, 70, 25, 80); //Hans outline
		g.drawRect(105, 188, 10, 10); //Hans legend outline
		g.drawString("Valerie", 120, 168);
		g.drawString("Jeroen", 120, 183);
		g.drawString("Hans", 120, 198);
		
	}

}
