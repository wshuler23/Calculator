package Shuler.Willie.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Created by willieshuler on 9/12/16.
 */
public class MathMethodsTest {

        @Test
        public void addTest(){
            //Have an MathMethods object available
            MathMethods mathHelper = new MathMethods();

            //Expected value
            Double expectedValue = 3.0;

            //Actual value
            Double actualValue = mathHelper.add(2.0,1.0);

            // Here is where we test our UNIT of code, and assert that the expected value
            // matches the actualValue. When the test is functional this assertion will pass.
            // As things stand at this point, this assertion will fail.
            assertEquals("The value should be 3",expectedValue,actualValue);
        }

        @Test
    public void subtractionTest(){
            MathMethods mathHelper = new MathMethods();
            Double expectedValue =  5.0;
            Double actualValue = mathHelper.subtract(10.0, 5.0);
            assertEquals("The value should be 5", expectedValue,actualValue);
        }

    @Test
    public void divisionTest(){
        MathMethods mathHelper = new MathMethods();
        Double expectedValue = 5.0 ;
        Double actualValue = mathHelper.division(15.0, 3.0);
        assertEquals("The value should be 5", expectedValue,actualValue);
    }

    @Test
    public void multiplicationTest(){
        MathMethods mathHelper = new MathMethods();
        Double expectedValue = 15.0 ;
        Double actualValue = mathHelper.multiplication(5.0, 3.0);
        assertEquals("The value should be 5", expectedValue,actualValue);
    }
}
