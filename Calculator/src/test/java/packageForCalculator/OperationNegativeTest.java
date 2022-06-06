package packageForCalculator;


import org.testng.Assert;
import org.testng.annotations.Test;
import packageForCalculator.Enum.NameOperations;


public class OperationNegativeTest {
    private Operation operation;

    @Test
    public void calculationNegativeTest1() {
        Assert.assertNotEquals("SUMMATION", NameOperations.logic('/'), "Negative Test");
    }

    @Test
    public void calculationNegativeTest2() {
        Assert.assertNotEquals("MULTIPLICATION", NameOperations.logic('+'), "Negative Test");
    }

    @Test
    public void calculationNegativeTest3() {
        Assert.assertNotEquals("DIVISON", NameOperations.logic('-'), "Negative Test");
    }

    @Test
    public void calculationNegativeTest4() {
        Assert.assertNotEquals("SUBSTRACT", NameOperations.logic('*'), "Negative Test");
    }

    @Test
    public void calculationNegativeTest5() {
        Assert.assertThrows(IllegalArgumentException.class, () -> NameOperations.logic('b'));
    }

    @Test
    public void calculationNegativeTest6() {
        operation = NameOperations.DIVISION.valueInsideEnum();
        Assert.assertThrows(Exception.class, () -> operation.doOperation(2, 0));
    }

    @Test
    public void calculationNegativeTest7() {
        operation = NameOperations.SUMMATION.valueInsideEnum();
        Assert.assertThrows(Exception.class, () -> operation.doOperation(2000000000, 2000000000));
    }

    @Test
    public void calculationNegativeTest8() {
        operation = NameOperations.MULTIPLICATION.valueInsideEnum();
        Assert.assertThrows(Exception.class, () -> operation.doOperation(2000000000, 2000000000));
    }

    @Test
    public void calculationNegativeTest9() {
        operation = NameOperations.SUBTRACTION.valueInsideEnum();
        Assert.assertThrows(Exception.class, () -> operation.doOperation(-2000000000, 2000000000));
    }
}