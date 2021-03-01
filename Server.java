import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        ServerSocket server = new ServerSocket(2000);
        System.out.println("Waiting for client");
        Socket socket = server.accept();
        System.out.println("Client connected");

        ObjectInputStream inputstream = new ObjectInputStream(socket.getInputStream());
        MessageData messageData;

        while (socket.isBound()) {
            messageData = (MessageData) inputstream.readObject();
            System.out.println(messageData);

        }
    }
}
