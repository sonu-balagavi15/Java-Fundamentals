import java.util.Scanner;

public class BankManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;
        int choice;

        while (true) {

            System.out.println("\n===== Bank Management System =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    balance = balance + deposit;

                    System.out.println("Deposit successful!");
                    break;


                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful!");
                    }
                    else {
                        System.out.println("Insufficient balance!");
                    }
                    break;


                case 3:
                    System.out.println("Current Balance: ₹" + balance);
                    break;


                case 4:
                    System.out.println("Thank you for using Bank Management System");
                    sc.close();
                    System.exit(0);


                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}