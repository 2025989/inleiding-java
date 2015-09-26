package h08_2;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FourButtonsCounter extends Applet{
	
	int mCounter = 0;
	int vCounter = 0;
	int mStudentCounter = 0;
	int vStudentCounter = 0;
	int total = 0;
	Button m = new Button("Man, maar geen student");
	Button v = new Button("Vrouw, maar geen student");
	Button mStudent = new Button("Mannelijke student");
	Button vStudent = new Button("Vrouwelijke student");
	
	public void init() {
		setSize(400, 200);
		add(m); m.addActionListener(new MListener());
		add(v); v.addActionListener(new VListener());
		add(mStudent); mStudent.addActionListener(new MStudentListener());
		add(vStudent); vStudent.addActionListener(new VStudentListener());
	}
	
	public void paint(Graphics g) {
		g.drawString("Totaal aantal mannen: " + mCounter, getWidth()/2-60, 90);
		g.drawString("Waarvan studenten: " + mStudentCounter, getWidth()/2-50, 105);
		g.drawString("Totaal aantal vrouwen: " + vCounter, getWidth()/2-60, 125);
		g.drawString("Waarvan studenten: " + vStudentCounter, getWidth()/2-50, 140);
		g.drawString("Totaal: " + total, getWidth()/2-20, 160);
	}
	
	class MListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			mCounter++;
			total++;
			repaint();
		}
	}
	
	class VListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			vCounter++;
			total++;
			repaint();
		}
	}
	
	class MStudentListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			mStudentCounter++;
			mCounter++;
			total++;
			repaint();
		}
	}
	
	class VStudentListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			vStudentCounter++;
			vCounter++;
			total++;
			repaint();
		}
	}
	
}