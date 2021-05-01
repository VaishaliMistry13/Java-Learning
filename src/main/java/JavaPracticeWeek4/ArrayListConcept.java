package JavaPracticeWeek4;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void mail(String[] args){

        ArrayList ar = new ArrayList();

        ar.add(100);
        ar.add(200);
        ar.add("Sachin");
        ar.add(5.4);
        ar.add(true);
        ar.add('M');

        System.out.println(ar.size()); //to print size it will be 6
        System.out.println(ar.get(3)); //to print specific line
    }
}
