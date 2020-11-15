package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O133 extends Applet {

    Button knop1, knop2;
    boolean showMuurBaksteen = false;
    boolean showMuurBeton = false;

    public void init() {

        knop1 = new Button("BaksteenMuur");
        knop2 = new Button("BetonMuur");

        knop1.addActionListener(new KnopListener());
        knop2.addActionListener(new Knop2Listener());

        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {
        if(showMuurBaksteen){
            tekenMuurBaksteen(g, 30, 30, 130, 100, 30, 170, 130, 240, 30, 310, 130, 380, 150, 40);
        }
        if (showMuurBeton){
            tekenMuurBeton(g, 30, 30, 130, 100, 30, 170, 130, 240, 30, 310, 130, 380, 180, 60);
        }

    }

    public void tekenMuurBaksteen (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6, int width, int height){

        setSize(1800, 500);
        setBackground(Color.gray);

        int times = 6;
        int x = x1;
        int y = y1;

        for (int current = 0; current < times; current++){
            for (int i = 0; i < 8; i++) {
                g.setColor(Color.red);
                g.fillRect(x, y, width, height);
                x += 200;
            }
            if (current % 2 == 0){
                x = 0;
            } else {
                x = 50;
            }
            y += 70;
        }

    }

    public void tekenMuurBeton (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6, int width, int height){

        setSize(1800, 500);
        setBackground(Color.WHITE);

        int times = 6;
        int x = x1;
        int y = y1;

        for (int current = 0; current < times; current++) {
            for (int i = 0; i < 8; i++) {
                g.setColor(Color.gray);
                g.fillRect(x, y, width, height);
                x += 200;
            }
            if (current % 2 == 0){
                x = 0;
            } else {
                x = 50;
            }
            y += 70;
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            showMuurBaksteen = true;
            showMuurBeton = false;
            repaint();

        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            showMuurBeton = true;
            showMuurBaksteen = false;
            repaint();

        }
    }
}
