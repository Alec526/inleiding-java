package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O83 extends Applet {

    Button knop1;
    TextField tekstvak;
    Label label;

    double getal;


    public void init() {

        knop1 = new Button("Ok");
        label = new Label();
        tekstvak = new TextField();

        knop1.addActionListener(new Ok());
        tekstvak.addActionListener(new Uitkomst());

        add(knop1);
        add(tekstvak);
        add(label);

    }


    public void paint(Graphics g) {
        tekstvak.setSize(70, 25);
        g.drawString("Bedrag +btw = " + getal ,50, 50);

    }

    class Ok implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            getal = getal/100*121;
            repaint();
        }
    }

    class Uitkomst implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String som = tekstvak.getText();
            getal = Double.parseDouble(som);
            repaint();
        }

    }
}
