package com.Maurice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

enum LOAD_TYPE
{
    HARDCODAT, KEYBOARD, FILE
}

enum DYSPLAY_TYPE
{
    CONSOLA, FISIER, GUI
}


public class TestClass
{

    public static void main(String[] args)
    {
        Settings.initApplication();

        System.out.println(Settings.loadType);

        IDataLoader dataLoader = Settings.loadType == LOAD_TYPE.HARDCODAT ? new HardcodatDataManager() : new FileDataManager();

        Profesor[] profesors = dataLoader.createProfesorData();
        for(Profesor p :
                profesors)
        {
            System.out.println(p);
        }

        System.out.println(dataLoader.createProfesorData());

        if(Settings.loadType == LOAD_TYPE.FILE)
        {
            // faci citire din fisier
        } else {
            if (Settings.loadType == LOAD_TYPE.KEYBOARD) {
                // faci citire de la tastatura
            } else {
                if (Settings.loadType == LOAD_TYPE.HARDCODAT) {
                    // faci citire din clasa hardcodat
                }
            }
        }
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("a = ");
//		String a = scanner.next();
//		try
//		{
//			int aCaNrIntreg = Integer.parseInt(a);
//			System.out.println("Am citit " + aCaNrIntreg);
//		}
//		catch (Exception e)
//		{
//			System.out.println(e.getMessage());
//		}  //exemplu citire de la tastatura

        String propertyName = LOAD_TYPE.FILE.name();
        System.out.println(propertyName);
        ArrayList<Student> students = new ArrayList<>();

        HardcodatDataManager dataManager = new HardcodatDataManager();

        dataManager.gradeStudents();
        dataManager.manager.reportAllCourses();
        dataManager.manager.reportAllStudentsGrades();
        dataManager.manager.reportAllCourses();
        try
        {
            dataManager.manager.RemoveCurs(new Curs("PLCP 1"));
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Dupa stergere:");
        dataManager.manager.reportAllCourses();

        dataManager.manager.reportAllStudentsGrades();

        try
        {
            dataManager.manager.EditCurs(new Curs("Limba engleza"), new Curs("Limba engleza II", "descriere", new Profesor("Ana", "Maria"), dataManager.createRandomSetOfStudents()));
            dataManager.manager.reportAllCourses();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        HashMap<Integer, ArrayList<Student>>GrupareStudentiDupaGrupa = new HashMap<Integer, ArrayList<Student>>();
        int grupa = 1;
        Student s = new Student("Razvan","Popescu",1);
        if (!GrupareStudentiDupaGrupa.containsKey(grupa))
        {
            ArrayList<Student> list = new ArrayList<Student>();
            list.add(s);

            GrupareStudentiDupaGrupa.put(grupa, list);
        }
        else
        {
            GrupareStudentiDupaGrupa.get(grupa).add(s);
        }

        GrupareStudentiDupaGrupa.get(grupa);
        ArrayList<Student> studenti2 = GrupareStudentiDupaGrupa.get(1);

        Collections.sort(studenti2);


    }
}
