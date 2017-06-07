import org.junit.*;
import org.junit.experimental.categories.Category;
import org.testng.log4testng.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Category(SlowTests.class)
public class MathematicsTest {
    public int result;
    public Mathematics calculator;
    final static Logger logger = Logger.getLogger(MathematicsTest.class);

   @BeforeClass
    public static void beforeClass(){
        logger.info("beforeClass method");
    }

    @AfterClass
    public static void afterClass(){
        logger.info("afterClass method");
    }

   @Before
   public void initializerTest(){
        calculator = new Mathematics();
        calculator.setResult(0);
    }

    @After
    public void finishTest(){
        logger.info("Testing is finished");
    }

    @Test
    public void addCheck(){
        calculator.add(2,2);
        result = calculator.getResult();
        assertEquals(4,result);
    }

    @Test
    public void deductCheck(){
        calculator.setResult(1);
        calculator.deduct(15,5);
        result = calculator.getResult();
        assertEquals(10,result);
    }

    @Test
    public void divideFalse(){
        try {
              calculator.divide(15,0);
        }catch(ArithmeticException e) {
            logger.info("An invalid arithmetic operation occurred!!!");
        }
        finally{
            Assert.assertTrue("The test passed",true);
        }

    }

    @Test(timeout=1000)
    public void deductCheckFalse() throws InterruptedException {
        Thread.sleep(5*60*10);
        assertTrue(result>0);
        calculator.deduct(15,5);
        result = calculator.getResult();
        assertEquals(10,result);
    }

    @Test
    public void multiplyCheck(){
        calculator.multiply(5,5);
        result = calculator.getResult();
        assertEquals(25,result);
    }

   @Test
    public void divideCheck(){
        calculator.divide(25,5);
        result = calculator.getResult();
        assertEquals(5,result);
    }
}

