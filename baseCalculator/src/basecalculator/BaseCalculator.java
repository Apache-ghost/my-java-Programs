package basecalculator;

import java.util.Scanner;

public class BaseCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Enter the first number: ");
        double number1 = scan.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = scan.nextDouble();

        System.out.println("Which operation do you want to perform on the numbers: ");
        System.out.println("+   - Addition");
        System.out.println("-   - Subtraction");
        System.out.println("*   - Multiplication");
        System.out.println("/   - Division");

        System.out.println("Choose your operator: ");
        char decision = scan.next().charAt(0);

        switch (decision) {
            case '+':
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case '-':
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case '*':
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case '/':
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }

}