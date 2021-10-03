import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityCapitalizeTest {

    @Test
    public void capitalize_null_null() {
        String input = null;
        String actual = StringUtility.capitalize(input);
        String expected = null;

        assertEquals(expected, actual);

    }

}
