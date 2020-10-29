package h11;

import java.applet.Applet;
import java.awt.*;

public class O119 extends Applet {


    public void init() {
        setSize(800, 800);

    }


    public void paint(Graphics g) {
        setBackground(Color.gray);
        int x = 50;
        int y = 50;
        int b = 20;
        int h = 20;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, b, h);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, b, h);
            }
            x += b;
        }
        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, b, h);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, b, h);
            }
            x += b;
        }
        x = 50;
        y += h;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, b, h);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, b, h);
            }
            x += b;
        }
        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, b, h);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, b, h);
            }
            x += b;
        }
        x = 50;
        y += h;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, b, h);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, b, h);
            }
            x += b;
        }
        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, b, h);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, b, h);
            }
            x += b;
        }
        x = 50;
        y += h;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, b, h);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, b, h);
            }
            x += b;
        }
        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, b, h);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, b, h);
            }
            x += b;
        }
        x = 50;
        y += h;

    }
}
