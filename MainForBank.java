import java.util.ArrayList;
import java.util.Collections;

public class MainForBank {
    public static void main (String [] args){

       BankAccountApplication bank1 = new BankAccountApplication("Каспий");
       BankAccountApplication bank2 = new BankAccountApplication("Халык");
       BankAccountApplication bank3 = new BankAccountApplication("ЦентрКредит");


        bank1.addAccount(new Account(1, "a", "A", 10));
        bank1.addAccount(new Account(2, "b", "B", 11));
        bank1.addAccount(new Account(3, "c", "C", 12));
        bank1.addAccount(new Account(4, "d", "D", 13));
        bank1.addAccount(new Account(5, "e", "E", 14));
        bank1.addAccount(new Account(6, "f", "F", 15));
        bank1.addAccount(new Account(7, "g", "G", 16));
        bank1.addAccount(new Account(8, "h", "H", 17));
        bank1.addAccount(new Account(9, "f", "F", 18));
        bank1.addAccount(new Account(10, "r", "R", 19));

           System.out.println(bank1.getMaxAccount());


        bank2.addAccount(new Account(11, "aa", "AA", 100));
        bank2.addAccount(new Account(12, "bb", "BB", 110));
        bank2.addAccount(new Account(13, "cc", "CC", 120));
        bank2.addAccount(new Account(14, "dd", "DD", 130));
        bank2.addAccount(new Account(15, "ee", "EE", 140));
        bank2.addAccount(new Account(16, "ff", "FF", 150));
        bank2.addAccount(new Account(17, "gg", "GG", 160));
        bank2.addAccount(new Account(18, "hh", "HH", 170));
        bank2.addAccount(new Account(19, "ff", "FF", 180));
        bank2.addAccount(new Account(20, "rr", "RR", 190));

        bank3.addAccount(new Account(21, "aaa", "AAA", 290));
        bank3.addAccount(new Account(22, "bbb", "BBB", 280));
        bank3.addAccount(new Account(23, "ccc", "CCC", 270));
        bank3.addAccount(new Account(24, "ddd", "DDD", 260));
        bank3.addAccount(new Account(25, "eee", "EEE", 250));
        bank3.addAccount(new Account(26, "fff", "FFF", 240));
        bank3.addAccount(new Account(27, "ggg", "GGG", 230));
        bank3.addAccount(new Account(28, "hhh", "HHH", 220));
        bank3.addAccount(new Account(29, "fff", "FFF", 210));
        bank3.addAccount(new Account(30, "rrr", "RRR", 200));

            ArrayList<BankAccountApplication> allBanks = new ArrayList<BankAccountApplication>();
            allBanks.add(bank1);
            allBanks.add(bank2);
            allBanks.add(bank3);
            //Collections.sort();
            for (BankAccountApplication a : allBanks){
                    System.out.println(a.getBankData());
            }



    }
}
