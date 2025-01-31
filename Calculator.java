import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator!");
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean Calculator = true;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.printf("Sum of "+num1+" and "+num2+" is "+ result);
                break;
            case 2:
                result = num1 - num2;
                System.out.printf("Difference of "+num1+" and "+num2+" is "+ result);
                break;
            case 3:
                result = num1 * num2;
                System.out.printf("Multiplication of "+num1+" and "+num2+" is "+ result);
                break;
            case 4:
                if (num2 != 0 && num1 != 0) {
                    result = num1 / num2;
                    System.out.printf("Division of "+num1+" and "+num2+" is "+ result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    Calculator = false;
                }
                break;
            case 5:
                if (num2!=0 && num1 != 0) {
                    result = num1 % num2;
                    System.out.printf("SModulus of "+num1+" and "+num2+" is "+ result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    Calculator= false;
                }
                break;
                case 6:
                if (choice == 6) {
                    System.out.println("Exiting Calculator");
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                Calculator = false;
                break;
        }

        if (Calculator) {
            System.out.println("Calculation completed");
        }

        scanner.close();
    }
}