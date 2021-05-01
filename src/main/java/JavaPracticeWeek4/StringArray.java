package JavaPracticeWeek4;

public class StringArray {

    public static void main(String[]args) {

        String name [] = new String[8];

        name[0] = "Vikas";
        name[1] = "Vaishali";
        name[2] = "Jigna";
        name[3] = "Yogesh";
        name[4] = "Meer";
        name[5] = "Neel";
        name[6] = "Mum";
        name[7] = "Dad";

        System.out.println(name[1]);   //print single number
        System.out.println(name.length);   //print length
        System.out.println(name[1]+name[2]);   //add i1+i2

        for (int n=0; n<name.length; n++){
            System.out.println(name[n]);      //to print all i value
        }
    }
}
