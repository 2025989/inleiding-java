package h14_Multimedia;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H14_Final_TakeAway extends Applet {
	
	Label label = new Label("Take away gems (1-3):");
	TextField input = new TextField("", 15);
	Button ok = new Button("OK");
	Button reset = new Button("Reset");
	int imgCount = 23;
	String displayText = "";
	boolean won = false;
	boolean lost = false;
	
	public void init() {
		setSize(500, 600);
		add(label);
		add(input);
		input.addActionListener(new InputListener());
		add(ok);
		ok.addActionListener(new InputListener());
		add(reset);
		reset.addActionListener(new ResetListener());
	}
	
	public void paint(Graphics g) {
		g.setFont(new Font("Arial", Font.PLAIN, 20));
		if (won == true) {
			displayText = "You won (;";
		}
		if (lost == true) {
			displayText = "You lost (;";
			imgCount = 0;
		}
		g.drawString(""+ displayText, getWidth()/2-75, 75);
		int iImgCount = 0;
		Image img = getImage(getCodeBase(), "h14_Multimedia/GreenRupee.png");
		for (int iRow = -2; iRow <= 2; iRow++) {
			for (int iCol = -2; iCol <= 2; iCol++) {
				if (iImgCount < imgCount) {
					g.drawImage(img,
						(iCol*50)+(getWidth()/2-img.getWidth(this)/2),
						(iRow*75)+(getHeight()/2-img.getHeight(this)/2),
						img.getWidth(this), img.getHeight(this), this
					);
				}
				iImgCount++;
			}
		}
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int cpuGems = 0;
			int inputInt = Integer.parseInt(input.getText());
			if (inputInt >= 1 && inputInt <= 3) { //check for valid input
				imgCount -= inputInt;
				if (imgCount < 1) {lost = true;} //if you ended the game, you lost
				if ((imgCount-1)%4 != 0) {
					cpuGems = 1+((imgCount-1)%4-1);
					imgCount -= cpuGems; //CPU is winning
				}
				else {
					cpuGems = (int)(Math.random()*3+1);
					imgCount -= cpuGems; //CPU is losing
				}
				if (imgCount < 1 && lost == false) {won = true;} //if CPU ended the game, you won
				if (cpuGems == 1) {displayText = "CPU took "+ cpuGems +" gem.";}
				else {displayText = "CPU took "+ cpuGems +" gems.";}
			}
			else {displayText = "Invalid input";}
			input.setText("");
			input.requestFocus();
			repaint();
		}
	}
	
	class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			imgCount = 23;
			won = false;
			lost = false;
			displayText = "";
			input.setText(" ");
			input.setText("");
			input.requestFocus();
			repaint();
		}
	}

}