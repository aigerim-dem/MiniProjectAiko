import java.util.Scanner;

public class ArrayLess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int k = 1;
        int sum =0;



        while (i <n) {
            k = k+1;
            sum = sum + k;
            i++;

            System.out.println( i + " " + sum);
        }
    }
}




