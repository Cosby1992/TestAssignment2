import javax.print.DocFlavor;
import java.util.Locale;

public class StringUtility {
    public static String reverse(String input) {

        StringBuilder returnString = new StringBuilder();
        for (int i = input.length()-1; i > -1; i--){
            returnString.append(input.charAt(i));
        }
        return returnString.toString();

    }

    public static String normalize(String input) {
        char character;
        boolean checkForCapital;

        StringBuilder returnString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            character = input.charAt(i);
            checkForCapital = Character.isUpperCase(character);

            if(checkForCapital){
                returnString.append(Character.toLowerCase(character));
            }else{
                returnString.append(character);
            }

        }
        return returnString.toString();
    }

    public static String capitalize(String input) {

        char character;
        boolean checkForCapital;

        StringBuilder returnString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            character = input.charAt(i);
            checkForCapital = Character.isUpperCase(character);

            if(!checkForCapital){
                returnString.append(Character.toUpperCase(character));
            }else{
                returnString.append(character);
            }

        }
        return returnString.toString();
    }
    }
