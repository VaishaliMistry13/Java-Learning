package javaweek4homework;

public class DoWhileTable8 {

    public static void main(String[] args) {
        int a = 1;
        int b = 8;

        System.out.println("Table Of 8");

        do {
            System.out.println(b+ " * " + a + " = " + (b * a));
            a++;

        }while (a <= 10);

    }
}
