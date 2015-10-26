package h12_Arrays;

import java.applet.Applet;
import java.awt.Button;

public class H12_02_TwentyFiveButtons extends Applet {
	
	Button[] buttons = new Button[25];
	
	public void init() {
		setSize(400, 150);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button("Button #"+ (i+1));
			add(buttons[i]);
		}
	}
	
}