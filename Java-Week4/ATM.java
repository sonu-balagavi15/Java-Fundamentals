import java.io.FileWriter;
import java.io.IOException;

public class ATM {

    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
        saveTransaction("Deposited ₹" + amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
        saveTransaction("Withdrawn ₹" + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    private void saveTransaction(String message) {
        try {
            FileWriter writer = new FileWriter("transactions.txt", true);
            writer.write(message + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing transaction.");
        }
    }
}