package com.Maurice;

public class Settings {
   public static String STUDENTS_PATH= "studenti.csv";
   public static String TEACHERS_PATH= "profesori.csv";
   public static String COURSES_PATH = "cursuri.csv";
   public static LOAD_TYPE loadType = LOAD_TYPE.HARDCODAT;
   public static DYSPLAY_TYPE displayType = DYSPLAY_TYPE.CONSOLA;  // eroare daca scriu DISPLAY_TYPE

   public static void initApplication(){
      // read settings.txt and init all values from the file
   }


}
