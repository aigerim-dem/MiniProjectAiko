import java.util.Scanner;

public class ArrayLess1 {

    public static void main(String[] args) {
      /*  Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] numbers = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Введите значение для индекса " +i);
            numbers [i] = in.nextInt();
        }
        for (int i=0; i<n; i++)
        {
            System.out.println(i + " - " + numbers[i]);
        }

    }*/
       /* Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            int b = (int) Math.pow(i, 2);
            sum = sum + b;
            i++;
        }
        System.out.println(sum);
    }
}*/

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int i = 1;


            while (i <= x) {
                if (x % i == 0) System.out.print(i + " ");
                i++;

            }

        }
    }



