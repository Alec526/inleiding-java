package h04;

import java.applet.Applet;
import java.awt.*;

public class O42 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.drawRect(120 , 120, 120, 120);
        g.drawLine(120 , 120, 190, 20);
        g.drawLine(190 , 20, 240, 120);
        g.drawLine(200, 240, 200, 200);
        g.drawLine(160, 200, 200, 200);
        g.drawLine(160, 200, 160, 240);
        g.drawOval(188, 220 , 3 ,3);
        g.drawRect(140, 150, 20, 20);
        g.drawLine(150, 150, 150, 170);
        g.drawLine(140, 160, 160, 160);

    }
}
