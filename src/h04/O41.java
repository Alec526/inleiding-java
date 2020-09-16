package h04;

import java.applet.Applet;
import java.awt.*;

public class O41 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.drawLine(50,120,150,20);
        g.drawLine(250, 120, 150, 20);
        g.drawLine(50, 120, 250, 120);
    }
}
