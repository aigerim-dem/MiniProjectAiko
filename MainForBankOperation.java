public class MainForBankOperation {
    public static void main (String[]args) {


        Operation one = new Operation("Add account", 5);
        Operation two = new Operation("Change account", 2);
        Operation three = new Operation("Send money", 4);
        Operation four = new Operation("Receive money", 4);
        Operation five = new Operation("Add additional information", 3);
        Operation six = new Operation("Change personal details", 5);
        Operation seven = new Operation("Add additional user", 3);
        Operation eight = new Operation("Delete account", 5);
        Operation nine = new Operation("Withdrawn money", 4);
        Operation ten = new Operation("Change bank operator", 5);
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
        six.start();
        seven.start();
        eight.start();
        nine.start();
        ten.start();

    }
}
