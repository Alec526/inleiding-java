package h10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O104 extends Applet {

    int maand;
    TextField tekstvak;
    String s, tekst;
    Label label;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new Maand());
        tekst = "";

        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 80, 80);

    }

    class Maand implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch(maand) {
                case 1:
                    tekst = "Januari, 31 dagen";
                    break;
                case 2:
                    tekst = "Februari, 28 of 29 dagen";
                    break;
                case 3:
                    tekst = "Maart, 31 dagen";
                    break;
                case 4:
                    tekst = "April, 30 dagen";
                    break;
                case 5:
                    tekst = "Mei, 31 dagen";
                    break;
                case 6:
                    tekst = "Juni, 30 dagen";
                    break;
                case 7:
                    tekst = "July, 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus, 31 dagen";
                    break;
                case 9:
                    tekst = "September, 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober, 31 dagen";
                    break;
                case 11:
                    tekst = "November, 30 dagen";
                    break;
                case 12:
                    tekst = "December, 31 dagen";
                    break;
                default:
                    tekst = "Geen geldig maandnummer";
            }
            repaint();

        }
    }
}
