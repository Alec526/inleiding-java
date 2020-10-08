package h10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O103 extends Applet {

    int maand, jaar;
    TextField tekstvak, tekstvak2;
    String s, tekst, tekst2;
    Label label, label2;


    public void init() {
        setSize(1000, 300);
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        label2 = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener(new Maand());
        tekstvak.addActionListener(new Jaar());
        tekst = "";
        tekst2 = "";

        add(label);
        add(label2);
        add(tekstvak);
        add(tekstvak2);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 80, 80);
        g.drawString(tekst2, 100, 80);

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

    class Jaar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            jaar = Integer.parseInt( s);
            if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0 ) {
                tekst = ""+ jaar + " is een schrikkeljaar";
            }
            else {
                tekst = ""+ jaar + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
