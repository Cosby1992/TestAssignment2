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

    @Test
    public void reverseString_AlPhAbEt_tEbAhPlA() {
        String input = "AlPhAbEt";

        String actual = StringUtility.reverse(input);
        String expected =  "tEbAhPlA";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_LSDLkncvsd807w0452_2540w708dsvcnkLDSL() {
        String input = "LSDLkncvsd807w0452";

        String actual = StringUtility.reverse(input);
        String expected =  "2540w708dsvcnkLDSL";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_emptyString_emptyString() {
        String input = "";

        String actual = StringUtility.reverse(input);
        String expected =  "";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_1letter_Q() {
        String input = "Q";

        String actual = StringUtility.reverse(input);
        String expected =  "Q";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_2letters_Qr() {
        String input = "rQ";

        String actual = StringUtility.reverse(input);
        String expected =  "Qr";

        assertEquals(expected, actual);
    }



}
