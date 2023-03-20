import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    Calculator obj = new Calculator();
    @Test
    public void sqaureroot_test_tp(){

        assertEquals("Finding squareroot of a number(TP)", 8, obj.squareroot_func(64), 0.00001 );
        assertEquals("Finding squareroot of a number(TP)", 5, obj.squareroot_func(25), 0.00001 );
    }

    @Test
    public void factorial_test_tp()
    {
        assertEquals("Finding factorial of a number(TP)", 720, obj.factorial_func(6), 0.00001 );
        assertEquals("Finding factorial of a number(TP)", 24, obj.factorial_func(4), 0.00001 );
    }
//
//
    @Test
    public void logarth_test_tp()
    {
        assertEquals("Finding logarithm of a number(tp)", 1.09861228867, obj.log_func(3), 0.00001 );
        assertEquals("Finding logarithm of a number(tp)", 0.69314718056, obj.log_func(2), 0.00001 );
    }
//
//
    @Test
    public void power_test_tp()
    {
        assertEquals("Finding power of a number(tp)", 64, obj.power_func(8,2), 0.00001 );
        assertEquals("Finding power of a number(tp)", 32, obj.power_func(2,5), 0.00001 );
    }




}

