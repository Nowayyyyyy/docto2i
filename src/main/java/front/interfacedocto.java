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
                    String enteredPassword1 = new String(enteredPasswordChars);
                    char[] enteredPasswordChars2 = passwordField1.getPassword();
                    String enteredPassword2 = new String(enteredPasswordChars2);

                    if ((!(textField1.getText().equals("x"))  || !(enteredPassword1.equals("x"))) && ( !(textField1.getText().equals("y")) || !(enteredPassword2.equals("y"))))  {
                        JOptionPane.showMessageDialog(LOGINButton, "Identifiant ou mot de passe incorrect ");
                    }
                    if ((textField1.getText().equals("x")) && (enteredPassword1.equals("x"))) {
                        dispose();
                        PageCadre pageCadre = new PageCadre();
                    }
                    if ((textField1.getText().equals("y")) && (enteredPassword1.equals("y"))) {
                        dispose();
                        EDT1med page1Med = new EDT1med();
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
