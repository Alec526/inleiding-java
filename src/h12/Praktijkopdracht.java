package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    int i = 0;
    TextField tekstvak1, tekstvak2;
    String[] namen, nummers;
    Button knop;

    public void init() {
        tekstvak1 = new TextField("naam");
        tekstvak2 = new TextField("nummer");
        namen = new String[10];
        nummers = new String[10];
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());

        add(tekstvak1);
        add(tekstvak2);
        add(knop);

    }


    public void paint(Graphics g) {
        if (i <=10) {
            int y = 50;
            for (int i = 0; i < 10 ; i++) {
                g.drawString(String.valueOf(namen[i]),20, y);
                g.drawString(String.valueOf(nummers[i]),50,y);
                y += 20;
            }
        }

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String naam = tekstvak1.getText();
            String nummer = tekstvak2.getText();
            if(i <= namen.length) {
                namen[i] = naam;
                nummers[i] = nummer;
                i++;
            }
            repaint();

        }
    }
}
