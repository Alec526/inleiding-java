package h12;
// Maak een applet waarin vijf tekstvakken (uiteraard in een tabel) worden getoond.
// In de tekstvakken moet de gebruiker getallen in kunnen voeren.
// Als de gebruiker op de Ok-knop klikt worden de getallen in oplopende volgorde gesorteerd getoond in de tekstvakken.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class O123 extends Applet {

    int[] getallen = {0, 1, 2, 3, 4};
    TextField[] tekstvak;
    Button knop;
    String input0, input1, input2, input3, input4;
    String output0, output1, output2, output3, output4;

    public void init() {

        tekstvak = new TextField[5];
        knop = new Button("Ok");
        knop.addActionListener(new ButtonListener());

        add(knop);

        for (int repeat = 0; repeat < tekstvak.length; repeat++) {
            tekstvak[repeat] = new TextField("" + repeat);
            add(tekstvak[repeat]);
        }

    }

    public void paint(Graphics g) {

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input0 = tekstvak[0].getText();
            input1 = tekstvak[1].getText();
            input2 = tekstvak[2].getText();
            input3 = tekstvak[3].getText();
            input4 = tekstvak[4].getText();
            getallen[0] = Integer.parseInt(input0);
            getallen[1] = Integer.parseInt(input1);
            getallen[2] = Integer.parseInt(input2);
            getallen[3] = Integer.parseInt(input3);
            getallen[4] = Integer.parseInt(input4);
            Arrays.sort(getallen);
            output0 = Integer.toString(getallen[0]);
            output1 = Integer.toString(getallen[1]);
            output2 = Integer.toString(getallen[2]);
            output3 = Integer.toString(getallen[3]);
            output4 = Integer.toString(getallen[4]);
            tekstvak[0].setText(output0);
            tekstvak[1].setText(output1);
            tekstvak[2].setText(output2);
            tekstvak[3].setText(output3);
            tekstvak[4].setText(output4);

        }
    }
}
