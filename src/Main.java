import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(true) {
            System.out.println("\n--- Basic Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Take Power");
            System.out.println("6.Square Root");
            System.out.println("0.Exit");

            int choice = scanner.nextInt();

            try {
                switch(choice) {
                    case 1:
                        performTwoNumberOperation(scanner, calculator, "add");
                        break;
                    case 2:
                        performTwoNumberOperation(scanner, calculator, "subtract");
                        break;
                    case 3:
                        performTwoNumberOperation(scanner, calculator, "multiply");
                        break;
                    case 4:
                        performTwoNumberOperation(scanner, calculator, "divide");
                        break;
                    case 5:
                        performTwoNumberOperation(scanner, calculator, "power");
                        break;
                    case 6:
                        System.out.println("Enter number");
                        double number = scanner.nextDouble();
                        System.out.println("Result : " +  calculator.squareRoot(number));
                        break;
                    case 0:
                        System.out.println("Exit");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            }

            catch(Exception e) {
                System.out.println("Error : " + e.getMessage());
            }

        }
    }

    private static void performTwoNumberOperation(Scanner scanner, Calculator calculator, String operation) {

        System.out.println("Enter first number");
        double a = scanner.nextDouble();

        System.out.println("Enter second number");
        double b = scanner.nextDouble();

        double result = 0;

        switch(operation) {
            case "add":
                result = calculator.add(a, b);
                break;
            case "subtract":
                result = calculator.subtract(a, b);
                break;
            case "multiply":
                result = calculator.multiply(a, b);
                break;
            case "divide":
                result = calculator.divide(a, b);
                break;
            case "power":
                result = calculator.power(a, b);
                break;
        }

        System.out.println("Result : " + result);

    }
}