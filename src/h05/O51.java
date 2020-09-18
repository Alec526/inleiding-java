package h05;

import java.applet.Applet;
import java.awt.*;

public class O51 extends Applet {

    // Int = geheel getal
    // Double = kommagetal
    // Boolean = true/false

    int breedte, hoogte;

    Color vormKleur = Color.MAGENTA;
    Color lijnKleur = Color.BLACK;

    public void init() {
        setSize(900, 300);

        breedte = 250;
        hoogte = 100;
        vormKleur = Color.MAGENTA;
        lijnKleur = Color.BLACK;

    }


    public void paint(Graphics g) {
        g.drawString("Lijn", 130, 40);
        g.drawString("Rechthoek", 110, 170);
        g.drawString("Afgeronde Rechthoek", 90, 300);
        g.drawString("Gevulde rechthoek met ovaal", 360, 170);
        g.drawString("Gevulde ovaal", 390, 300);
        g.drawString("Taartpunt met ovaal eromheen", 640, 170);
        g.drawString("Cirkel", 725, 300);


        g.drawOval(600, 50, breedte, hoogte);
        g.drawOval(690, 180, 100, hoogte);

        g.drawLine(20, 20, 270, 20);
        g.drawRect(20, 50, breedte, hoogte);
        g.drawRoundRect(20, 180, breedte, hoogte, 30, 30);

        g.setColor(vormKleur);
        g.fillRect(320, 50, breedte, hoogte);
        g.fillOval(320, 180, breedte, hoogte);
        g.fillArc(600, 50, breedte, hoogte, 0, 45);
        g.setColor(lijnKleur);
        g.drawOval(320, 50, breedte, hoogte);

    }
}
