import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            boolean validInput = true;
            double num1 = 0, num2 = 0, result = 0;
            String operator;

            try {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter operator (+, -, *, /, %, ^): ");
                operator = sc.next();

                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;

                    case "-":
                        result = num1 - num2;
                        break;

                    case "*":
                        result = num1 * num2;
                        break;

                    case "/":
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                            validInput = false;
                        } else {
                            result = num1 / num2;
                        }
                        break;

                    case "%":
                        if (num2 == 0) {
                            System.out.println("Error: Cannot perform modulo by zero.");
                            validInput = false;
                        } else {
                            result = num1 % num2;
                        }
                        break;

                    case "^":
                        result = Math.pow(num1, num2);
                        break;

                    default:
                        System.out.println("Invalid operator.");
                        validInput = false;
                }

                if (validInput) {
                    System.out.println("Result = " + result);
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid numeric input.");
                sc.nextLine();
            }

            System.out.print("Do you want to continue? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the calculator.");
        sc.close();
    }
}