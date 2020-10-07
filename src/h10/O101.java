package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class O101 extends Applet {

    TextField tekstvak;
    int hoogste, getal;
    String tekst;



    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new vak());
        tekst = "";

        add(tekstvak);

    }


    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);

    }

    class vak implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal > hoogste) {
                hoogste = getal;
                tekst = "hoogste getal tot nu toe is: " +hoogste;
                repaint();
            }




        }
    }


}
