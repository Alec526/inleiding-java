package h12;
// Maak een tabel, waarin elementen dezelfde waarde hebben.
// In de applet kan de gebruiker een waarde intikken.
// Vervolgens laat het programma de waarde zien en hoeveel keer de waarde voorkomt.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O126 extends Applet {
    int[] tabel = { 1, 2, 3, 4, 5 };
    TextField tekstvak;


    public void init() {
        tabel = new int[5];
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakListener());

        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("De waarde is: " + tabel[0], 100, 50);
        g.drawString("het komt " + tabel.length + " keer voor", 100, 70);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int i = 0;
            i = Integer.parseInt(s);
            for(int teller = 0; teller < tabel.length; teller++) {
                tabel[teller] = i;
            }
            repaint();
        }
    }
}
