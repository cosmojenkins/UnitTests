package packageForCalculator;

import packageForCalculator.Interface.ConsoleReader;
import packageForCalculator.Interface.InterfaceReader;

public class Calculator {

    private InterfaceReader scanner = new ConsoleReader();

    public String run() throws Exception {
        System.out.print("Enter first number: ");
        int first = scanner.firstNumber();
        System.out.print("Enter second number: ");
        int second = scanner.secondNumber();
        System.out.print("Choose operation: ");
        Operation operation = scanner.readOperation();
        return "Result is: " + operation.doOperation(first, second);
    }
}