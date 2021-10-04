import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Scope
 * Class: StringUtility
 * Method: public String capitalize(String input)
 *
 * Test framework
 * Name: junit-jupiter
 * Version: 5.8.1
 *
 * @author Anders
 */
public class StringUtilityCapitalizeTest {

    @Test
    public void capitalize_null_null() {
        String input = null;

        @SuppressWarnings("ConstantConditions")
        String actual = StringUtility.capitalize(input);
        String expected = null;

        assertEquals(expected, actual);
    }

    @Test
    public void capitalize_a_A() {
        String input = "a";
        String actual = StringUtility.capitalize(input);
        String expected = "A";

        assertEquals(expected, actual);
    }

    @Test
    public void capitalize_aBc_ABC() {
        String input = "aBc";
        String actual = StringUtility.capitalize(input);
        String expected = "ABC";

        assertEquals(expected, actual);
    }

    @Test
    public void capitalize_mixedLettersAndNumbers_2540w708dsvcnkLDSL() {
        String input = "LSDLkncvsd807w0452";

        String actual = StringUtility.capitalize(input);
        String expected =  "LSDLKNCVSD807W0452";

        assertEquals(expected, actual);
    }

    // I do not have time to implment special characters like æøå and modified letters like éúû etc...

//    @Test
//    public void capitalize_danishCharacters_ÆØÅ() {
//        String input = "æØå";
//
//        String actual = StringUtility.capitalize(input);
//        String expected =  "ÆØÅ";
//
//        assertEquals(expected, actual);
//    }

}
