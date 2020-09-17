package h04;

import java.applet.Applet;
import java.awt.*;

public class O44 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.drawString("Gewicht", 160, 60);

        g.drawString("0 kg", 50, 290);
        g.drawString("20 kg",45, 250);
        g.drawString("40 kg", 45, 210);
        g.drawString("60 kg", 45, 170);
        g.drawString("80 kg", 45, 130);
        g.drawString("100 kg", 40, 90);

        g.drawLine(80, 80, 80, 280);
        g.drawLine(80, 280, 280, 280);

        g.drawLine(80, 240, 280, 240);
        g.drawLine(80, 200, 280, 200);
        g.drawLine(80, 160, 280, 160);
        g.drawLine(80, 120, 280, 120);
        g.drawLine(80, 80, 280, 80);

        g.setColor(Color.red);
        g.fillRect(110, 200, 12, 80);
        g.drawString("Valerie", 100, 300);
        g.drawString("40 kg", 105, 320);

        g.setColor(Color.GREEN);
        g.fillRect(170, 120, 12, 160);
        g.drawString("Hans", 160, 300);
        g.drawString("80 kg", 160, 320);

        g.setColor(Color.BLUE);
        g.fillRect(230, 80, 12, 200);
        g.drawString("Jeroen", 220, 300);
        g.drawString("100 kg", 225, 320);

    }
}
