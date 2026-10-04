import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = 1;

        while (choice != 0) {

            System.out.print("enter first number: ");
            double a = sc.nextDouble();

            System.out.print("enter second number: ");
            double b = sc.nextDouble();

            System.out.println("\n1. add");
            System.out.println("2. subtract");
            System.out.println("3. multiply");
            System.out.println("4. divide");
            System.out.println("5. modulus");
            System.out.println("6. power");
            System.out.println("0. exit");

            System.out.print("enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("ans: " + (a + b));
                    break;

                case 2:
                    System.out.println("ans: " + (a - b));
                    break;

                case 3:
                    System.out.println("ans: " + (a * b));
                    break;

                case 4:
                    if (b != 0)
                        System.out.println("ans: " + (a / b));
                    else
                        System.out.println("cannot divide by zero");
                    break;

                case 5:
                    System.out.println("ans: " + (a % b));
                    break;

                case 6:
                    System.out.println("ans: " + Math.pow(a, b));
                    break;

                case 0:
                    System.out.println("calculator closed");
                    break;

                default:
                    System.out.println("invalid choice");
            }
        }

        sc.close();
    }
}
