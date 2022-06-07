package packageForCalculator;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import packageForCalculator.Enum.NameOperations;


public class OperationNegativeTest {
    private Operation operation;

    @DataProvider
    public Object[][] DataNegative() {
        return new Object[][]{
                {'/', '+', '-', '*', 'b'}};}

    @DataProvider
    public Object[][] DataNegativeInt() {
        return new Object[][]{
                {2,0, NameOperations.DIVISION.valueInsideEnum()},
                {2000000000, 2000000000, NameOperations.SUMMATION.valueInsideEnum()},
                {2000000000, 2000000000, NameOperations.MULTIPLICATION.valueInsideEnum()},
                {-2000000000, 2000000000, NameOperations.SUBTRACTION.valueInsideEnum()}};}

    @Test(dataProvider = "DataNegative")
    public void calculationNegativeTest1(Object[] dataNegative) {
        char symbolTest = (char) dataNegative[0];
        Assert.assertNotEquals("SUMMATION", NameOperations.logic(symbolTest), "Negative Test");
    }

    @Test(dataProvider = "DataNegative")
    public void calculationNegativeTest2(Object[] dataNegative) {
        char symbolTest = (char) dataNegative[1];
        Assert.assertNotEquals("MULTIPLICATION", NameOperations.logic(symbolTest), "Negative Test");
    }

    @Test(dataProvider = "DataNegative")
    public void calculationNegativeTest3(Object[] dataNegative) {
        char symbolTest = (char) dataNegative[2];
        Assert.assertNotEquals("DIVISON", NameOperations.logic(symbolTest), "Negative Test");
    }

    @Test(dataProvider = "DataNegative")
    public void calculationNegativeTest4(Object[] dataNegative) {
        char symbolTest = (char) dataNegative[3];
        Assert.assertNotEquals("SUBSTRACT", NameOperations.logic(symbolTest), "Negative Test");
    }

    @Test(dataProvider = "DataNegative")
    public void calculationNegativeTest5(Object[] dataNegative) {
        char symbolTest = (char) dataNegative[4];
        Assert.assertThrows(IllegalArgumentException.class, () -> NameOperations.logic(symbolTest));
    }

    @Test(dataProvider = "DataNegativeInt")
    public void calculationNegativeTest6(Object[] dataNegativeInt) {
        operation = (Operation) dataNegativeInt[2];
        int firstNumberTest = (int) dataNegativeInt[0];
        int secondNumberTest = (int) dataNegativeInt[1];
        Assert.assertThrows(Exception.class, () -> operation.doOperation(firstNumberTest, secondNumberTest));
    }

    @Test(dataProvider = "DataNegativeInt")
    public void calculationNegativeTest7(Object[] dataNegativeInt) {
        operation = (Operation) dataNegativeInt[2];
        int firstNumberTest = (int) dataNegativeInt[0];
        int secondNumberTest = (int) dataNegativeInt[1];
        Assert.assertThrows(Exception.class, () -> operation.doOperation(firstNumberTest, secondNumberTest));
    }

    @Test(dataProvider = "DataNegativeInt")
    public void calculationNegativeTest8(Object[] dataNegativeInt) {
        operation = (Operation) dataNegativeInt[2];
        int firstNumberTest = (int) dataNegativeInt[0];
        int secondNumberTest = (int) dataNegativeInt[1];
        Assert.assertThrows(Exception.class, () -> operation.doOperation(firstNumberTest, secondNumberTest));
    }

    @Test(dataProvider = "DataNegativeInt")
    public void calculationNegativeTest9(Object[] dataNegativeInt) {
        operation = (Operation) dataNegativeInt[2];
        int firstNumberTest = (int) dataNegativeInt[0];
        int secondNumberTest = (int) dataNegativeInt[1];
        Assert.assertThrows(Exception.class, () -> operation.doOperation(firstNumberTest, secondNumberTest));
    }
}