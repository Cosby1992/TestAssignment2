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
    public void reverseString_aBc_ShouldBe_cBa() {
        String actual;
        String input = "aBc";

        actual = StringUtility.reverse(input);

        String expected = "cBa";
        assertEquals(expected, actual);
    }


}
