import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Scope
 * Class: StringUtility
 * Method: public String lowercase(String input)
 *
 * Test framework
 * Name: junit-jupiter
 * Version: 5.8.1
 *
 * @author Anders
 */
public class StringUtilityLowercaseTest {

    @Test
    public void lowercase_oneLetter_a() {

        String input = "A";
        String actual = StringUtility.lowercase(input);
        String expected = "a";

        assertEquals(expected, actual);
    }

    @Test
    public void lowercase_twoLetters_ab() {

        String input = "AB";
        String actual = StringUtility.lowercase(input);
        String expected = "ab";

        assertEquals(expected, actual);
    }

    @Test
    public void lowercase_mixedLettersAndNumbers_ljasnfd9087134lwjef() {
        String input = "LJASNFD9087134LWJEF";
        String actual = StringUtility.lowercase(input);
        String expected = "ljasnfd9087134lwjef";

        assertEquals(expected, actual);
    }


}
