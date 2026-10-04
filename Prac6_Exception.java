import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        while (true) {
            System.out.println("\n1. check balance");
            System.out.println("2. withdraw");
            System.out.println("3. deposit");
            System.out.println("4. exit");
            System.out.print("enter choice: ");

            try {
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("balance: " + balance);
                }

                else if (choice == 2) {
                    System.out.print("enter amount: ");
                    double amount = sc.nextDouble();

                    if (amount > balance)
                        throw new ArithmeticException("insufficient funds");

                    balance = balance - amount;
                    System.out.println("withdrawal successful");
                }

                else if (choice == 3) {
                    System.out.print("enter amount: ");
                    double amount = sc.nextDouble();

                    if (amount <= 0)
                        throw new IllegalArgumentException("invalid amount");

                    balance = balance + amount;
                    System.out.println("deposit successful");
                }

                else if (choice == 4) {
                    System.out.println("thank you");
                    break;
                }

                else {
                    throw new IllegalArgumentException("invalid choice");
                }

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            } finally {
                System.out.println("transaction completed");
            }
        }

        sc.close();
    }
}
