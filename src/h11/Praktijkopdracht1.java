package h11;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht1 extends Applet {
    TextField tekstvak;
    Button button;
    int tafel = 1;


    public void init() {
        tekstvak = new TextField("", 5);
        button = new Button("Ok");

        button.addActionListener(new ButtonListener());

        add(tekstvak);
        add(button);

    }


    public void paint(Graphics g) {
        int y = 20, keer = 1, uitvoer;

        while (keer <= 10 && tafel <= 10) {
            y += 20;
            uitvoer = keer * tafel;
            g.drawString(keer + " x " + tafel + " = " + uitvoer, 20, y);
            keer++;
        }

    }
    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            tafel = Integer.parseInt(s);
            repaint();

        }
    }
}
