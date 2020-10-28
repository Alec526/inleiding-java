package h11;

import java.applet.Applet;
import java.awt.*;

public class O117 extends Applet {


    public void init() {
        setSize(700, 600);

    }


    public void paint(Graphics g) {
        int circle = 5, x = 300, y = 300;

        while(circle <= 500) {
            x -= 5;
            y -= 5;
            circle += 10;

            g.drawOval(x, y, circle, circle);
        }

    }
}
