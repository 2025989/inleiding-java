package h02;
import java.awt.*;
import java.applet.*;

public class H02_01_AppletUno extends Applet {

  public void init() {
    setBackground(Color.blue);
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.drawString("Daniel Wezeman", 50, 60 );
  }
}