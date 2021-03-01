public class NationalBankAccount implements BankAccount{
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getAccountNumber() {
        return null;
    }

    @Override
    public String getPinCode() {
        return null;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode=pinCode;
        System.out.println("Your pin code was updated to " + pinCode);

    }

    @Override
    public int totalBalance() {
        return 0;
    }

    @Override
    public void creditBalance(int credit) {
        if (credit < this.balance){
        this.balance=balance-credit-200;
        System.out.println("Withdrawn money is:" + credit + ". Your money amount is " + balance);}
        else if (credit > this.balance) {
            System.out.println("Requested amount is out of sum in your account ");
        }

    }

    @Override
    public void debetBalance(int debet) {

    }

    @Override
    public String accountData() {
        return null;
    }
}
