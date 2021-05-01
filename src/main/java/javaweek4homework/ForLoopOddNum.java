package javaweek4homework;

public class ForLoopOddNum {

    public static void main(String[] args) {

        int n = 20;
        System.out.println("Odd Number");

        for (int i = 0; i <= n; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}