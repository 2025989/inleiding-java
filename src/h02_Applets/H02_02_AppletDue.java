package h02_Applets;
import java.awt.*;
import java.applet.*;

public class H02_02_AppletDue extends Applet {

  public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    g.setColor(Color.blue);
    g.drawString("Daniel", 50, 60 );
    g.setColor(Color.red);
    g.drawString("Wezeman", 50, 70 );
  }
}