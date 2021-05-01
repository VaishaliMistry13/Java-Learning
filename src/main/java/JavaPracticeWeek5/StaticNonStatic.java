package JavaPracticeWeek5;

public class StaticNonStatic {

    String name;
    static int salary;

    public static void main(String[] args) {

        salary = 25000;
        System.out.println("salary");

        StaticNonStatic obj = new StaticNonStatic();
        obj.name = "Vaishali";
        System.out.println(obj.name);
    }
}
