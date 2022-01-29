package com.Maurice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherForm {
    private JFrame owner;
    public JPanel getPanel1(){
        return panel1;
    }

     TeacherForm(JFrame mainFrame) {
        owner = mainFrame;
        owner.setSize(300,350);
        cursuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == cursuriButton)
                {

                }

            }
        });
         studentiLaCursButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

             }
         });
         notareStudentButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

             }
         });
     }


        private JPanel panel1;
        private JButton cursuriButton;
        private JButton notareStudentButton;
        private JButton studentiLaCursButton;

}
