package h04;

import java.applet.Applet;
import java.awt.*;

public class O46 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.drawArc(50, 50, 100, 170, 0, 360);
        g.drawArc(45, 45, 110, 180, 0, 360 );
        g.drawArc(85, 70, 30, 30, 0, 360);
        g.drawArc(85, 120, 30, 30, 0, 360);
        g.drawArc(85, 170, 30, 30, 0, 360);

        g.fillRect(90, 225, 20, 10);
        g.fillRect(90, 245, 20, 20);
        g.fillRect(90, 280, 20, 20);
        g.fillRect(90, 320, 20, 20);
        g.fillRect(90, 360, 20, 20);
        g.fillRect(90, 400, 20, 20);

        g.setColor(Color.GREEN);
        g.fillArc(85, 70, 30, 30, 0, 360);
        g.setColor(Color.ORANGE);
        g.fillArc(85, 120, 30, 30, 0, 360);
        g.setColor(Color.RED);
        g.fillArc(85, 170, 30, 30, 0, 360);

    }
}
