package h11;

import java.applet.Applet;
import java.awt.*;

public class O119 extends Applet {


    public void init() {
        setSize(400, 400);

    }


    public void paint(Graphics g) {
        setBackground(Color.gray);
        int x = 50;
        int y = 50;
        int b = 20;
        int h = 20;


        for (int kolom = 0; kolom < 8; kolom++) {
            for (int kolom2 = 0; kolom2 < 8; kolom2++) {
                if (kolom % 2 == 0) {
                    if (kolom2 % 2 == 0){
                        g.setColor(Color.white);
                        g.fillRect(x, y, b, h);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, b, h);
                    }
                } else {
                    if (kolom2 % 2 == 1){
                        g.setColor(Color.white);
                        g.fillRect(x, y, b, h);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, b, h);
                    }
                }
                x += b
            }
            x = 50;
            y += h;


        }


    }
}
