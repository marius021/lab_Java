package com.Maurice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.*;

enum LOAD_TYPE
{
    HARDCODAT, KEYBOARD, FILE
}

enum DISPLAY_TYPE
{
    CONSOLA, FISIER, GUI
}


public class TestClass
{

    public static void main(String[] args)
    {

        JFrame frame = new JFrame("Graphic user interface");
        LoginForm loginForm = new LoginForm(frame);
        frame.setContentPane(loginForm.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Settings.appSettings();
        IDataLoader dataLoader;
        List<Student> studenti = new ArrayList<Student>();
        List<Curs> cursuri = new ArrayList<Curs>();
        List<Profesor> profesori = new ArrayList<Profesor>();


        if(Settings.loadType == LOAD_TYPE.HARDCODAT) {
            studenti = Arrays.asList(Settings.dataLoaderHashMap.get(LOAD_TYPE.HARDCODAT).createStudentsData());
        }else if(Settings.loadType == LOAD_TYPE.HARDCODAT){
            cursuri = Arrays.asList(Settings.dataLoaderHashMap.get(LOAD_TYPE.HARDCODAT).createCoursesData());
        }else{
            profesori = Arrays.asList(Settings.dataLoaderHashMap.get(LOAD_TYPE.HARDCODAT).createProfesorData());
         }

        if (Settings.loadType == LOAD_TYPE.FILE) {
            studenti = Arrays.asList(Settings.dataLoaderHashMap.get(LOAD_TYPE.FILE).createStudentsData());
        }else if(Settings.loadType == LOAD_TYPE.FILE) {
            cursuri = Arrays.asList(Settings.dataLoaderHashMap.get(LOAD_TYPE.FILE).createCoursesData());
        }else {
            profesori = Arrays.asList(Settings.dataLoaderHashMap.get(LOAD_TYPE.FILE).createProfesorData());
        }

        if (Settings.loadType == LOAD_TYPE.KEYBOARD) {
            studenti = Arrays.asList(Settings.dataLoaderHashMap.get(LOAD_TYPE.KEYBOARD).createStudentsData());
        }else if(Settings.loadType == LOAD_TYPE.KEYBOARD) {
            cursuri = Arrays.asList(Settings.dataLoaderHashMap.get(LOAD_TYPE.KEYBOARD).createCoursesData());
        }else {
            profesori = Arrays.asList(Settings.dataLoaderHashMap.get(LOAD_TYPE.KEYBOARD).createProfesorData());
        }

        ApplicationData.cursuri = cursuri;
        ApplicationData.studenti = studenti;
        ApplicationData.profesori = profesori;

        ManagerCursuri m = new ManagerCursuri();
        m.cursuri = cursuri;




                }
            }

        /*
       Scanner sc = new Scanner(System.in);
        System.out.println("Username = ");
        var username = sc.next();
        System.out.println("Password = ");
        var password = sc.next();

        try {
            Application.getInstance().login(new User(username, password));
            System.out.println(Application.getInstance().currentUser);
            System.out.println(Application.getInstance().currentUser.menuStrategy.getAccountMolderInformation());
            System.out.println(Application.getInstance().currentUser.menuStrategy.getAccountType());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
                */
