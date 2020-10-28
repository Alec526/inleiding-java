package h11;

import java.applet.Applet;
import java.awt.*;

public class O118 extends Applet {


    public void init() {
        setSize(800, 800);

    }


    public void paint(Graphics g) {
        int x = 5, y = 5, circle = 5;

        while(circle <=1000) {
            circle += 10;
            g.drawOval(x, y, circle, circle);
        }

    }
}
