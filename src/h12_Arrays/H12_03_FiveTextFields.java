package h12_Arrays;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class H12_03_FiveTextFields extends Applet {
	
	TextField[] textfields = new TextField[5];
	Button reset = new Button("Reset");
	String[] unsorted = new String[textfields.length];
	String[] sorted = new String[textfields.length];
	int[] sortInt = new int[textfields.length];
	int iSrc = 0;
	
	public void init() {
		setSize(400, 400);
		for (int i = 0; i < textfields.length; i++) {
			textfields[i] = new TextField("", 5);
			add(textfields[i]);
			textfields[i].addActionListener(new InputListener());
		}
		add(reset);
		reset.addActionListener(new ResetListener());
		for (int i = 0; i < textfields.length; i++) {
			unsorted[i] = "";
			sorted[i] = "";
		}
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		for (int i = 0; i < textfields.length; i++) {
			g.drawString(""+ unsorted[i], x/2-((textfields.length/2)-i)*50, y/2-20);
			if (iSrc == textfields.length) {
				Arrays.sort(sortInt);
				sorted[i] = ""+ sortInt[i];
				g.drawString(""+ sorted[i], x/2-((textfields.length/2)-i)*50, y/2+20);
			}
		}
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TextField src = (TextField)e.getSource();
			unsorted[iSrc] = ""+ Integer.parseInt(src.getText());
			sortInt[iSrc] = Integer.parseInt(src.getText());
			iSrc++;
			repaint();
		}
	}
	
	class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < textfields.length; i++) {
				textfields[i].setText(" ");
				textfields[i].setText("");
				sorted[i] = "";
				unsorted[i] = "";
			}
			iSrc = 0;
			textfields[0].requestFocus();
			repaint();
		}
	}

}