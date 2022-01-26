package com.Maurice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpForm extends JDialog {
    public User user; // creat pentru pagina de login
    private JTextField textNume;
    private JTextField textPrenume;
    private JPasswordField password;
    private JButton registerButton;
    private JButton cancelButton;
    private JPasswordField passwordConf;
    private JLabel nume;
    private JLabel prenume;
    private JLabel parola;
    private JLabel confParola;
    private JPanel signupPanel;

    public SignUpForm(JFrame parent){
        super(parent);
        setTitle("Creati un cont nou");
        setContentPane(signupPanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

}
