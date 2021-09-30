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
    public void reverseString_threeMixedLetters_cBa() {
        String input = "aBc";

        String actual = StringUtility.reverse(input);
        String expected = "cBa";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_fourMixedLetters_cBBa() {
        String input = "aBBc";

        String actual = StringUtility.reverse(input);
        String expected =  "cBBa";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_eightMixedLetters_tEbAhPlA() {
        String input = "AlPhAbEt";

        String actual = StringUtility.reverse(input);
        String expected =  "tEbAhPlA";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_mixedLettersAndNumbers_2540w708dsvcnkLDSL() {
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
    public void reverseString_oneLetter_Q() {
        String input = "Q";

        String actual = StringUtility.reverse(input);
        String expected =  "Q";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_twoLetters_Qr() {
        String input = "rQ";

        String actual = StringUtility.reverse(input);
        String expected =  "Qr";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_SpecialCharacters_SpecialCharactersReversed() {
        String input = "!#¤%&/()=:;,.-<>*+@£$€{[]}|¨";

        String actual = StringUtility.reverse(input);
        String expected =  "¨|}][{€$£@+*><-.,;:=)(/&%¤#!";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_NewLine_NewLine() {
        String input = "\n";

        String actual = StringUtility.reverse(input);
        String expected =  "\n";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_StringContainingNewLine_ReversedStringContainingNewLine() {
        String input = "anders\nanders";

        String actual = StringUtility.reverse(input);
        String expected =  "sredna\nsredna";

        assertEquals(expected, actual);
    }

    @Test
    public void reverseString_tabulator_tabulator() {
        String input = "\t";

        String actual = StringUtility.reverse(input);
        String expected =  "\t";

        assertEquals(expected, actual);
    }



}
