package JavaPracticeWeek5;

public class MethodParaMeters {

    static void myMethod(String fname){
        System.out.println(fname+ "Tester");
    }

    public static void main(String[] args){
        myMethod("Test1" + " ");
        myMethod("Test2" + " ");
        myMethod("Test3" + " ");
    }
}
