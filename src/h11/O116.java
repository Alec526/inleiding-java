package h11;

import java.applet.Applet;
import java.awt.*;

public class O116 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        int circle = 10, x = 200, y = 200;

        while(circle <= 100) {
            x -= 10;
            y -= 10;
            circle += 20;

            g.drawOval(x, y, circle, circle);
        }

    }
}
