package javaweek4homework;

public class DoWhileLoopOddNum {

    public static void main(String[]args){

        int v= 1;
        System.out.println("Odd Number");

        do{
            if (v % 2!= 0) {
                System.out.println(" " + v);
            }
            v++;
        } while (v<=10);
    }
}
