package h02;

import java.applet.Applet;
import java.awt.*;

public class Show2 extends Applet {

    public void init() {
        setBackground(Color.white);

    }


    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Alec", 50, 50);
        g.setColor(Color.red);
        g.drawString("Arnaoutoglou", 50, 60);

    }
}
