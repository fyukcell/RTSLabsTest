import java.security.InvalidParameterException;

/**
 * Q2CharRotate solves the second question in coding test given by RTSLabs.
 * 
 * @author Mehmet Yuksel
 * @version 1.0
 *
 */
public class Q2CharRotate {
    
    /**
     * charRotate rotates characters in given text by the given value.
     * It performs a modulo operation to find out how many letters will be
     * rotated in the end result and only rotates those letters.
     * Prints the resulting string to stdout.
     * 
     * @param input is the String value that contains the text to be rotated
     * @param value is the number of letters that will be rotated
     * @throws InvalidParameterException
     */
    public static void charRotate(String input, int value) {
        if (value < 0) throw new InvalidParameterException("Value Not Valid");
        
        int length = input.length();
        int numOfLetters = value % length;
       
        String flippedLetters = input.substring(length - numOfLetters);
        input = flippedLetters + input.substring(0, length - numOfLetters);
       
        System.out.println(input);
    }
    
    /**
     * Reads user input for valid values, if there is then processes them 
     * and calls charRotate function. If input is not valid, throws InvalidParameterException.
     * If there is no input, calls charRotate function with example values.
     * 
     * @param args is the user input, first value is the String to be rotated
     * the second value is the number that determines how many letters will be rotated.
     * @throws InvalidParameterException
     */
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                charRotate(args[0], Integer.parseInt(args[1]));
            }
            catch(Exception e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        else {
            charRotate("MyString", 2);
        }
        
    }
}
