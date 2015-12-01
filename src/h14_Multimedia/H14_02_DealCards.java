package h14_Multimedia;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class H14_02_DealCards extends Applet {
	
	Button draw = new Button("Deal the cards");
	String[] suit = {"Hearts", "Spades", "Diamonds", "Clubs"};
	String[] rank = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	Image[] deck = new Image[52];
	Image[] player1 = new Image[deck.length/4];
	Image[] player2 = new Image[deck.length/4];
	Image[] player3 = new Image[deck.length/4];
	Image[] player4 = new Image[deck.length/4];
	
	public void init() {
		setSize(800, 600);
		add(draw);
		draw.addActionListener(new DealListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		
		//show cards
		for (int iPaint = 0; iPaint < 13; iPaint++) {
			g.drawImage(player1[iPaint], x/5*1-player1[iPaint].getWidth(this)/2, 50+iPaint*35, player1[iPaint].getWidth(this), player1[iPaint].getHeight(this), this);
			g.drawImage(player2[iPaint], x/5*2-player2[iPaint].getWidth(this)/2, 50+iPaint*35, player2[iPaint].getWidth(this), player2[iPaint].getHeight(this), this);
			g.drawImage(player3[iPaint], x/5*3-player3[iPaint].getWidth(this)/2, 50+iPaint*35, player3[iPaint].getWidth(this), player3[iPaint].getHeight(this), this);
			g.drawImage(player4[iPaint], x/5*4-player4[iPaint].getWidth(this)/2, 50+iPaint*35, player4[iPaint].getWidth(this), player4[iPaint].getHeight(this), this);
		}
	}
	
	public Image dealCard() {
		//draw random card
		Image cardDrawn = deck[(int)(Math.random()*deck.length)];

		//get card out of deck
		int iTemp = 0;
		Image[] temp = new Image[deck.length-1];
		for (int iDraw = 0; iDraw < deck.length; iDraw++) {
			if (deck[iDraw] != cardDrawn) {
				temp[iTemp] = deck[iDraw];
				iTemp++;
			}
		}
		deck = temp;
		
		return cardDrawn;
	}
	
	class DealListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//fill deck
			deck = new Image[52];
			int iDeck = 0;
			for (int iSuit = 0; iSuit < suit.length; iSuit++) {
				for (int iRank = 0; iRank < rank.length; iRank++) {
					deck[iDeck] = getImage(getCodeBase(), "h14_Multimedia/playing-cards/"+ rank[iRank] +"-of-"+ suit[iSuit] +".png");
					iDeck++;
				}
			}
			//deal cards
			for (int iDeal = 0; iDeal < 13; iDeal++) {
				player1[iDeal] = dealCard();
				player2[iDeal] = dealCard();
				player3[iDeal] = dealCard();
				player4[iDeal] = dealCard();
			}
			repaint();
			AudioClip doneSound = getAudioClip(getCodeBase(), "h14_Multimedia/prima.wav");
			doneSound.play();
		}
	}

}