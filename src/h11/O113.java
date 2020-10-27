package h11;

import java.applet.Applet;
import java.awt.*;

public class O113 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int getal1 = 1, getal2 = 1, getal, x = 160;

        g.drawString("" +getal2, 50, 30);
        g.drawString("" +getal1, 80, 30);

        while(true) {
            getal = getal1 + getal2;
            if (getal > 5000) break;
            g.drawString("" + getal, x, 30);
            x += 40;
            getal2 = getal1;
            getal1 = getal;
        }


    }
}
