package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return padding(stringToBePadded, amountOfPadding) + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return stringToBePadded + padding(stringToBePadded, amountOfPadding);
    }

    public static String padding(String stringToBePadded, int amountOfPadding){
        String padding = "";
        for (int i = 0; i < amountOfPadding-stringToBePadded.length(); i++){
            padding += " ";
        }
        return padding;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++){
            result.append(stringToBeRepeated);
        }
        return result.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        Boolean result = true;
        char[] chars = string.toCharArray();
        for (char c : chars){
            if (isNotAlpha(c)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isNotAlpha(char c){
        return (c < ' ' || (c > ' ' && c < 'A') || (c > 'Z' && c < 'a') || c > 'z');
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        Boolean result = true;
        char[] chars = string.toCharArray();
        for (char c : chars){
            if (isNotNumeric(c)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isNotNumeric(char c){
        return (c < '0' || c > '9');
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        Boolean result = true;
        char[] chars = string.toCharArray();
        for (char c : chars){
            if(!isNotNumeric(c) || !isNotAlpha(c)){
                result = false;
                break;
            }
        }
        return result;
    }
}
