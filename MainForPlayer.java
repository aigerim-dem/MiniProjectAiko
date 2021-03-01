public class MainForPlayer {
    public static void main(String[] args) {
        Player p1 = new Player (1, "Ronaldo", "Christiano", "nap");
        Player p2 = new Player(2, "Ronaldo", "Christiano", "nap");
        Player p3 = new Player(3, "Ronaldo", "Christiano", "nap");
        Player p4 = new Player(4, "Ronaldo", "Christiano", "nap");
        Player p5 = new Player(5, "Ronaldo", "Christiano", "nap");
        Player p6 = new Player(6, "Ronaldo", "Christiano", "nap");
        Player p7 = new Player(7, "Ronaldo", "Christiano", "nap");
        Player p8 = new Player(8, "Ronaldo", "Christiano", "nap");
        Player p9 = new Player(9, "Ronaldo", "Christiano", "nap");
        Player p10 = new Player(10, "Ronaldo", "Christiano", "nap");

        Player player1[] = {p1, p2, p3, p4, p5};
        Player player2[] = {p6, p7, p8, p9, p10};


        Club c1 = new Club("N", "KZ", 2, player1);
        Club c2 = new Club("R", "US", 3, player2);

        Club main [] = {c1, c2};

        for (int i=0; i< main.length; i++){
            //System.out.println(main[i].printClubData());
        }



    }


}
