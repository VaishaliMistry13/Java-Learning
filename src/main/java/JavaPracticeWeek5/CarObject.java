package JavaPracticeWeek5;

public class CarObject {

    int model;
    int wheel;

    public static void main (String [] args){

        CarObject a = new CarObject();
        CarObject b = new CarObject();
        CarObject c = new CarObject();

        a.model = 2019;
        a.wheel = 4;

        b.model = 2020;
        b.wheel = 4;

        c.model = 2018;
        c.wheel = 4;

        System.out.println(a.model);
        System.out.println(a.wheel);

        System.out.println(b.model);
        System.out.println(b.wheel);

        System.out.println(c.model);
        System.out.println(c.wheel);

        // Main myObj = new Main();
        // System.out.println(myObj.x);


    }
}
