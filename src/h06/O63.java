package h06;

import java.applet.Applet;
import java.awt.*;

public class O63 extends Applet {

    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 2147483647;
        b = 1073741823;
        uitkomst = 2147483647 + 1073741823;

    }


    public void paint(Graphics g) {
        g.drawString("uitkomst: "+uitkomst, 100, 100);

    }
}
