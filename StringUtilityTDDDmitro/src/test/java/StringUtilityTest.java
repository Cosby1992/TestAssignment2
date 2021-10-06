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
    @Test
    public void reverseStringABCD(){
        String input = "ABCD";
        String actual = StringUtility.reverse(input);
        String expected = "DCBA";

        assertEquals(expected,actual);
    }
    @Test
    public void reverseEmptyString(){
        String input = "";
        String actual = StringUtility.reverse(input);
        String expected = "";

        assertEquals(expected,actual);
    }
    @Test
    public void reverseLengthyString(){
        String input = "Testing a whole sentence, just to make sure all of it is reversed";
        String actual = StringUtility.reverse(input);
        String expected = "desrever si ti fo lla erus ekam ot tsuj ,ecnetnes elohw a gnitseT";

        assertEquals(expected, actual);
    }

    // Capital to normal conversion tests from here on.

    @Test
    public void normalizeCapitalLettersABC(){
        String input = "ABC";
        String actual = StringUtility.normalize(input);
        String expected = "abc";

        assertEquals(expected, actual);
    }

    @Test
    public void normalizeCapitalLetters_AaBbcC(){
        String input = "AaBbcC";
        String actual = StringUtility.normalize(input);
        String expected = "aabbcc";

        assertEquals(expected, actual);
    }

    @Test
    public void normalizeAllLow(){
        String input = "abcdefg";
        String actual = StringUtility.normalize(input);
        String expected = "abcdefg";

        assertEquals(expected, actual);
    }

    @Test
    public void emptyStringTestNormalize(){
        String input = "";
        String actual = StringUtility.normalize(input);
        String expected = "";

        assertEquals(expected,actual);
    }


    // lowerCase to Capital conversion tests from here on.

    @Test
    public void capitalizeNormalLetters_abc(){
        String input = "abc";
        String actual = StringUtility.capitalize(input);
        String expected = "ABC";

        assertEquals(expected, actual);
    }

    @Test
    public void capitalizeNormalLetters_AaBbcC(){
        String input = "AaBbcC";
        String actual = StringUtility.capitalize(input);
        String expected = "AABBCC";

        assertEquals(expected, actual);
    }

    @Test
    public void normalizeAllCapital(){
        String input = "ABCDEFG";
        String actual = StringUtility.capitalize(input);
        String expected = "ABCDEFG";

        assertEquals(expected, actual);
    }

    @Test
    public void emptyStringTestCapitalize(){
        String input = "";
        String actual = StringUtility.capitalize(input);
        String expected = "";

        assertEquals(expected,actual);
    }

}