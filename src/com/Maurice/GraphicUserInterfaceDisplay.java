package com.Maurice;

public class GraphicUserInterfaceDisplay implements IDisplayManager {

    @Override
    public void displayStdents(Student[] students) {
        System.out.println("Se implementeaza scriere in fisier GUI");
    }

    @Override
    public void displayTeachers(Profesor[] profesors) {
        System.out.println("Se  simplementeazacriere in fisier GUI");
    }

    @Override
    public void displayCourses(Curs[] cursuri) {
        System.out.println("Se implementeaza scriere in fisier GUI");
    }
}
