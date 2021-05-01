package javaweek4homework;

public class ForLoopEvenNum {

    public static void main(String[] args) {

        int n = 20;
        System.out.println("Even Number");

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
