package h13_Methods;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13_Final_02_Orchard extends Applet {
	
	Button season = new Button("Next season");
	Button sellButton = new Button("Sell apples:");
	TextField sell = new TextField("0", 5);
	Button cut = new Button("Cut a dead tree for € 500,-");
	Button plant = new Button("Replant a cut tree for € 250,- (only during springtime)");
	int[] iSeason = new int[8*7];
	double d; //shrink-factor "depth"
	int treeCounter = 0;
	boolean[] isDead = new boolean[iSeason.length];
	boolean[] isCut = new boolean[iSeason.length];
	int appleBasket = 0;
	double money = 2500;
	int hiApple = 0;
	double hiMoney = 0;
	double appleEuro = (double)(int)((Math.random()*1.5+0.5)*1000)/1000;
	int treePointer;
	int labor;
	
	public void init() {
		setSize(1280, 860);
		add(season);
		season.addActionListener(new SeasonListener());
		add(sellButton);
		sellButton.addActionListener(new SellListener());
		add(sell);
		sell.addActionListener(new SellListener());
		add(cut);
		cut.addActionListener(new CutListener());
		add(plant);
		plant.addActionListener(new PlantListener());
		for (int i = 0; i < iSeason.length; i++) {
			iSeason[i] = 1;
			isDead[i] = false;
			isCut[i] = false;
		}
	}
	
	public void paint(Graphics g) {
		g.setFont(new Font("Arial", Font.PLAIN, 14));
		int x = getWidth();
		int y = 700;
		
		for (int iRow = 1; iRow <= iSeason.length/7; iRow++) {
			for (int iCol = -3; iCol <= 3; iCol++) {
				drawTree(g, (int)(x/2+iCol*rowHeight(x/2, y)*0.95), y);
				treeCounter++;
			}
			y -= rowHeight(x/2, y) + 10;
		}
		if (appleBasket > hiApple) {hiApple = appleBasket;}
		if (money > hiMoney) {hiMoney = money;}
		g.setColor(Color.black);
		g.drawString("High score (apples): "+ hiApple, 40, 60);
		if (hiMoney == (int) hiMoney) {g.drawString("High score (money): € "+ String.format("%.0f"+ ",-", hiMoney), 40, 80);}
		else {g.drawString("High score (money): € "+ String.format("%.2f", hiMoney), 40, 80);}
		g.drawString("Apples: "+ appleBasket, 40, 115);
		if (money == (int) money) {g.drawString("Money: € "+ String.format("%.0f"+ ",-", money), 40, 140);}
		else {g.drawString("Money: € "+ String.format("%.2f", money), 40, 140);}
		g.drawString("Apple stock price: "+ String.format("%.3f", appleEuro) +" EUR", 40, 165);
		if (iSeason[0]%4 == 1) {g.drawString("Current season: Spring", x-200, 60);}
		if (iSeason[0]%4 == 2) {g.drawString("Current season: Summer", x-200, 60);}
		if (iSeason[0]%4 == 3) {g.drawString("Current season: Autumn", x-200, 60);}
		if (iSeason[0]%4 == 0) {g.drawString("Current season: Winter", x-200, 60);}
		treeCounter = 0;
		gameOver(g);
	}
	
	void gameOver(Graphics death) {
		int decayCounter = 0;
		int isDeadCounter = 0;
		for (int i = 0; i < iSeason.length; i++) {
			if (isDead[i] == true || isCut[i] == true) {decayCounter++;}
			if (isDead[i] == true) {isDeadCounter++;}
		}
		if ((decayCounter == iSeason.length && appleBasket == 0 && money < 250)
		|| (isDeadCounter == iSeason.length && appleBasket == 0 && money < 500)) {
			death.setFont(new Font("Arial", Font.BOLD, 40));
			setBackground(new Color(255, 200, 200));
			season.setBackground(new Color(255, 200, 200));
			sellButton.setBackground(new Color(255, 200, 200));
			sell.setBackground(new Color(255, 200, 200));
			cut.setBackground(new Color(255, 200, 200));
			plant.setBackground(new Color(255, 200, 200));
			death.drawString("GAME OVER", getWidth()/2-123, getHeight()/2-43);
			death.setColor(Color.red);
			death.drawString("GAME OVER", getWidth()/2-125, getHeight()/2-45);
		}
	}
	
	int rowHeight(int x, int y) {
		d = y/(double)(150); //shrink-factor "depth"
		int rowHeight = (int)(d*40);
		return rowHeight;
	}
	
	void drawTree(Graphics g, int x, int y) {
		if (iSeason[treeCounter] <= 20) {d = d/20*iSeason[treeCounter];}
		if (isDead[treeCounter] == true) {
			int[] xPoints = {x, (int)(x-d*3), (int)(x-d*2), (int)(x-d*11), (int)(x-d*1), x, (int)(x+d), (int)(x+d*11), (int)(x+d), (int)(x+d*3)};
			int[] yPoints = {y, y, (int)(y-d*14), (int)(y-d*34), (int)(y-d*18), (int)(y-d*36), (int)(y-d*25), (int)(y-d*34), (int)(y-d*22), y};
			g.setColor(new Color(95, 55, 25));
			g.fillPolygon(xPoints, yPoints, 10);
		}
		else if (isCut[treeCounter] == true) {
			int[] xPoints = {x, (int)(x-d*3), (int)(x-d*2), (int)(x+d*2), (int)(x+d*3)};
			int[] yPoints = {y, y, (int)(y-d*5), (int)(y-d*5), y};
			g.setColor(new Color(95, 55, 25));
			g.fillPolygon(xPoints, yPoints, 5);
		}
		else {
			//tree trunk
			int[] xPoints = {x, (int)(x-d*3), (int)(x-d*2), (int)(x-d*11), (int)(x-d*1), x, (int)(x+d), (int)(x+d*11), (int)(x+d), (int)(x+d*3)};
			int[] yPoints = {y, y, (int)(y-d*14), (int)(y-d*34), (int)(y-d*18), (int)(y-d*36), (int)(y-d*25), (int)(y-d*34), (int)(y-d*22), y};
			g.setColor(new Color(185, 75, 5));
			g.fillPolygon(xPoints, yPoints, 10);
			
			//foliage
			if (iSeason[treeCounter]%4 != 0) {
				int leaf = 0;
				if (iSeason[treeCounter]%4 == 1) {leaf = 20;}
				if (iSeason[treeCounter]%4 == 2) {leaf = 17;}
				if (iSeason[treeCounter]%4 == 3) {leaf = 12;}
				for (int i = 0; i < leaf; i++) {
					if (iSeason[treeCounter]%4 == 1) {g.setColor(new Color((int)(Math.random()*50+80), (int)(Math.random()*25+230), (int)(Math.random()*50+15)));}
					if (iSeason[treeCounter]%4 == 2) {
						g.setColor(new Color((int)(Math.random()*50+200), (int)(Math.random()*50+195), (int)(Math.random()*45)));
						if (Math.random() < 0.4) {g.setColor(new Color((int)(Math.random()*50+80), (int)(Math.random()*25+230), (int)(Math.random()*50+15)));} //spring leaves
					}
					if (iSeason[treeCounter]%4 == 3) {
						g.setColor(new Color((int)(Math.random()*40+210), (int)(Math.random()*50+55), (int)(Math.random()*25)));
						if (Math.random() < 0.25) {g.setColor(new Color((int)(Math.random()*50+200), (int)(Math.random()*50+195), (int)(Math.random()*45)));} //summer leaves
						if (Math.random() < 0.01) {g.setColor(new Color((int)(Math.random()*50+80), (int)(Math.random()*25+230), (int)(Math.random()*50+15)));} //spring leaves
					}
					int xRan = (int)(Math.random()*(d*10));
					int yRan = (int)(Math.random()*(d*10));
					g.fillOval((int)(x-d*17)+xRan, (int)(y-d*39)+yRan, (int)(d*6), (int)(d*5));
					
					xRan = (int)(Math.random()*(d*7));
					yRan = (int)(Math.random()*(d*7));
					g.fillOval((int)(x-d*6)+xRan, (int)(y-d*40)+yRan, (int)(d*6), (int)(d*5));
					
					xRan = (int)(Math.random()*(d*11));
					yRan = (int)(Math.random()*(d*9));
					g.fillOval((int)(x+d)+xRan, (int)(y-d*39)+yRan, (int)(d*6), (int)(d*5));
				}
			}
			//autumn&winter: leaves on the ground
			if (iSeason[treeCounter]%4 == 3 || iSeason[treeCounter]%4 == 0) {
				g.setColor(new Color(235, 80, 0));
				int rLeaf = (int)(Math.random()*(iSeason[treeCounter]%4+1)*5);
				for (int i = 0; i < rLeaf; i++) {
					int xRan = (int)(Math.random()*(d*30+7));
					g.fillOval((int)(x-d*17)+xRan, (int)(y-d), (int)(d*2), (int)(d));
				}
			}
			
			//apples
			if (iSeason[treeCounter] > 20) {
				if (iSeason[treeCounter]%4 == 1) {g.setColor(new Color(50, 205, 50));}
				if (iSeason[treeCounter]%4 == 2) {g.setColor(new Color(225, 125, 0));}
				if (iSeason[treeCounter]%4 == 3) {g.setColor(new Color(255, 0, 0));}
				if (iSeason[treeCounter]%4 != 0) {
					int rApple = (int)(Math.random()*16+2*(iSeason[treeCounter]%4));
					for (int i = 0; i < rApple; i++) {
						int xRan = (int)(Math.random()*(d*29));
						int yRan = (int)(Math.random()*(d*9));
						g.fillOval((int)(x-d*16)+xRan, (int)(y-d*38)+yRan, (int)(d*2), (int)(d*2));
					}
				}
				//autumn: apples on the ground
				if (iSeason[treeCounter]%4 == 3) {
					g.setColor(new Color(255, 0, 0));
					int rApple = (int)(Math.random()*5+2);
					for (int i = 0; i < rApple; i++) {
						int xRan = (int)(Math.random()*(d*30+7));
						g.fillOval((int)(x-d*17)+xRan, (int)(y-d*2), (int)(d*2), (int)(d*2));
					}
				}
			}
		}
	}
	
	void searchDeadCut() {
		for (int i = isDead.length-1; i >= 0; i--) {
			if (isDead[i] == true) {cut.setName(""+ i);}
		}
		for (int i = isDead.length-1; i >= 0; i--) {
			if (isCut[i] == true) {plant.setName(""+ i);}
		}
		sell.setText(""+ appleBasket);
	}
	
	void time() {
		searchDeadCut();
		for (int i = 0; i < iSeason.length; i++) {
			iSeason[i]++;
			if (iSeason[i] > 20 && iSeason[i]%4 == 0 && isCut[i] == false && Math.random() < 0.10) {isDead[i] = true;}
			int rApple = (int)(Math.random()*24+4*(iSeason[treeCounter]%4));
			if (iSeason[i] > 20 && iSeason[i]%4 == 3 && isDead[i] == false && isCut[i] == false) {appleBasket += rApple;}
		}
		sell.setText(""+ appleBasket);
		appleEuro = (double)(int)((Math.random()*1.5+0.5)*1000)/1000;
		searchDeadCut();
		repaint();
	}
	
	class SeasonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			time();
		}
	}
	
	class CutListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			searchDeadCut();
			treePointer = Integer.parseInt(cut.getName());
			if (isDead[treePointer] == true && money >= 500) {
				money -= 500;
				isDead[treePointer] = false;
				isCut[treePointer] = true;
				cut.setName("");
				for (int i = 0; i < iSeason.length; i++) {
					if (iSeason[i] > 20 && iSeason[i]%4 == 0 && isCut[i] == false && Math.random() < 0.01) {isDead[i] = true;}
				}
				searchDeadCut();
				repaint();
				labor++;
				if (labor > 3 && Math.random() < 0.5) {
					time();
					labor = 0;
				}
			}
		}
	}
	
	class PlantListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			searchDeadCut();
			treePointer = Integer.parseInt(plant.getName());
			if (isCut[treePointer] == true && iSeason[treePointer]%4 == 1 && money >= 250) {
				money -= 250;
				isDead[treePointer] = false;
				isCut[treePointer] = false;
				iSeason[treePointer] = 1;
				plant.setName("");
				searchDeadCut();
				repaint();
			}
		}
	}
	
	class SellListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (Integer.parseInt(sell.getText()) <= appleBasket) {
				appleBasket -= Integer.parseInt(sell.getText());
				money += Integer.parseInt(sell.getText())*appleEuro;
				sell.setText("");
				searchDeadCut();
				repaint();
			}
		}
	}
	
}