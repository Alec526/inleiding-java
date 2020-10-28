package h11;

import java.applet.Applet;
import java.awt.*;

public class O115 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        int rect = 0, x = 50, y = 50;

        for (rect = 1; rect <= 5; rect++) {
            x += 30;
            y += 30;

            g.drawRect(x, y, 30, 30);
        }

    }
}
