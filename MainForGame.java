import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class MainForGame {
    public static void main (String [] args) throws IOException {
        ArrayList<Game> games = new ArrayList<>();
        Scanner scan  = new Scanner(System.in);
        while (true) {
        System.out.println("PRESS 1 TO CREATE GAME");
        System.out.println("PRESS 2 TO ADD PLAYER TO GAME");
        System.out.println("PRESS 3 TO PLAY GAME");
        System.out.println("PRESS 0 TO EXIT");
        String choice = scan.next();


            if (choice.equals("1")){
                 {
                    System.out.println("Game name: ");
                    String gameName = scan.next();
                    System.out.println("IP address: ");
                    String ipAddress = scan.next();
                    System.out.println("PORT: ");
                    int port = scan.nextInt();
                    //Game GGG = new Game(gameName, ipAddress, port);
                    games.add(new Game(gameName,ipAddress,port));


                }
            }
            if (choice.equals("2")){
                System.out.println("Chose game: ");
                for (Game g : games) {
                    System.out.println(games.indexOf(g) + " " + g);
                }
                int index = scan.nextInt();
                System.out.println("Choose nickname: ");
                String Nickname = scan.next();
                System.out.println("Choose rating: ");
                double Rating = scan.nextDouble();
                games.get(index).addPlayer(new Players(Nickname,Rating));

            }
            saveGame(games);

            if (choice.equals("3")) {
                for (Game g : games) {
                    System.out.println(games.indexOf(g) + " " + g);
                }

            }

            if (choice.equals("0")) break;

        }


    }
   public static void saveGame(ArrayList <Game> game) throws IOException {

        ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
        outStream.writeObject(game);
        outStream.close();

    }



}
