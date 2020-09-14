package h02;

import java.awt.*;
import java.applet.Applet;

public class Show extends Applet {

    public void init() {
        setBackground(Color.BLUE);

    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Alec Arnaoutoglou", 50, 60);
    }
}
