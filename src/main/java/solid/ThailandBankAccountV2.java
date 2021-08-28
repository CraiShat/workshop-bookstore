package solid;

class MainV2 {
    public static void main(String[] args) {
        TransferMoneyProcess p1 = new ThailandBankAccountV2();
        p1.transferMoney(new BankAccount(), 1000);
        TransferMoneyProcess p2 = new InterBankAccountV2();
        p2.transferMoney(new BankAccount(), 1000);
    }
}

enum AccountTypeV2 {
    Thailand,
    International
}

class BankAccount {

}

interface TransferMoneyProcess {
    void transferMoney(BankAccount targetAccount, int amount);
}

public class ThailandBankAccountV2 implements TransferMoneyProcess {
    public void transferMoney(BankAccount targetAccount, int amount) {
        System.out.println("Transfer money in Thailand.");
    }
}

class InterBankAccountV2 implements TransferMoneyProcess {
    public void transferMoney(BankAccount targetAccount, int amount) {
        System.out.println("Transfer money In ...");
    }
}