package com.Maurice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class TestClass
{

    public static void main(String[] args)
    {
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


        DataManager dataManager = new DataManager();

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
