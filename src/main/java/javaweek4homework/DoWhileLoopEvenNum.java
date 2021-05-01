package javaweek4homework;

public class DoWhileLoopEvenNum {

    public static void main(String[]args){

        int k= 1;
        System.out.println("Even Number");

        do{
            if (k % 2== 0) {
                System.out.println(" " + k);
            }
            k++;
        } while (k<=20);
    }
}
