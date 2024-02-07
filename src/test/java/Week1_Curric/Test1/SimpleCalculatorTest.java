package Week1_Curric.Test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add() {
        SimpleCalculator calc1 = new SimpleCalculator();
        int actual = calc1.add(2,2);
        int expected =4;


        assertEquals(expected,actual);
    }

   @Test
    void mult(){
        SimpleCalculator calc2 = new SimpleCalculator();
        int actual = calc2.mult(2,5);
        int expected = 10;


        assertEquals(expected,actual);
   }
}