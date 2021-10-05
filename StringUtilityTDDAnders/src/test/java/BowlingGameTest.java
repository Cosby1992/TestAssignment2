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
        rollMany(game, 20, 1);
        int actual = game.getScore();
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    public void getScore_oneSpare_16() {
        BowlingGame game = new BowlingGame();
        game.roll(5);
        game.roll(5);
        game.roll(3);
        rollMany(game, 17, 0);
        int actual = game.getScore();
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    public void getScore_oneStrike_14() {
        BowlingGame game = new BowlingGame();
        game.roll(10);
        game.roll(0);
        game.roll(1);
        game.roll(1);
        rollMany(game, 17, 0);
        int actual = game.getScore();
        int expected = 14;
        assertEquals(expected, actual);
    }

}
