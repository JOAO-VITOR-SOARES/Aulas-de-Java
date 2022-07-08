import models.JavaClass;

import java.util.Locale;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args){

        //SPLIT

        String myOtherString = "JOAO VITOR SOARES";
        String[] strings = myOtherString.split( "");
        for (int i = 0; i < strings.length ; i++) {
            System.out.println(strings[i]);
        }

    }

}




