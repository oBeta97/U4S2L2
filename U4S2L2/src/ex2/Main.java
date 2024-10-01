package ex2;

import utils.Utils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner s = new Scanner(System.in);

        int listLength = Utils.readNumber("Quanto lunga sarà la lista?", s);

        TreeSet<Integer> set = randomNumberSet(listLength);

        System.out.println("Lista creata:");
        for(int n : set)
            System.out.println(n);


        ArrayList<Integer> reversedList = reverseList(set);

        System.out.println("Lista specchiata");
        for(int n : reversedList)
            System.out.println(n);

        boolean isEven = Utils.readYN("Vuoi gli indici pari?", s);
        ArrayList<Integer> list = evenOrOddIndexes(isEven, set);

        System.out.println("Lista degli indici " + (isEven ? "Pari":"Dispari") + ":");
        for (int n : list)
            System.out.println(n);

        s.close();
    }
    public static TreeSet<Integer> randomNumberSet(int lenght){

        ArrayList<Integer> availableNumbers = new ArrayList<>();
        for (int i = 0; i <= 100 ; i++) availableNumbers.add(i);


        TreeSet<Integer> res = new TreeSet<>();
        for (int i = 0; i < lenght; i++) {
            Random r = new Random();
            int randomIndex = r.nextInt(100);
            res.add(availableNumbers.get(randomIndex));
            availableNumbers.remove(randomIndex);
        }

        return res;
    }

    public static ArrayList<Integer> reverseList (Collection<Integer> collection){
        ArrayList<Integer> res = new ArrayList<>();

        List<Integer> col = new ArrayList<>(collection);

        res.addAll(collection);

        for (int i = collection.size()-1; i >= 0 ; i--) res.add(col.get(i));

        return res;
    }

    public static ArrayList<Integer> evenOrOddIndexes(boolean evenIndexes, Collection<Integer> collection){
        List<Integer> col = new ArrayList<>(collection);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < col.size(); i++)
            if (i % 2 == 0)
                even.add(col.get(i));
            else
                odd.add(col.get(i));

        return evenIndexes ? even : odd;



    }

}