package com.Maurice;

import com.Maurice.ManagerCursuri;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class StudentForm {
    ManagerCursuri cursuri = new ManagerCursuri();

    public StudentForm(ManagerCursuri cursuri) {
        afiseazaCursuriButton.addActionListener(new ActionListener() {
            String nume = textField1.getText();
            String prenume = textField2.getText();

            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null, "Login successfully");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());

                }
            }
        });
    }

    public JPanel getPanel1() {
        return panel2;
    }

    private JPanel panel2;
    private JTextField textField1;
    private JTextField textField2;
    private JButton afiseazaCursuriButton;
    private JButton afiseazaMediaButton;
    private JButton afiseazaRestanteButton;
}
