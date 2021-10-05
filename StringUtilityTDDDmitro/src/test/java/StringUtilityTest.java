import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilityTest {

    @Test void baseLineCorrect(){
        String actual = "correct";
        String expected = "correct";
        assertEquals(expected,actual);
    }

    @Test
    public void reverseStringABC(){
        String input = "ABC";
        String actual = StringUtility.reverse(input);
        String expected = "CBA";

        assertEquals(expected,actual);
    }

    public void reverseStringABCD(){
        String input = "ABCD";
        String actual = StringUtility.reverse(input);
        String expected = "DCBA";

        assertEquals(expected,actual);
    }


}