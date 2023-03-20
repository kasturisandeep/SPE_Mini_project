import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class CalculatorTest {
    Calculator obj = new Calculator();
    @Test
    public void sqaureroot_test_tp(){

        assertEquals("Finding squareroot of a number(TP)", 8, obj.squareroot_func(64), 0.00001 );
        assertEquals("Finding squareroot of a number(TP)", 5, obj.squareroot_func(25), 0.00001 );
    }

    @Test
    public void sqaureroot_test_fp(){

        assertNotEquals("Finding squareroot of a number(FP)", 7, obj.squareroot_func(50), 0.00001 );
        assertNotEquals("Finding squareroot of a number(FP)", 10, obj.squareroot_func(81), 0.00001 );
    }

    @Test
    public void factorial_test_tp()
    {
        assertEquals("Finding factorial of a number(TP)", 720, obj.factorial_func(6), 0.00001 );
        assertEquals("Finding factorial of a number(TP)", 24, obj.factorial_func(4), 0.00001 );
    }

    @Test
    public void factorial_test_fp(){

        assertNotEquals("Finding factorial of a number(FP)", 7, obj.factorial_func(3), 0.00001 );
        assertNotEquals("Finding factorial of a number(FP)", 110, obj.factorial_func(5), 0.00001 );
    }
//
//
    @Test
    public void logarth_test_tp()
    {
        assertEquals("Finding logarithm of a number(tp)", 1.09861228867, obj.log_func(3), 0.00001 );
        assertEquals("Finding logarithm of a number(tp)", 0.69314718056, obj.log_func(2), 0.00001 );
    }

    @Test
    public void logarth_test_fp(){
        assertNotEquals("finding logarithm of a number(FP)", 1.34231267232, obj.log_func(4), 0.00001 );
        assertNotEquals("finding logarithm of a number(FP)", 1.12233445567, obj.log_func(2), 0.00001 );
    }
//
//
    @Test
    public void power_test_tp()
    {
        assertEquals("Finding power of a number(tp)", 64, obj.power_func(8,2), 0.00001 );
        assertEquals("Finding power of a number(tp)", 32, obj.power_func(2,5), 0.00001 );
    }

    @Test
    public void power_test_fp()
    {
        assertNotEquals("Finding power of a number(fp)", 260, obj.power_func(2,8), 0.00001 );
        assertNotEquals("Finding power of a number(fp)", 120, obj.power_func(5,3), 0.00001 );
    }


}

