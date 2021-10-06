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
        int previousFrameScore = 0;

        for (int activeFrameIndex = 0; activeFrameIndex < scores.length-1; activeFrameIndex += 2) {

            // in any case the first two pins of the frame give their score
            totalScore += scores[activeFrameIndex] + scores[activeFrameIndex + 1];

            if(activeFrameIndex < 18) {
                // case for normal frame (two rolls)


                if(scores[activeFrameIndex] == 10){
                    // Case for strike

                    // case next roll is also a strike
                    if (scores[getNextFrameIndex(activeFrameIndex)] == 10) {
                        totalScore += scores[getNextFrameIndex(activeFrameIndex)] + scores[getNextFrameIndex(getNextFrameIndex(activeFrameIndex))];
                    } else {
                        totalScore += scores[getNextFrameIndex(activeFrameIndex)] + scores[getNextFrameIndex(activeFrameIndex + 1)];
                    }



                } else if (scores[activeFrameIndex] + scores[activeFrameIndex + 1] == 10){
                    // Case for spare
                    totalScore += scores[getNextFrameIndex(activeFrameIndex)];

                }

            } else {
                // case for extended frame (10th frame)

                totalScore += scores[activeFrameIndex+2];


            }





//            int score = scores[activeFrameIndex] + scores[activeFrameIndex + 1];
//
//                // add two in a row strike bonus
//            if (activeFrameIndex > 3 && scores[activeFrameIndex - 2] == 10 && scores[activeFrameIndex - 4] == 10){
//                totalScore += 10;
//            } else if (activeFrameIndex > 0 && scores[activeFrameIndex - 2] == 10) {
//                // account for strike
//                totalScore += scores[activeFrameIndex] + scores[activeFrameIndex + 1];
//            } else if (previousFrameScore == 10) {
//                // account for spare
//                totalScore += scores[activeFrameIndex];
//            }
//
//            if (activeFrameIndex == 18) { // if it's the tenth frame of the game
//                System.out.println("Total start -> " + totalScore);
//                if (scores[activeFrameIndex] == 10 && scores[activeFrameIndex + 1] == 10) {
//                    totalScore += scores[activeFrameIndex + 2];
//                } if (scores[activeFrameIndex] == 10) {
//                    totalScore += scores[activeFrameIndex + 1] + scores[activeFrameIndex + 2];
//                } else if ((scores[activeFrameIndex] + scores[activeFrameIndex + 1] == 10)) {
//                    totalScore += scores[activeFrameIndex + 2];
//                } else if (scores[activeFrameIndex + 1] == 10) {
//                    totalScore += scores[activeFrameIndex + 2];
//                }
//
//                totalScore += scores[activeFrameIndex + 2];
//
//                System.out.println("Total end -> " + totalScore);
//
//            }
//
//            previousFrameScore = score;
//
//            totalScore += score;
        }

        return totalScore;
    }

    private int getNextFrameIndex(int frameIndex){
        return frameIndex + 2;
    }
}
