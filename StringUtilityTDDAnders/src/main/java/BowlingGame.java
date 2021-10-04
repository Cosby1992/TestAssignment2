public class BowlingGame {
    int score = 0;

    public void roll(int i) {
        score += i;
    }

    public int getScore() {
        return score;
    }
}
