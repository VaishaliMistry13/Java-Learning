package JavaPracticeWeek4;

public class Array {

    public static void main(String[]args) {

        //int array

        int a = 10;
        a = 20;
        a = 30;

        System.out.println(a);

        int i[] = new int[4];

        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[1]);   //print single number
        System.out.println(i.length);   //print length
        System.out.println(i[1]+i[2]);   //add i1+i2

        for (int j=0; j<i.length; j++){
            System.out.println(i[j]);      //to print all i value
        }
    }
}

