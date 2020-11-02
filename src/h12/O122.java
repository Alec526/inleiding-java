package h12;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class O122 extends Applet {
    Button[] knop;

    public void init() {
        int teller = 0;
        knop = new Button[25];

        for(teller = 0; teller < knop.length; teller ++) {
            knop[teller] = new Button("knop" + teller);
            add(knop[teller]);
        }

    }


    public void paint(Graphics g) {

    }
}
