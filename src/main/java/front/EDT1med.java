package front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EDT1med extends JFrame {

    private JPanel mainPanel;
    private JButton bpRetour;

    public EDT1med() {
        super();
        pageEDT1M();
        setContentPane(mainPanel);
        bpRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                interfacedocto Acceuil = new interfacedocto();
            }
        });
    }

    private void pageEDT1M() {
        setVisible(true);
        setLocation(0, 0);
        setSize(4000, 4000);
        setTitle("Medecin");
        getContentPane().setBackground(Color.white);
    }
}
