package JavaPracticeWeek4;

public class TwoDimArray2 {

    public static void main(String[] args) {

        int data[][] = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}, {15, 16, 17, 18, 20}};

        for (int a=0; a<5; a++){
            for (int b=0; b<5; b++){
                System.out.print(data[a][b] + " ");
            }
            System.out.println();
        }
    }
}
