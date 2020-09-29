package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class O82 extends Applet {
    
    Button knop1,knop2,knop3,knop4;
    int c1,c2,c3,c4,totaal;


    public void init() {

        knop1 = new Button("Man");
        knop2 = new Button("Vrouw");
        knop3 = new Button("Jongen");
        knop4 = new Button("Meisje");

        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;

        knop1.addActionListener(new Man());
        knop2.addActionListener(new Vrouw());
        knop3.addActionListener(new Jongen());
        knop4.addActionListener(new Meisje());

        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);

    }

    
    public void paint(Graphics g) {
        g.drawString("Mannen " + c1,50,60);
        g.drawString("Vrouwen " + c2,50,80);
        g.drawString("Jongens " + c3,50,100);
        g.drawString("Meiden " + c4,50,120);
        g.drawString("Totaal " + totaal,50,150);

    }

    class Man implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            c1++;
            totaal = c1 + c2 + c3 + c4;
            repaint();
        }
    }

    class Vrouw implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            c2++;
            totaal = c1 + c2 + c3 + c4;
            repaint();
        }
    }

    class Jongen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            c3++;
            totaal = c1 + c2 + c3 + c4;
            repaint();
        }
    }

    class Meisje implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            c4++;
            totaal = c1 + c2 + c3 + c4;
            repaint();
        }
    }
}
