import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientHandler111 extends Thread{
    Socket socket;
    int id;

    public ClientHandler111(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }

    public void run () {
        try {
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        MessageData111 messageData111;

        while (socket.isBound()){
            messageData111 = (MessageData111) inputStream.readObject();
            System.out.println("ID #" + id + " " + messageData111);
            }
        }
        catch (Exception e) {

        }

    }
}
