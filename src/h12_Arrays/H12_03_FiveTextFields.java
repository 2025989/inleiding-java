package h12_Arrays;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class H12_03_FiveTextFields extends Applet {
	
	TextField[] textfields = new TextField[5];
	Button ok = new Button("OK");
	
	public void init() {
		setSize(400, 400);
		for (int i = 0; i < textfields.length; i++) {
			textfields[i] = new TextField("", 5);
			add(textfields[i]);
			textfields[i].addActionListener(new InputListener());
		}
		add(ok);
		ok.addActionListener(new InputListener());
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int[] numbers = new int[textfields.length];
			for (int i = 0; i < textfields.length; i++) {
				numbers[i] = Integer.parseInt(textfields[i].getText());
			}
			Arrays.sort(numbers);
			for (int i = 0; i < textfields.length; i++) {
				textfields[i].setText(""+ numbers[i]);
			}
		}
	}

}
