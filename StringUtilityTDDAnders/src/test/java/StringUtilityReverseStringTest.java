import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Scope
 * Class: StringUtility
 * Method: public String ReverseString(String input)
 *
 * Test framework
 * Name: junit-jupiter
 * Version: 5.8.1
 *
 * @author Anders
 */

public class StringUtilityReverseStringTest {

    @Test
    public void reverseString_aBc_cBa() {
        String input = "aBc";

        String actual = StringUtility.reverse(input);
        String expected = "cBa";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_aBBc_cBBa() {
        String input = "aBBc";

        String actual = StringUtility.reverse(input);
        String expected =  "cBBa";

        assertEquals(expected, actual);
    }


}
