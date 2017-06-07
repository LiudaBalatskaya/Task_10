import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by LiudaBalatskaya on 5/5/2017.
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1}, {2, 1}, {4, 2}, {6, 2}, {6, 3}, {8, 2}, {8, 4}
        });
    }

    public int result;
    public Mathematics calculator;

    private int xInput;
    private int yInput;
    private int multiplyExpected;
    private int addExpected;
    private int divideExpected;
    private int deductExpected;

    @Before
    public void initializerTest() {
        calculator = new Mathematics();
        calculator.setResult(0);
    }

    public ParameterizedTest(int x, int y) {
        xInput = x;
        yInput = y;
        multiplyExpected = x * y;
        addExpected = x + y;
        divideExpected = x / y;
        deductExpected = x - y;
    }

    @Test
    public void multiply() {
        calculator.multiply(xInput, yInput);
        result = calculator.getResult();
        assertEquals(multiplyExpected, result);
        System.out.println("multiplied result=" + result);
    }

    @Test
    public void add() {
        calculator.add(xInput, yInput);
        result = calculator.getResult();
        assertEquals(addExpected, result);
        System.out.println("added result=" + result);
    }

    @Test
    public void divide() {
        calculator.divide(xInput, yInput);
        result = calculator.getResult();
        assertEquals(divideExpected, result);
        System.out.println("divided result=" + result);
    }

    @Test
    public void deduct() {
        calculator.setResult(1);
        calculator.deduct(xInput, yInput);
        result = calculator.getResult();
        assertEquals(deductExpected, result);
        System.out.println("deduct result=" + deductExpected);
    }

}