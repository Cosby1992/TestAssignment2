import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    int[] scores = new int[21];
    int roll = 0;

    public void roll(int i) {
        scores[roll++] = i;
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
