package javaweek4homework;

public class WhileLoopEvenNum {

    public static void main(String[] args) {

        int i = 0;
        int num = 0;
        System.out.println("Even Number");

        while (i <= 10) {
            if (num % 2 ==0)
                System.out.println(num);
                i += 1;
                num += 2;
        }
    }
}
