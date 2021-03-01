import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        human humans[] = new human[100];
        int index=0;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("PRESS [1] TO ADD STUDENT \nPRESS [2] TO LIST STUDENT \nPRESS [0] TO EXIT");
            String menu = scan.next();
            if (menu.equals("1")) {
                System.out.println("Choose ID");
                int id = scan.nextInt();
                System.out.println("Insert name? ");
                String name = scan.next();
                System.out.println("Insert surname?");
                String surname = scan.next();
                System.out.println("Insert GPA?");
                double gpa = scan.nextDouble();
                humans [index] = new human(id, name, surname, gpa);
                index++;
            }
            else if (menu.equals("2")) {
                for (int i = 0; i < index; i++)
                    System.out.println(humans[i].getStudentData());
            }

            else if (menu.equals("0")) break;


        }

    }
}
