import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;


@Category(FastTests.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodSortedTest {
    public int result;
    public Mathematics calculator;

    @Before
    public void initializer(){
        calculator = new Mathematics();
        calculator.setResult(0);
    }

    @Test
    public void multiply(){
        calculator.multiply(5,5);
        result = calculator.getResult();
        assertEquals(25,result);
    }

    @Test
    public void divide(){
        calculator.divide(25,5);
        result = calculator.getResult();
        assertEquals(5,result);
    }

    @Test
    public void add(){
        calculator.add(2,2);
        result = calculator.getResult();
        assertEquals(4,result);
    }
    @Test
    public void deduct(){
        calculator.setResult(1);
        calculator.deduct(15,5);
        result = calculator.getResult();
        assertEquals(10,result);
    }
}
