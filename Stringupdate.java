import java.util.Scanner;

public class Stringupdate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите массив");
        int n = scan.nextInt();

        System.out.println("Введите данные массива");


        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int min = array[0];
        int minIndex = 0;
        int max = array[0];
        int maxIndex = 0;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println("Min is " + min + ", it's index is " + minIndex);


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Max is " + max + ", it's index is " + maxIndex);

        temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        for (int i = 0; i < array.length; i++) {


            System.out.print(array[i] + " ");
        }
    }
}