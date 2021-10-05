public class StringUtility {
    public static String reverse(String input) {

        StringBuilder returnString = new StringBuilder();
        for (int i = input.length()-1; i > -1; i--){
            returnString.append(input.charAt(i));
        }
        return returnString.toString();

    }
}