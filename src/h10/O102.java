package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class O102 extends Applet {

    TextField tekstvak;
    int hoogste, laagste, getal, getal2;
    String tekst, tekst2;



    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new vak());
        tekst = "";
        tekst2 = "";

        add(tekstvak);

    }


    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);
        g.drawString(tekst2, 50, 65);

    }

    class vak implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            getal2 = Integer.parseInt(s);

            if (getal > hoogste) {
                hoogste = getal;
                tekst = "hoogste getal tot nu toe is: " +hoogste;
                repaint();
            }
            if (getal < hoogste) {
                laagste = getal;
                tekst2 = "laagste getal tot nu toe is: " +laagste;
                repaint();
            }

        }
    }


}
