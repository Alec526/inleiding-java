package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {
        setSize(900, 300);


    }


    public void paint(Graphics g) {
        g.drawString("Lijn", 130, 40);
        g.drawString("Rechthoek", 110, 170);
        g.drawString("Afgeronde Rechthoek", 90, 300);
        g.drawString("Gevulde rechthoek met ovaal", 360, 170);
        g.drawString("Gevulde ovaal", 390, 300);
        g.drawString("Taartpunt met ovaal eromheen", 640, 170);
        g.drawString("Cirkel", 725, 300);


        g.drawOval(600, 50, 250, 100);
        g.drawOval(690, 180, 100, 100);

        g.drawLine(20, 20, 270, 20);
        g.drawRect(20, 50, 250, 100);
        g.drawRoundRect(20, 180, 250, 100, 30, 30);

        g.setColor(Color.MAGENTA);
        g.fillRect(320, 50, 250, 100);
        g.fillOval(320, 180, 250, 100);
        g.fillArc(600, 50, 250, 100, 0, 45);
        g.setColor(Color.BLACK);
        g.drawOval(320, 50, 250, 100);



    }
}
