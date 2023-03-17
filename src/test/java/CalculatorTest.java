import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator obj = new Calculator();
    @Test
    public void calctest(){
        assertEquals("Finding squareroot of a number", 8, obj.squareroot_func(64), 0.00001 );
        assertEquals("Finding factorial of a number", 720, obj.factorial_func(6), 0.00001 );
        assertEquals("Finding power of a number", 64, obj.power_func(8,2), 0.00001 );
        assertEquals("Finding logarithm of a number", 1.09861228867, obj.log_func(3), 0.00001 );

    }




}

