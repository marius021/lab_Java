package com.Maurice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.FileHandler;

public class SignUpForm extends JDialog {
    public User user; // creat pentru pagina de login
    private JTextField textNume;
    private JTextField textPrenume;
    private JButton registerButton;
    private JButton cancelButton;
    private JLabel nume;
    private JLabel prenume;
    private JLabel parola;
    private JPanel signupPanel;
    private JTextField textGrupa;
    private JPasswordField passwordField1;
    private JComboBox roleChoosen;
    private JTextField textUsername;

    public JPanel getSignupPanel()
    {
        return this.signupPanel;
    }

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
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == registerButton) {
                    String username = textUsername.getText();
                    String nume = textNume.getText();
                    String prenume = textPrenume.getText();
                    String password = passwordField1.getText();
                    String grupa = textGrupa.getText();

                    int accountTypeIndex = roleChoosen.getSelectedIndex();
                    UserAccountType accountType = accountTypeIndex == 0 ? UserAccountType.TEACHER : UserAccountType.STUDENT;
                    if (username.length() == 0 || password.length() == 0 || nume.length() == 0 || prenume.length() == 0) {
                        JOptionPane.showMessageDialog(null, "Introdu parametrii ceruti.", "EROARE", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    if(accountType == UserAccountType.STUDENT) {
                        Student studentToCreate = new Student(nume, prenume, Integer.parseInt(grupa));
                        System.out.println(studentToCreate);
                        if (ApplicationData.studenti.indexOf(studentToCreate) != -1) {
                            JOptionPane.showMessageDialog(null, "User student a fost creat.");
                            User newUser = new User();
                            newUser.userName = username;
                            newUser.password = password;
                            newUser.studentAcc = studentToCreate;
                            newUser.menuStrategy = new StudentStrategy(studentToCreate);
                            List<User> users = Application.getInstance().getUserList();
                            users.add(newUser);
                            Application.getInstance().setUserList(users);
                            FileManager.XMLUsers(Application.getInstance().getUserList());
                            signupPanel.setVisible(false);
                            parent.setContentPane(new LoginForm(parent).getMainPanel());
                        } else {
                            JOptionPane.showMessageDialog(null, "Student inexistent", "EROARE", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                    }else if (accountType == UserAccountType.TEACHER) {

                        Profesor profesorToCreate = new Profesor(nume, prenume);

                        if (ApplicationData.profesori.indexOf(profesorToCreate) != -1) {
                            JOptionPane.showMessageDialog(null, "User profesor a fost creat");
                            User newUser = new User();
                            newUser.userName = username;
                            newUser.password = password;
                            newUser.profesorAcc = profesorToCreate;
                            newUser.menuStrategy = new TeacherStrategy(profesorToCreate);
                            List<User> users = Application.getInstance().getUserList();
                            users.add(newUser);
                            Application.getInstance().setUserList(users);
                            FileManager.XMLUsers(Application.getInstance().getUserList());
                            signupPanel.setVisible(false);
                            parent.setContentPane(new LoginForm(parent).getMainPanel());
                        } else {
                            JOptionPane.showMessageDialog(null, "Profesor inexistent", "EROARE", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                    }
                        }

                    }
                });

            };


        };





