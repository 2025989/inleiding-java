package h02_1;
import java.awt.*;
import java.applet.*;

public class AppletUno extends Applet {

  public void init() {
    setBackground(Color.blue);
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.drawString("Daniel Wezeman", 50, 60 );
  }
}