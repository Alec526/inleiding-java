package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    double a, b, c, uitkomst, uitkomst1, uitkomst2, uitkomst3, uitkomst4;
    int d, e;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        uitkomst = (a + b + c) / d;
        uitkomst1 = e * uitkomst;
        uitkomst2 = (int) uitkomst1;
        uitkomst3 = uitkomst2;
        uitkomst4 = uitkomst3 / e;


    }


    public void paint(Graphics g) {
        g.drawString("uitkomst: "+uitkomst4, 100, 100);

    }
}
