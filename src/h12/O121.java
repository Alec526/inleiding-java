package h12;

import java.awt.*;
import java.applet.*;

public class O121 extends Applet {

    int[] cijfers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    double som = 0;

    public void init() {

    }

    public void paint(Graphics g) {

        for(int teller = 0; teller < cijfers.length; teller ++) {

            g.drawString("" + cijfers[teller], 50, 20 * teller + 20);

            som += cijfers[teller];

        }

        double gemiddelde = som / cijfers.length;
        g.drawString("gemiddelde: " + gemiddelde,50,cijfers.length * 20 + 40);

    }
}