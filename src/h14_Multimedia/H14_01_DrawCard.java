package h14_Multimedia;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class H14_01_DrawCard extends Applet {
	
	Button draw = new Button("Draw a card");
	String[] suit = {"Hearts", "Spades", "Diamonds", "Clubs"};
	String[] rank = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	String text = "", suitDraw, rankDraw;
	
	public void init() {
		setSize(300, 300);
		add(draw);
		draw.addActionListener(new DrawListener());
	}
	
	public void paint(Graphics g) {
		g.drawString(""+ text, getWidth()/2-40, 75);
		Image img = getImage(getCodeBase(), "h14_Multimedia/playing-cards/"+ rankDraw +"-of-"+ suitDraw +".png");
		g.drawImage(img, getWidth()/2-img.getWidth(this)/2, 90, img.getWidth(this), img.getHeight(this), this);
	}
	
	class DrawListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			suitDraw = suit[(int)(Math.random()*suit.length)];
			rankDraw = rank[(int)(Math.random()*rank.length)];
			text = rankDraw +" of "+ suitDraw;
			repaint();
		}
	}

}