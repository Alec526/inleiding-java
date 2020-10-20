package h10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O105 extends Applet {

    Button knop;
    TextField tekstvak;
    double cijfer, gemiddelde, totaal, getal, aantal;
    String tekst, tekst2;



    public void init() {
        tekstvak = new TextField();
        tekst = "";
        tekst2 = "";
        totaal = 0.0;
        gemiddelde = 0.0;
        aantal = 0.0;


        knop = new Button("Ok");
        knop.addActionListener(new button());

        add(tekstvak);
        add(knop);

    }


    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);
        g.drawString("gemiddelde: " +gemiddelde, 50, 65);

    }

    class button implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            getal = Double.parseDouble(s);

            totaal += getal;
            aantal++;
            gemiddelde = totaal / aantal;

            if (cijfer >= 5.5 && cijfer <= 10.0) {
                tekst = "Dit cijfer is voldoende: " +cijfer;
                repaint();
            }
            if (cijfer <= 5.4) {
                tekst = "Dit cijfer is onvoldoende: " +cijfer;
                repaint();
            }

        }
    }
}
