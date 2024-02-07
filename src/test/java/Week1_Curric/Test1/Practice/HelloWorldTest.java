package Week1_Curric.Test1.Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    void practise(){
        HelloWorld word = new HelloWorld();
        String actual = word.practice();
        String expected = "Hello World";

        assertEquals(actual,expected);

    }

}