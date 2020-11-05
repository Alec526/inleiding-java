package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O123 extends Applet {

    TextField[] tekstvak;
    Button knop;


    public void init() {

        tekstvak = new TextField[5];
        knop = new Button("Ok");
        knop.addActionListener(new ButtonListener());

        add(knop);

        for (int repeat = 0; repeat < tekstvak.length; repeat++) {
            tekstvak[repeat] = 100 * (repeat + 1);
        }

    }


    public void paint(Graphics g) {

        for (int repeat = 0; repeat < tekstvak.length; repeat++) {
            g.drawString("" + tekstvak[repeat], 50, 50 * repeat + 20);
        }

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
