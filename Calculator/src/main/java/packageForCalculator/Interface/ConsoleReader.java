package packageForCalculator.Interface;

import packageForCalculator.Enum.NameOperations;
import packageForCalculator.Operation;

import java.util.Scanner;

public class ConsoleReader implements InterfaceReader {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int firstNumber() {
        long firstNumberLong = scanner.nextLong();
        if (firstNumberLong >= Integer.MAX_VALUE || firstNumberLong <= Integer.MIN_VALUE) {
            throw new ArithmeticException("First number vishlo za predeli znacheniy");
        }
        return (int) firstNumberLong;
    }

    @Override
    public int secondNumber() {
        long secondNumberLong = scanner.nextLong();
        if (secondNumberLong >= Integer.MAX_VALUE || secondNumberLong <= Integer.MIN_VALUE) {
            throw new ArithmeticException("Second number vishlo za predeli znacheniy");
        }
        return (int) secondNumberLong;
    }

    @Override
    public Operation readOperation() {
        return NameOperations.logic(scanner.next().charAt(0)).valueInsideEnum();
    }
}
