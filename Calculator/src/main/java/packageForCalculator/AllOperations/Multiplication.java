package packageForCalculator.AllOperations;
import packageForCalculator.Operation;

public class Multiplication extends Operation {
    long res;

    public Multiplication() {
        super("UMNOJENIE", '*');
    }

    @Override
    public int doOperation(int first, int second) throws Exception {
        res = Math.multiplyExact(first, second);
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            throw new Exception("Too long result for int!");
        }
        return (int) res;
    }
}
