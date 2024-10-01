package utils;

import java.util.Scanner;

public class Utils {

    public static int readNumber(String question, Scanner s){

        int res = 0;
        while (true) {
            System.out.println(question);

            try{
                res = Integer.parseInt(s.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("valore non valido");
            }
        }

        return res;

    }

    public static String readString(String question, Scanner s){
        System.out.println(question);
        String res = s.nextLine();
        return res;
    }

}
