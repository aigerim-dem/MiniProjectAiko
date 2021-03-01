import java.util.Scanner;

public class CityBankAccount implements BankAccount {
    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
        System.out.println("Your pin code was updated to " + pinCode);
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        if (credit < this.balance) {
            this.balance = balance - credit;
            System.out.println("Withdrawn money is:" + credit + ". Your money amount is " + balance);
        } else if (credit > this.balance) {
            System.out.println("Requested amount is out of sum on your account ");
        }
    }

    @Override
    public void debetBalance(int debet) {
        this.balance = balance + debet;
        System.out.println("Enetered money is " + debet + ". Your money amount is " + balance);
    }

    @Override
    public String accountData() {
        return "NAME: " + name + ", SURNAME: " + surname + ", BALANCE: " + balance + ", ACCOUNT NUMBER: " + accountNumber + ", PIN CODE: " + pinCode;
    }
}



