package h13;

import java.applet.Applet;
import java.awt.*;

public class O132 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        tekenMuurBaksteen(g, 40, 40, 150, 40, 140, 110, 50);
    }

    public void tekenMuurBaksteen (Graphics g, int x1, int y1, int width, int height, int x3, int y3, int y4){
        setBackground(Color.gray);
        for (int i = 0; i < 9; i++) {
            g.setColor(Color.ORANGE);
            g.fillRect(x1, y1, width, height);
            x1 += 200;
        } for (int i = 0; i < 8; i++) {
            g.setColor(Color.ORANGE);
            g.fillRect(x3, y3, width, height);
            x3 += 200;

            y4 += 250;
        }

    }

}
