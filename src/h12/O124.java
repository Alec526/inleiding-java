package h12;
//Maak een applet met een tabel met getallen, waarin de gebruiker een getal kan intikken in een tekstvak.
//Als de gebruiker op de OK-knop klikt dan wordt de waarde opgezocht in de tabel en staat op het scherm niet alleen dat de waarde is gevonden maar ook de index.
//Als de waarde niet is gevonden dan wordt daarvan melding gedaan.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O124 extends Applet {
    int[] getallen = {3, 6, 12, 24, 48};
    TextField tekstvak;
    Button knop;
    boolean search = false;
    String found = "";

    public void init() {
        tekstvak = new TextField();
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());

        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int i = 0, gezocht = 0;
            String s = tekstvak.getText();
            gezocht = Integer.parseInt(s);

            while (i < getallen.length) {
                if (getallen[i] == gezocht) {
                    search = true;
                    found = s + "Dit getal staat in de tabel.";
                } else {
                    search = false;
                    found = s + "Dit getal staat niet in de tabel.";
                    i++;
                }
            }
            repaint();
        }
    }

}
