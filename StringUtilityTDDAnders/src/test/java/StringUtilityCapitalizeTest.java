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

}
