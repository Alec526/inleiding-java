package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekst1, tekst2;
    Button keer,deel,plus,min;
    double t1,t2,uitkomst;

    public void init() {
        tekst1 = new TextField(10);
        tekst2 = new TextField(10);

        keer = new Button("*");
        deel = new Button("/");
        plus = new Button("+");
        min = new Button("-");

        tekst1.addActionListener(new getallen());
        tekst2.addActionListener(new getallen());

        keer.addActionListener(new keer());
        deel.addActionListener(new deel());
        plus.addActionListener(new plus());
        min.addActionListener(new min());

        add(tekst1);
        add(tekst2);

        add(keer);
        add(deel);
        add(plus);
        add(min);

    }


    public void paint(Graphics g) {
        g.drawString("uitkomst = " + uitkomst, 50, 70);

    }

    class keer implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            uitkomst = t1 * t2;
            repaint();

        }
    }

    class deel implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            uitkomst = t1 / t2;
            repaint();

        }
    }

    class plus implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            uitkomst = t1 + t2;
            repaint();

        }
    }

    class min implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            uitkomst = t1 - t2;
            repaint();

        }
    }

    class getallen implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            t1 = Double.parseDouble(tekst1.getText());
            t2 = Double.parseDouble(tekst2.getText());
            repaint();

        }
    }
}
