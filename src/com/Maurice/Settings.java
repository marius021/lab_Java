package com.Maurice;

import java.util.HashMap;

public class Settings {
   public static String STUDENTS_PATH= "studenti.csv";
   public static String TEACHERS_PATH= "profesori.csv";
   public static String COURSES_PATH = "cursuri.csv";
   public static LOAD_TYPE loadType = LOAD_TYPE.HARDCODAT;
   public static DYSPLAY_TYPE displayType = DYSPLAY_TYPE.CONSOLA;  // eroare daca scriu DISPLAY_TYPE

   static  HashMap<LOAD_TYPE, IDataLoader> dataLoaderHashMap = new HashMap<>() {{ put(LOAD_TYPE.HARDCODAT, new HardcodatDataManager()); put(LOAD_TYPE.FILE, new FileDataManager()); put(LOAD_TYPE.KEYBOARD, new KeyboardDataManager()); }  };
   static HashMap<DYSPLAY_TYPE, IDisplayManager> displayHashMap = new HashMap<>() {{ put(DYSPLAY_TYPE.CONSOLA, new ConsoleDisplay()); put(DYSPLAY_TYPE.FISIER, new FileDisplay()); put(DYSPLAY_TYPE.GUI, new GraphicUserInterfaceDisplay()); }  };



   public static void initApplication(){
      // read settings.txt and init all values from the file
   }


}
