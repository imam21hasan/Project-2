package CSE_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankManagementSyatem2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your savings account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter your PIN : ");  //here pin is=> password
        String pin = sc.nextLine();

        try {
            File fr = new File("D:\\Java OOP File\\Folder\\File1.txt");
            Scanner s = new Scanner(fr);
            if ((s.nextLine()).equals(pin)) {
                SavingsAccount savingsAccount = new SavingsAccount(accountNumber);

                System.out.println("\nBank Management System Menu");
                System.out.println("    1. Check Balance");
                System.out.println("    2. Withdraw");
                System.out.println("    3. Deposit");
                System.out.println("    4. Transaction History");
                System.out.println("    5. Exit");

                boolean exit = false;
                int choice;
                while (!exit) {

                    System.out.print("\nEnter your choice : ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            savingsAccount.checkBalance();
                            break;
                        case 2:
                            System.out.print("Enter the withdrawal amount : ");
                            double withdrawAmount = sc.nextDouble();
                            savingsAccount.withdraw(withdrawAmount);
                            break;
                        case 3:
                            System.out.print("Enter the deposit amount : ");
                            double depositAmount = sc.nextDouble();
                            savingsAccount.deposit(depositAmount);
                            break;
                        case 4:
                            System.out.print("Previous Transaction => ");
                            savingsAccount.transactionHistory();
                            break;
                        case 5:
                            exit = true;
                            System.out.println("\nExiting Bank Management System. Thank you!");
                            System.out.println();
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 to 5.");
                    }
                }
                sc.close();
            } else {
                System.out.println("\nPlease enter correct PIN !!!");
                System.out.println();
            }
            s.close();
        } catch (Exception e) {
            System.out.println("Bank Account Invalid");
        }
    }
}
