import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerNew {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(2000);
        while (true) {
            Socket socket = server.accept(); // клиент подключается, и все данные о подключении хранятся в переменной socket
            new ClientHandler(socket); // Для подключения создаем отдельный объект чтоб клиент работал в своем потоке
        }
    }
}
