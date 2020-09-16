package h04;

import java.applet.Applet;
import java.awt.*;

public class O43 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.fillRect(100, 100, 10, 200);
        g.setColor(Color.red);
        g.fillRect(100, 100 , 150, 30);
       g.setColor(Color.white);
       g.fillRect(100, 130 , 150, 30);
       g.setColor(Color.BLUE);
       g.fillRect(100, 160 , 150, 30);

    }
}
