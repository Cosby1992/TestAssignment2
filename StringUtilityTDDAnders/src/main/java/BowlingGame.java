import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    int[] scores = new int[21];
    int roll = 0;

    public void roll(int i) {
        scores[roll++] = i;
    }

    private boolean isSpare(int pin, int pin2) {
        // if pin one and two results in ten, it's a spare
        // unless the first pin is 10, then it would be a strike
        return (pin + pin2) == 10 && pin != 10;
    }

    private boolean isStrike(int pin) {
        return pin == 10;
    }

    public int getScore() {

        int totalScore = 0;
        int priviousScore = 0;

        for (int activeFrameIndex = 0; activeFrameIndex < scores.length-1; activeFrameIndex += 2) {

            int score = scores[activeFrameIndex] + scores[activeFrameIndex + 1];

                // add two in a row strike bonus
            if (activeFrameIndex > 3 && scores[activeFrameIndex - 2] == 10 && scores[activeFrameIndex - 4] == 10){
                totalScore += 10;
            } else if (activeFrameIndex > 0 && scores[activeFrameIndex - 2] == 10) {
                // account for strike
                totalScore += scores[activeFrameIndex] + scores[activeFrameIndex + 1];
            } else if (priviousScore == 10) {
                // account for spare
                totalScore += scores[activeFrameIndex];
            }

            priviousScore = score;

            totalScore += score;
        }

        return totalScore;
    }
}
