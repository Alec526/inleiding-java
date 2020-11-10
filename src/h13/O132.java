package h13;

import java.applet.Applet;
import java.awt.*;

public class O132 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        tekenMuurBaksteen(g, 30, 30, 130, 100, 30, 170, 130, 240, 30, 310, 130, 380, 150, 40);
    }

    public void tekenMuurBaksteen (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6, int width, int height){
        setSize(1800, 500);
        setBackground(Color.gray);
        for (int i = 0; i < 8; i++) {
            g.setColor(Color.red);
            g.fillRect(x1, y1, width, height);
            x1 += 200;
        } for (int i = 0; i < 8; i++) {
            g.setColor(Color.red);
            g.fillRect(x2, y2, width, height);
            x2 += 200;
        } for (int i = 0; i < 8; i++) {
            g.setColor(Color.red);
            g.fillRect(x3, y3, width, height);
            x3 += 200;
        } for (int i = 0; i < 8; i++) {
            g.setColor(Color.red);
            g.fillRect(x4, y4, width, height);
            x4 += 200;
        } for (int i = 0; i < 8; i++) {
            g.setColor(Color.red);
            g.fillRect(x5, y5, width, height);
            x5 += 200;
        }
        for (int i = 0; i < 8; i++) {
            g.setColor(Color.red);
            g.fillRect(x6, y6, width, height);
            x6 += 200;
        }

    }

}
