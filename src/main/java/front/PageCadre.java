package front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageCadre extends JFrame{
    private JPanel mainPanel;
    private JButton edtGen;
    private JButton deco;
    private JButton edtMed;
    private JButton edtSalles;


    public PageCadre(){
        super();
        pageC();
        setContentPane(mainPanel);

        deco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                interfacedocto Acceuil = new interfacedocto();

            }
        });
        edtGen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Edt EdtGen = new Edt();
            }
        });
        edtSalles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                EdtSalle EdtSal = new EdtSalle();
            }
        });
        edtMed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                EdtMed EdtMed = new EdtMed();
            }
        });
    }

    private void pageC(){
        setVisible(true);
        setLocation(0,0);
        setSize(4000,4000);
        setTitle("Cadre");
        getContentPane().setBackground(Color.white);
    }
}

