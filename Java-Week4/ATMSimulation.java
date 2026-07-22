import java.util.Scanner;

public class ATMSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;

        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        if (pin != correctPin) {
            System.out.println("Invalid PIN!");
            sc.close();
            return;
        }

        Account account = new Account(5000);
        ATM atm = new ATM(account);

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    atm.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    atm.withdraw(sc.nextDouble());
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}