package front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//debut

public class interfacedocto extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton LOGINButton;
    private JPasswordField passwordField1;
    private JLabel merr;
    private JPanel Identifiant;
    private JPanel mdp;


    public interfacedocto() {
        super();
        initialisationFenetre();
        setContentPane(mainPanel);
            LOGINButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String enteredUsername = textField1.getText();
                    char[] enteredPasswordChars = passwordField1.getPassword();
                    String enteredPassword = new String(enteredPasswordChars);

                    if (!(textField1.getText().equals("x"))  || !(enteredPassword.equals("x"))) {
                        JOptionPane.showMessageDialog(LOGINButton, "Identifiant ou mot de passe incorrect ");
                    }
                    if ((textField1.getText().equals("x")) && (enteredPassword.equals("x"))) {
                        dispose();
                        PageCadre pageCadre = new PageCadre();
                    }
                }
            });
    }
    private void initialisationFenetre(){
        setVisible(true);
        setLocation(0,0);
        setSize(4000,1100);
        setTitle("Acceuil");
        getContentPane().setBackground(Color.white);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new interfacedocto();
            }
        });
    }


}
