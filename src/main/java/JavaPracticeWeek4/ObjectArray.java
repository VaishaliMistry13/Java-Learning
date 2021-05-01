package JavaPracticeWeek4;

public class ObjectArray {

    public static void main(String[]args) {

        Object emp [] = new Object[5];

        emp[0] = "Sachin";
        emp[1] = 52;
        emp[2] = "M";
        emp[3] = 5.2;
        emp[4] = false;

        //System.out.println(emp[3]);   //print single number
        //System.out.println(name.length);   //print length
        //System.out.println(name[1]+name[2]);   //add i1+i2

        for (int n=0; n<emp.length; n++){
            System.out.println(emp[n]);      //to print all i value
        }
    }
}
