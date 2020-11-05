package h12;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {
    int[] array;

    public void init() {

    }

    public void paint(Graphics g) {
        array = new int[5];

        for (int i = 0; i < array.length ; i++) {
            array[i] = 1 * (i + 1);
            g.drawString("" + array[i], 50, 30 * i + 20);

        }

    }
}
