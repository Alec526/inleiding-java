package h06;

import java.applet.Applet;
import java.awt.*;

public class O61 extends Applet {

    int a;
    int b;
    int uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = 113 / 4;


    }


    public void paint(Graphics g) {
        g.drawString("Jan", 100, 100);
        g.drawString("Ali", 100, 125);
        g.drawString("Jeanette", 100,150);
        g.drawString("Alec", 100,175);

        g.drawString("bedrag "+ uitkomst, 200, 100);
        g.drawString("bedrag "+ uitkomst, 200, 125);
        g.drawString("bedrag "+ uitkomst, 200, 150);
        g.drawString("bedrag "+ uitkomst, 200, 175);


    }
}
