import java.nio.charset.StandardCharsets;

/**
 * This is a String utility class which can reverse a String.
 */

public class StringUtility {

    private static final int ASCII_TRANSFORM_CONSTANT = 32;
    private static final int ASCII_UPPERCASE_START_INDEX = 65;
    private static final int ASCII_UPPERCASE_END_INDEX = 90;
    private static final int ASCII_LOWERCASE_START_INDEX = 97;
    private static final int ASCII_LOWERCASE_END_INDEX = 122;


    /**
     * reverses a String e.g. aBc -> cBa
     * @param input The String to reverse
     * @return the reversed String
     */
    public static String reverse(String input) {
        // Guard if input is null
        if(input == null) return null;

        // input and output arrays
        char[] inputCharArray = input.toCharArray();
        char[] reversedCharArray = new char[inputCharArray.length];

        // pointers to keep track of current char index and placement index in output array
        int nextCharPointer = 0; // first char
        int placementCharPointer = inputCharArray.length-1; // last index

        // Go through the input array and place each char in the output array
        while(nextCharPointer < inputCharArray.length){

            // Find out how many char[] indexes a char takes up
            // This is purely to support unicode characters like
            // smileys and special characters (e.g. chinese letters)
            int characterLength =  Character.charCount(Character.codePointAt(inputCharArray, nextCharPointer));

            if(characterLength == 1) {
                // if character is only taking up one space in the array
                reversedCharArray[placementCharPointer--] = inputCharArray[nextCharPointer++];
            } else {
                // if character is taking up multiple spaces in the array
                for (int i = 0, placementDelta = characterLength-1; i < characterLength; i++, placementDelta--) {
                    reversedCharArray[placementCharPointer - placementDelta] = inputCharArray[nextCharPointer + i];
                }
                nextCharPointer += characterLength;
                placementCharPointer -= (characterLength);
            }

            // keep going until the end of the input array
        }

        // return the reversed message
        return new String(reversedCharArray);

    }

    /**
     * capitalizes a String e.g aBc -> ABC
     * @param input The String to capitalize
     * @return the capitalized String
     */
    public static String capitalize(String input) {
        // Guard against null input
        if(input == null) return null;

        char[] inputCharArray = input.toCharArray();

        // Going through each letter, if it is a lowercase letter,
        // transform it to uppercase through ascii transformation. (see ascii-table for reference)
        for (int i = 0; i < inputCharArray.length; i++) {
            if(inputCharArray[i] >= ASCII_LOWERCASE_START_INDEX && inputCharArray[i] < ASCII_LOWERCASE_END_INDEX) {
                inputCharArray[i] -= ASCII_TRANSFORM_CONSTANT;
            }
        }

        return new String(inputCharArray);
    }

    /**
     * converts a String to lowercase e.g. AbC -> abc
     * @param input the String to convert
     * @return the String in lowercase
     */
    public static String lowercase(String input) {

        char[] inputCharArray = input.toCharArray();

        // Going through each letter, if it is an uppercase letter,
        // transform it to lowercase through ascii transformation. (see ascii-table for reference)
        for (int i = 0; i < inputCharArray.length; i++) {
            if(inputCharArray[i] >= ASCII_UPPERCASE_START_INDEX && inputCharArray[i] <= ASCII_UPPERCASE_END_INDEX) {
                inputCharArray[i] += ASCII_TRANSFORM_CONSTANT;
            }
        }

        return new String(inputCharArray);
    }
}
