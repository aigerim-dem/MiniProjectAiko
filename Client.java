import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client  {
    public static void main (String [] args) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);

        Socket socket = new Socket("127.0.0.1", 2000);

        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        //ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

        System.out.println("Please write your name");
        String name = scan.nextLine();
        System.out.println("Hello " + name + " Please start charting");


        while (true) {
            System.out.println("PRESS [1] TO SEND MESSAGE: ");
            System.out.println("PRESS [2] TO EXIT");
            String choice = scan.nextLine();
            if (choice.equals("1")) {
                while (true) {
                    System.out.println("INSERT MESSAGE:");
                    scan.next();
                    String message = scan.nextLine();
                    MessageData messageData = new MessageData(name, message);
                    outputStream.writeObject(messageData);
                }
            }
            else if(choice.equals("0"))break;
        }


        }
    }
