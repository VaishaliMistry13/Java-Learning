package javaweek4homework;

public class WhileLoopOddNum {

    public static void main(String[]args){
        int i=0;
        int num=1;
        System.out.println("Odd Number");

        while (i<=19) {

            if (num % 2 !=0)
            System.out.println(num);
            i+=1;
            num++;
        }
    }
}
