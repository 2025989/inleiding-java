package h08_Final;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Applet{
	
	TextField number1 = new TextField("", 10);
	TextField number2 = new TextField("", 10);
	Button multiply = new Button("*");
	Button divide = new Button("/");
	Button add = new Button("+");
	Button subtract = new Button("-");
	Button clear = new Button("C");
	
	public void init() {
		add(number1);
		add(number2);
		add(multiply); multiply.addActionListener(new MultiplyListener());
		add(divide); divide.addActionListener(new DivideListener());
		add(add); add.addActionListener(new AddListener());
		add(subtract); subtract.addActionListener(new SubtractListener());
		add(clear); clear.addActionListener(new ClearListener());
	}
	
	class MultiplyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double Ans = (Double.parseDouble(number1.getText()) * Double.parseDouble(number2.getText()));
			if (Ans == (int) Ans) {
				number1.setText("" + String.format("%.0f", Ans));
			} else {
				number1.setText("" + Ans);
			}
			number2.setText("");
			number2.requestFocus();
		}
	}
	
	class DivideListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double Ans = (Double.parseDouble(number1.getText()) / Double.parseDouble(number2.getText()));
			if (Ans == (int) Ans) {
				number1.setText("" + String.format("%.0f", Ans));
			} else {
				number1.setText("" + Ans);
			}
			number2.setText("");
			number2.requestFocus();
		}
	}
	
	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double Ans = (Double.parseDouble(number1.getText()) + Double.parseDouble(number2.getText()));
			if (Ans == (int) Ans) {
				number1.setText("" + String.format("%.0f", Ans));
			} else {
				number1.setText("" + Ans);
			}
			number2.setText("");
			number2.requestFocus();
		}
	}
	
	class SubtractListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double Ans = (Double.parseDouble(number1.getText()) - Double.parseDouble(number2.getText()));
			if (Ans == (int) Ans) {
				number1.setText("" + String.format("%.0f", Ans));
			} else {
				number1.setText("" + Ans);
			}
			number2.setText("");
			number2.requestFocus();
		}
	}
	
	class ClearListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			number1.setText(" "); number1.setText("");
			number2.setText(" "); number2.setText("");
			number1.requestFocus();
		}
	}

}