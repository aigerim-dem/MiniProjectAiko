import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client111 {
    public static void main (String [] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1", 2000);

        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        System.out.println("Please write your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name + " please start charting");





        while (true){
            System.out.println("Press [1] to send message");
            System.out.println("Press [0] to exit");
            String choice = scan.nextLine();
            if (choice.equals("1")){
                while (true){
                    System.out.println("Insert message or press 0 to exit");
                    String message = scan.nextLine();
                    MessageData111 messageData111 = new MessageData111(name, message);
                    outputStream.writeObject(messageData111);
                    if (message.equals("0")) break;

                }

            }
            else if (choice.equals("2")) break;
        }
    }
}
