package bowlinggame;

/**
 * This class handles one Bowling game score.
 *
 * @author Anders
 */
public class BowlingGame {
    // nine frames of two rolls, and last frame of three rolls = 21
    int[] scores = new int[21]; // scoreboard
    int roll = 0;

    /**
     * Adds the inputted point number to the score
     * @param numberOfPins the number of pins knocked down on the roll
     */
    public void roll(int numberOfPins) {
        scores[roll++] = numberOfPins;
    }

    /**
     * Calculates a score based on the current state of the scoreboard (scores[]).
     * It includes spare and strike bonuses.
     * @return the score calculated
     */
    public int calculateScore() {

        int totalScore = 0;

        // Run through the scores one frame (two rolls) at a time
        for (int activeFrameIndex = 0; activeFrameIndex < scores.length-1; activeFrameIndex += 2) {

            // in any case the first two pins of the frame give their score
            totalScore += scores[activeFrameIndex] + scores[activeFrameIndex + 1];

            if (!isLastFrame(activeFrameIndex)) {
                // case for normal frame (two rolls)

                if (isStrike(activeFrameIndex)) {
                    // if this roll is a strike, add the two next rolls as a bonus
                    if (isStrike(getNextFrameIndex(activeFrameIndex))) {
                        // case next roll is also a strike, we need to find the second bonus roll two frames ahead
                        totalScore += scores[getNextFrameIndex(activeFrameIndex)] + scores[getNextFrameIndex(getNextFrameIndex(activeFrameIndex))];
                    } else {
                        // add the two next rolls as bonus
                        totalScore += scores[getNextFrameIndex(activeFrameIndex)] + scores[getNextFrameIndex(activeFrameIndex + 1)];
                    }

                } else if (isSpare(activeFrameIndex)) {
                    // Case for spare, next roll gives bonus
                    totalScore += scores[getNextFrameIndex(activeFrameIndex)];
                }

            } else {
                // case for extended frame (10th frame), add the last frame
                totalScore += scores[activeFrameIndex + 2];
            }
        }

        return totalScore;
    }

    private int getNextFrameIndex(int frameIndex){
        return frameIndex + 2;
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
}
