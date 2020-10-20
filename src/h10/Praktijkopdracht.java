package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    int getal;
    String tekst;
    TextField tekstvak;


    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);
        tekst = "";

    }


    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);

    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            switch (getal) {

            case 1:
            case 2:
            case 3:
            tekst = "Slecht";
            break;

            case 4:
            tekst = "Onvoldoende";
            break;

            case 5:
            tekst = "Matig";
            break;

            case 6:
            case 7:
            tekst = "Voldoende";
            break;

            case 8:
            case 9:
            case 10:
            tekst = "Goed";
            break;

            default:
            tekst = "Ongeldig getal ingevoerd";
            break;
        }
        repaint();

        }
    }
}
