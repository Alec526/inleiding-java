package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht2 extends Applet {
    Button button;
    int tafel = 1;

    public void init() {
        button = new Button("OK");

        button.addActionListener(new ButtonListener());

        add(button);

    }

    public void paint(Graphics g) {
        int y = 50,keer = 1, uitvoer;

        while(keer  <= 10 && tafel <= 10) {
            y+= 20;
            uitvoer = keer * tafel;
            g.drawString(keer + " x " + tafel + " = " + uitvoer,20,y);
            keer++;
        }
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel++;
            repaint();
        }
    }
}