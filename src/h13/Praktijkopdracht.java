package h13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    int y = 0;

    public void init() {

    }

    public void paint(Graphics g) {

        for (int i = 0; i <= 400 ; i+=90) {
            boom(g, i,50);
            boom(g, i,200);
        }

    }

    public void boom( Graphics g, int x, int y) {

        setSize(800, 500);

        g.setColor(Color.ORANGE);
        g.fillRect(x, y, 20, 80);

        g.setColor(Color.GREEN);
        g.fillOval(x-30, y-40, 80, 80);
    }
}
