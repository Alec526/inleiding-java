package h04;

import java.applet.Applet;
import java.awt.*;

public class O45 extends Applet {

    public void init() {
        setBackground(Color.BLUE);

    }


    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillArc(30, 80, 300, 150, 0, 360);

    }
}
