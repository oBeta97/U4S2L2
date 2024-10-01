package ex1;
import utils.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);

        int listLenght = Utils.readNumber("Quanto lunga vuoi la lista?", scan);

        HashSet<String> res = new HashSet<>();
        ArrayList<String> duplicatedStrings = new ArrayList<>();

        for(int i = 0; i < listLenght; i++){
            String s = Utils.readString("inserisci una stringa nella lista", scan);

            if(!res.add(s)){
                duplicatedStrings.add(s);
            }
        }

        System.out.println("Le parole dupplicate sono:");
        for(String word : duplicatedStrings)
            System.out.println(word);

        System.out.println(" ");

        System.out.println("Il numero di parole singole è:");
        System.out.println(res.size());

        System.out.println(" ");

        System.out.println("Le parole singole sono:");
        for(String s : res)
            System.out.println(s);

        scan.close();
    }
}