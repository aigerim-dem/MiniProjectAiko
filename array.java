import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i =0; i<n;i++){
            numbers [i] = in.nextInt();
        }

    }
}