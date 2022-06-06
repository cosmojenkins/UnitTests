package packageForCalculator.Interface;

import packageForCalculator.Enum.NameOperations;
import packageForCalculator.Operation;
import java.util.Scanner;

public class ConsoleReader implements InterfaceReader {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int firstNumber() {
        return scanner.nextInt();
    }

    @Override
    public int secondNumber() {
        return scanner.nextInt();
    }

    @Override
    public Operation readOperation() {
        return NameOperations.logic(scanner.next().charAt(0)).valueInsideEnum();
    }
}