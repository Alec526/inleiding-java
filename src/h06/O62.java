package h06;

import java.applet.Applet;
import java.awt.*;

public class O62 extends Applet {

    int a;
    int b;
    int c;
    int uitkomst;
    int uitkomst1;
    int uitkomst2;


    public void init() {
        a = 60;
        b = 24;
        c = 365;
        uitkomst = 60 * 60;
        uitkomst1 = 60 * 60 * 24;
        uitkomst2 = 60 * 60 * 24 * 365;

    }


    public void paint(Graphics g) {
        g.drawString("Seconden in een uur:", 80, 100);
        g.drawString("Seconden in een dag:", 80, 125);
        g.drawString("Seconden in een jaar:", 80, 150);

        g.drawString("Sec "+ uitkomst, 225, 100);
        g.drawString("Sec "+ uitkomst1, 225, 125);
        g.drawString("Sec "+ uitkomst2, 225, 150);

    }
}
