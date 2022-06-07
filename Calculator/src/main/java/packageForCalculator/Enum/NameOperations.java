package packageForCalculator.Enum;

import packageForCalculator.AllOperations.Division;
import packageForCalculator.AllOperations.Multiplication;
import packageForCalculator.AllOperations.Subtraction;
import packageForCalculator.AllOperations.Summation;
import packageForCalculator.Operation;

public enum NameOperations {
    SUMMATION(new Summation()),
    SUBTRACTION(new Subtraction()),
    MULTIPLICATION(new Multiplication()),
    DIVISION(new Division());

    private final Operation operation;

    NameOperations(Operation operation) {
        this.operation = operation;
    }

    public Operation valueInsideEnum() {
        return operation;
    }

    public static NameOperations logic(char symbol) {
        for (NameOperations value : values()) {
            if (value.valueInsideEnum().getOperatorSymbol() == symbol)
                return value;
        }
        throw new IllegalArgumentException("Uncorrect symbol " + symbol);
    }
}