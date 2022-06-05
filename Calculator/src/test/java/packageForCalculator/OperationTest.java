package packageForCalculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import packageForCalculator.Enum.NameOperations;

public class OperationTest {
    private Operation operation;

    @DataProvider
    public Object[][] Data() {
        return new Object[][]{
                {70, 60, 10, NameOperations.SUMMATION.valueInsideEnum()},
                {6, 60, 10, NameOperations.DIVISION.valueInsideEnum()},
                {600, 60, 10, NameOperations.MULTIPLICATION.valueInsideEnum()},
                {50, 60, 10, NameOperations.SUBTRACTION.valueInsideEnum()},
                {0, 0, 0, NameOperations.SUBTRACTION.valueInsideEnum()},
                {0, 0, 0, NameOperations.SUMMATION.valueInsideEnum()},
                {0, 0, 0, NameOperations.MULTIPLICATION.valueInsideEnum()},
                {2147483647, 2147483647, 100, NameOperations.MULTIPLICATION.valueInsideEnum()},
                {2147483647, 2147483647, 100, NameOperations.SUMMATION.valueInsideEnum()},

        };
    }

    @Test(dataProvider = "Data")
    public void calculationTest(Object[] data) throws Exception {
        operation = (Operation) data[3];
        int first = (int) data[1];
        int second = (int) data[2];
        int result = (int) data[0];
        try {
            Assert.assertEquals(operation.doOperation(first, second), result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}