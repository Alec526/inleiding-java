package h04;

import java.applet.Applet;
import java.awt.*;

public class O47 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.drawRoundRect(100, 100, 200, 200, 30, 30);

        g.fillArc(120, 120, 35, 35, 0, 360);
        g.fillArc(120, 250, 35, 35, 0, 360);
        g.fillArc(240, 120, 35, 35, 0, 360);
        g.fillArc(240, 250, 35, 35, 0, 360);

    }
}
