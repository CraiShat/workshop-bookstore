package solid;

class Main {
    public static void main(String[] args) {
        ThailandBankAccount bankAccount = new ThailandBankAccount();
        bankAccount.transferMoney(new ThailandBankAccount(), 100);
        ThailandBankAccount inter = new InterBankAccount();
        inter.transferMoney(new ThailandBankAccount(), 100);
    }
}

enum AccountType {
    Thailand,
    International
}

public class ThailandBankAccount {
    void transferMoney(ThailandBankAccount targetAccount, int amount) {
        System.out.println("Transfer money in Thailand.");
    }
}

class InterBankAccount extends ThailandBankAccount {
    @Override
    void transferMoney(ThailandBankAccount targetAccount, int amount) {
        System.out.println("Transfer money In ...");
    }
}