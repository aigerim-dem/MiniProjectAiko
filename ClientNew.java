import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientNew {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME: ");
        String name = in.nextLine();
        Socket socket = new Socket("127.0.0.1",2000);
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        outputStream.writeObject(name);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        while (true) {
                            String s = (String) inputStream.readObject();
                            System.out.println(s);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true) {
                        outputStream.writeObject(in.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        while(true){}
    }
}

