package h11;

import java.applet.Applet;
import java.awt.*;

public class O114 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        int teller = 3, teller2 = 1, y = 0, y2 = 0;

        while (teller <= 30) {
            y += 20;
            g.drawString("" + teller, 100, y);
            teller+=3;
        }

        for(teller2 = 1; teller2 <= 10; teller2++) {
            y2 += 20;
            g.drawString("3 x " +teller2, 45, y2);
        }


    }
}
