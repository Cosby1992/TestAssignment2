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
        if(input == null) return null;

        char[] chars = input.toCharArray();

        // pointers to keep track of left and right position in char array
        int leftPointer = 0;
        int rightPointer = chars.length-1;

        while(leftPointer < rightPointer){

            // flip left and right letter (starting from the outside)
            char temp = chars[leftPointer];
            chars[leftPointer] = chars[rightPointer];
            chars[rightPointer] = temp;

            // move the pointers one place towards center of array
            leftPointer++;
            rightPointer--;

            // keep going until the pointers meet (or overlap)
        }

        // return the reversed message
        return new String(chars);
    }
}
