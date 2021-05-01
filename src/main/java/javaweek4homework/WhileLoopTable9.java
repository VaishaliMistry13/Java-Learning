package javaweek4homework;

public class WhileLoopTable9 {

    public static void main(String[] args){
        int num = 1;
        int num1 = 9;

        System.out.println("Table Of 9");

        //for (int k=1; k<=10; ++k){
        while (num <=10) {
            System.out.println(num1+" * "+ num + " = " + (num1 *num));
        num++;
        }
    }
}
