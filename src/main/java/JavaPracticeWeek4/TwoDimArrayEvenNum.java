package JavaPracticeWeek4;

public class TwoDimArrayEvenNum {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("Even Number");

        for (int b = 0; b<a.length; b++){
            if (a[b] %2== 0){
                System.out.println(a[b]);
            }
        }
    }
}
