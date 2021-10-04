import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    public void getScore_gameOfZero_0() {
        BowlingGame game = new BowlingGame();

        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

        int actual = game.getScore();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void getScore_gameOfOnes_20() {
        BowlingGame game = new BowlingGame();

        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }

        int actual = game.getScore();
        int expected = 20;

        assertEquals(expected, actual);

    }

}
