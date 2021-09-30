/**
 * This is a String utility class which can reverse a String.
 */

public class StringUtility {

    /**
     * reverses a String e.g. aBc -> cBa
     * @param input The String to reverse
     * @return the reversed String
     */
    public static String reverse(String input) {

        char[] chars = input.toCharArray();
        int leftPointer = 0;
        int rightPointer = chars.length-1;

        while(leftPointer < rightPointer){

            char temp = chars[leftPointer];
            chars[leftPointer] = chars[rightPointer];
            chars[rightPointer] = temp;

            leftPointer++;
            rightPointer--;

        }

        return new String(chars);
    }
}
