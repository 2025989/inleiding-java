package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H08_Final_02_HistogramTextFields extends Applet {
	
	int valerie = 40;
	int jeroen = 100;
	int hans = 80;
	Label valerieLabel = new Label("Valerie:");
	Label jeroenLabel = new Label("Jeroen:");
	Label hansLabel = new Label("Hans:");
	TextField valerieInput = new TextField("", 5);
	TextField jeroenInput = new TextField("", 5);
	TextField hansInput = new TextField("", 5);
	Button button = new Button("OK");
	
	public void init() {
		setSize(800, 600);
		add(valerieLabel); valerieLabel.setBackground(Color.magenta);
		add(valerieInput); valerieInput.addActionListener(new InputListener());
		add(jeroenLabel); jeroenLabel.setBackground(Color.cyan);
		add(jeroenInput); jeroenInput.addActionListener(new InputListener());
		add(hansLabel); hansLabel.setBackground(Color.yellow);
		add(hansInput); hansInput.addActionListener(new InputListener());
		add(button); button.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
	
		int x = getWidth();
		int y = getHeight();
		
		/* Coordinate System */
		g.drawLine(x/5, y/8*7, x/5*4, y/8*7); //x-axis
		g.drawLine(x/5, y/8*7, x/5, 100); //y-axis
		g.drawString("100", x/5-(35+x/100), 105+(y/8*7-100)/5*0);
		g.drawString( "80", x/5-(28+x/100), 105+(y/8*7-100)/5*1);
		g.drawString( "60", x/5-(28+x/100), 105+(y/8*7-100)/5*2);
		g.drawString( "40", x/5-(28+x/100), 105+(y/8*7-100)/5*3);
		g.drawString( "20", x/5-(28+x/100), 105+(y/8*7-100)/5*4);
		g.drawLine(x/5-(5+x/100), 100+(y/8*7-100)/5*0, x/5+(5+x/100), 100+(y/8*7-100)/5*0); //y=100
		g.drawLine(x/5-(5+x/100), 100+(y/8*7-100)/5*1, x/5+(5+x/100), 100+(y/8*7-100)/5*1); //y=80
		g.drawLine(x/5-(5+x/100), 100+(y/8*7-100)/5*2, x/5+(5+x/100), 100+(y/8*7-100)/5*2); //y=60
		g.drawLine(x/5-(5+x/100), 100+(y/8*7-100)/5*3, x/5+(5+x/100), 100+(y/8*7-100)/5*3); //y=40
		g.drawLine(x/5-(5+x/100), 100+(y/8*7-100)/5*4, x/5+(5+x/100), 100+(y/8*7-100)/5*4); //y=20

		/* Arrow */
		g.drawString("y in kg", x/10-30, 90+(y/8*7-100)/10);
		g.drawLine(x/10-15, 100+(y/8*7-100)/10, x/10-15		, 100+(y/8*7-100)/10*9	 ); //arrow mid
		g.drawLine(x/10-15, 100+(y/8*7-100)/10, x/10-15-x/60, 100+(y/8*7-100)/10+y/25); //arrow left
		g.drawLine(x/10-15, 100+(y/8*7-100)/10, x/10-15+x/60, 100+(y/8*7-100)/10+y/25); //arrow right

		/* Bars */
		g.setColor(Color.magenta);
		g.fillRect(x/5+(x/5*3)/10*1, y/8*7-(y/8*7-100)*valerie/100, (x/5*3)/5, (y/8*7-100)*valerie/100); //Valerie
		g.setColor(Color.cyan);
		g.fillRect(x/5+(x/5*3)/10*4, y/8*7-(y/8*7-100)*jeroen /100, (x/5*3)/5, (y/8*7-100)*jeroen /100); //Jeroen
		g.setColor(Color.yellow);
		g.fillRect(x/5+(x/5*3)/10*7, y/8*7-(y/8*7-100)*hans   /100, (x/5*3)/5, (y/8*7-100)*hans   /100); //Hans
		g.setColor(Color.black);
		g.drawRect(x/5+(x/5*3)/10*1, y/8*7-(y/8*7-100)*valerie/100, (x/5*3)/5, (y/8*7-100)*valerie/100); //Valerie outline
		g.drawRect(x/5+(x/5*3)/10*4, y/8*7-(y/8*7-100)*jeroen /100, (x/5*3)/5, (y/8*7-100)*jeroen /100); //Jeroen outline
		g.drawRect(x/5+(x/5*3)/10*7, y/8*7-(y/8*7-100)*hans   /100, (x/5*3)/5, (y/8*7-100)*hans   /100); //Hans outline
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			valerie = Integer.parseInt(valerieInput.getText());
			jeroen = Integer.parseInt(jeroenInput.getText());
			hans = Integer.parseInt(hansInput.getText());
			repaint();
		}
	}
	
}