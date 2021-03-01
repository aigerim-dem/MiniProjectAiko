import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server111  {
    public static void main (String [] args) throws IOException, ClassNotFoundException {
        int id = 0;
        Scanner scan = new Scanner(System.in);
        ServerSocket server = new ServerSocket(2000);
        System.out.println("Waiting for client...");
        while (true) {
            Socket socket = server.accept();
            id++;
            System.out.println("Client " + id+ " connected");
            ClientHandler111 ch = new ClientHandler111(socket, id);
            ch.start();
        }
    }
}
