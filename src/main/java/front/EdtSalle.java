package front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EdtSalle extends JFrame {

    private JPanel mainPanel;
    private JButton bpRetour;

    public EdtSalle() {
        super();
        pageEDTS();
        setContentPane(mainPanel);
        bpRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PageCadre pageCadre = new PageCadre();
            }
        });
    }

    private void pageEDTS() {
        setVisible(true);
        setLocation(0, 0);
        setSize(4000, 4000);
        setTitle("Cadre");
        getContentPane().setBackground(Color.white);
    }
}
