package h11;

import java.applet.Applet;
import java.awt.*;

public class K118 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        int x = 50;
        int y = 50;
        int breedte = 20;
        int hoogte = 20;
        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom ==0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for(int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
    }
}