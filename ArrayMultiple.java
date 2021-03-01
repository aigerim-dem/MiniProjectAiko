import java.util.Scanner;

public class ArrayMultiple {
    public static void main(String[] args) {
        /*int[][] nums = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        System.out.println(nums[1][3]);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");

            }
            System.out.println();
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.println("Введите значение для [" +i+ "] [ "] );*/
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m = in.nextInt();
        int [][] nums = new int [2][n];

        for (int i=0; i<2;i++){
            for (int j=0;j<n; j++){
            nums [i][j] = in.nextInt();
            }
        }
        boolean b = true;
        for (int i=0; i<n; i++) {
            if (nums[0][i] != nums[1][i]) b = false;
        }
        if (b) System.out.println("YES");
        else System.out.println("NO");

        }
    }

