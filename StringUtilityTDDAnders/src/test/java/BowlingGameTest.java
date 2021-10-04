import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    private void rollMany(BowlingGame game, int iterations, int points) {
        for (int i = 0; i < iterations; i++) {
            game.roll(points);
        }
    }

    @Test
    public void getScore_gameOfZero_0() {
        BowlingGame game = new BowlingGame();
        rollMany(game, 20, 0);
        int actual = game.getScore();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void getScore_gameOfOnes_20() {
        BowlingGame game = new BowlingGame();
        rollMany(game, 20, 0);
        int actual = game.getScore();
        int expected = 20;
        assertEquals(expected, actual);
    }

}
