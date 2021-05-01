package JavaPracticeWeek5;

public class MainConstructor {

    String name;
    int age;

    public MainConstructor(){
        System.out.println("Default");
    }
    public MainConstructor(int x){
        System.out.println("1 Parameter Const");
    }
    public MainConstructor(int y, int z){
        System.out.println("2 Parameter Const");
    }
    public MainConstructor(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        MainConstructor obj = new MainConstructor();
        MainConstructor obj2 = new MainConstructor(10);
        MainConstructor obj3 = new MainConstructor(20,30);
        MainConstructor obj4 = new MainConstructor("Test",30);
        System.out.println(obj4.name);
        System.out.println(obj4.age);
    }
}
