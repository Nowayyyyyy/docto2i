package front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EdtMed extends JFrame {

    private JPanel mainPanel;
    private JButton bpRetour;

    public EdtMed() {
        super();
        pageEDTM();
        setContentPane(mainPanel);
        bpRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PageCadre pageCadre = new PageCadre();
            }
        });
    }

    private void pageEDTM() {
        setVisible(true);
        setLocation(0, 0);
        setSize(4000, 4000);
        setTitle("Cadre");
        getContentPane().setBackground(Color.white);
    }
}
