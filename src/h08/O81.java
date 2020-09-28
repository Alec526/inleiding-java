package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class O81 extends Applet {
    Button knop;
    Button knop2;
    Button knop3;
    Label label;
    TextField tekstvak;


    public void init() {

        label = new Label("Type hier iets");
        knop = new Button();
        knop2 = new Button();
        knop3 = new Button();

        tekstvak = new TextField("tekst wooo", 20);
        knop.setLabel("Ok");
        knop2.setLabel("Reset");
        knop3.setLabel("text komt hier");
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new Knop2Listener());


        add(label);
        add(knop);
        add(knop2);
        add(knop3);
        add(tekstvak);



    }


    public void paint(Graphics g) {
        knop3.setLocation(70, 100);
        knop3.setSize(200, 20);



    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message = tekstvak.getText();
            knop3.setLabel(message);
            repaint();



        }
    }

    class Knop2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            tekstvak.setText("");
            knop3.setLabel("");
            repaint();



        }
    }


}
