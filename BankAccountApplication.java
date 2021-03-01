import java.util.ArrayList;

public class BankAccountApplication {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    ArrayList<Account> accounts = new ArrayList<Account>();
    int numberOfAccounts=0;


    public BankAccountApplication(String name) {
        this.name = name;
    }

    public BankAccountApplication() {
    }

    public BankAccountApplication(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void addAccount(Account a) // Добавляет новый объект Account
    {
        numberOfAccounts++;
        accounts.add(a);


    }

    public void removeAccount(int i) // Удаляет объект со списка под индексом i
    {
        numberOfAccounts--;
        accounts.remove(i);


    }

    public Account getMaxAccount() // НЕ РАБОТАЕТ Возвращает объект Account у кого самый высокий баланс
    {
        double max=0;
        int balanceOwner=0;
        for (Account a : accounts)
        {
            if(a.balance>max)
            {
                max = a.balance;
                balanceOwner = accounts.indexOf(a);

            }
        }
        return accounts.get(balanceOwner) ;


    }


    public double getAverageBalance() // РАБОТАЕТ Возвращает среднее значение баланса пользователей
    {
        double sum=0;
        for (Account a : accounts)
        {
            sum = (double)sum + a.balance;
        }
        return (sum/accounts.size());
    }

    public double getTotalBalance() // РАБОТАЕТ Возвращает сумму баланса пользователей
    {
        double total=0;

        for (Account a : accounts){
            total = total+a.balance;

        }
        return total;
    }


    public int totalAccounts()  // РАБОТАЕТ Возвращает количество пользователей
    {
        return accounts.size();
    }

    public String getBankData() // РАБОТАЕТ Возвращает имя банка, количество счетов, сумму баланса и среднее значение баланса
    {

        return "BANK IS " + name + ". There are " + accounts.size() + " accounts in the " + name +  " bank. " + "Total sum of bank holders is " + getTotalBalance() + ". Average sum is " + getAverageBalance();
    }
}
