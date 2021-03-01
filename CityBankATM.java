import java.util.Scanner;

public class CityBankATM extends Database {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your bank account ");
        String bankAccount = scan.next();
        System.out.println("Please enter your pincode");
        String pinCode = scan.next();

        for (int i = 0; i < allAccounts.length; i++) {
            if (bankAccount.equalsIgnoreCase(allAccounts[i].getAccountNumber()) && pinCode.equalsIgnoreCase(allAccounts[i].getPinCode())) {
                if (allAccounts[i] instanceof CityBankAccount) {
                    System.out.println("\nWELCOME TO CITYBANK \nPLEASE CHOOSE YOUR OPTIONS");
                    while (true) {
                        System.out.println("\nPRESS [1] TO CASH WITHDRAWAL \nPRESS [2] TO VIEW BALANCE \nPRESS [3] TO CHANGE PIN CODE \nPRESS [4] TO CASH IN ACCOUNT \nPRESS [5] TO VIEW ACCOUNT DATA \nPRESS [6] TO EXIT");
                        String choice = scan.next();

                        if (choice.equalsIgnoreCase("1")) {
                            System.out.println("Money withdrawal is being processed.\nPlease choose amount to withdrawn: ");
                            int withdrawn = scan.nextInt();
                            allAccounts[i].creditBalance(withdrawn);
                        } else if (choice.equalsIgnoreCase("2"))
                            System.out.println(((CityBankAccount) allAccounts[i]).getBalance());


                        else if (choice.equalsIgnoreCase("3")) {
                            System.out.println("Please set a new pin code");
                            String pinCodeNew = scan.next();
                            allAccounts[i].setPinCode(pinCodeNew);

                        } else if (choice.equalsIgnoreCase("4")) {
                            System.out.println("Please insert money: ");
                            int insertMoney = scan.nextInt();
                            allAccounts[i].debetBalance(insertMoney);

                        } else if (choice.equalsIgnoreCase("5"))
                            System.out.println(((CityBankAccount) allAccounts[i]).accountData());
                        else if (choice.equalsIgnoreCase("6")) break; // break не работает???
                    }
                }
                else if (allAccounts[i] instanceof NationalBankAccount) {
                    System.out.println("\nWELCOME TO CITYBANK \nPLEASE CHOOSE YOUR OPTIONS");
                    while (true) {
                        System.out.println("\nPRESS [1] TO CASH WITHDRAWAL\nPRESS [2] TO VIEW BALANCE\nPRESS [3] TO EXIT");
                        String choice = scan.next();
                        if (choice.equalsIgnoreCase("1")) {
                            System.out.println("Money withdrawal is being processed.\nPlease choose amount to withdrawn: ");
                            int withdrawn = scan.nextInt();
                            allAccounts[i].creditBalance(withdrawn);
                        } else if (choice.equalsIgnoreCase("2"))
                            System.out.println(((NationalBankAccount) allAccounts[i]).getBalance());
                        else if (choice.equalsIgnoreCase("3")) break;
                    }
                }
            }
        }
    }
}