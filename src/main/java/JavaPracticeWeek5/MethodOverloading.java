package JavaPracticeWeek5;

public class MethodOverloading {

    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }
    public static void main(String[] args){
        int MyNum1 = plusMethod(10,20);
        double MyNum2 = plusMethod(10,20);

        System.out.println(MyNum1);
        System.out.println(MyNum2);
    }
}
