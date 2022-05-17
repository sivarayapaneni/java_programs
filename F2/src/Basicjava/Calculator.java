import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, result;
        System.out.println("Enter the operator: +, -, *, /");
        System.out.println("Enter first number");
        number1 = input.nextDouble();
        System.out.println("Enter second number");
        number2 = input.nextDouble();
        String Operator = input.next();
        switch (Operator) {
            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case "/":
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
        }
    }
}
