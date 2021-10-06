import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    int[] scores = new int[21];
    int roll = 0;

    public void roll(int i) {
        scores[roll++] = i;
    }

    private boolean isSpare(int frameIndex) {
        return scores[frameIndex] + scores[frameIndex + 1] == 10 && !isStrike(frameIndex);
    }

    private boolean isStrike(int frameIndex) {
        return scores[frameIndex] == 10;
    }

    private boolean isLastFrame(int frameIndex) {
        return !(frameIndex < 18);
    }


    public int getScore() {

        int totalScore = 0;
        int previousFrameScore = 0;

        for (int activeFrameIndex = 0; activeFrameIndex < scores.length-1; activeFrameIndex += 2) {

            // in any case the first two pins of the frame give their score
            totalScore += scores[activeFrameIndex] + scores[activeFrameIndex + 1];

            if (!isLastFrame(activeFrameIndex)) {
                // case for normal frame (two rolls)


                if (isStrike(activeFrameIndex)) {
                    // Case for strike

                    // case next roll is also a strike
                    if (isStrike(getNextFrameIndex(activeFrameIndex))) {
                        totalScore += scores[getNextFrameIndex(activeFrameIndex)] + scores[getNextFrameIndex(getNextFrameIndex(activeFrameIndex))];
                    } else {
                        totalScore += scores[getNextFrameIndex(activeFrameIndex)] + scores[getNextFrameIndex(activeFrameIndex + 1)];
                    }


                } else if (isSpare(activeFrameIndex)) {
                    // Case for spare
                    totalScore += scores[getNextFrameIndex(activeFrameIndex)];

                }

            } else {
                // case for extended frame (10th frame)

                totalScore += scores[activeFrameIndex + 2];


            }
        }

        return totalScore;
    }

    private int getNextFrameIndex(int frameIndex){
        return frameIndex + 2;
    }
}
