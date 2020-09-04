import java.security.InvalidParameterException;

/**
 * Q1AboveBelow class answers the first question in coding test given by RTSLabs.
 * 
 * @author Mehmet Yuksel
 * @version 1.0
 */
public class Q1AboveBelow {

    /**
     * aboveBelow function compares the threshold value with each element in
     * input array and counts for the values above it and below it.
     * Then it prints the results to stdout.
     * 
     * @param input is the array of integers that are compared with the value
     * @param value is the threshold for comparison
     */
    public static void aboveBelow (int[] input, int value) {
        
        int above = 0, below = 0;
        
        for (int i = 0; i < input.length; i++) {
            if (input[i] < value) below++;
            else if (input[i] > value) above++;
            else continue;
        }
        
        System.out.println("above: " + above + ", below: " + below);
    }
    
    /**
     * Main function checks for a valid input from user, if there is
     * it processes the input if there is not then executes the example input.
     * If the input is not valid, then throws invalid parameter exception.
     * 
     * @throws InvalidParameterException
     * @param args is the user input.
     */
    public static void main (String[] args) {
        
        if (args.length > 2) {
            try {
                int [] input = new int[args.length - 1];
                int value = Integer.parseInt(args[0]);
                for (int i = 1; i < args.length; i++) {
                    input[i - 1] = Integer.parseInt(args[i]);
                }
                aboveBelow(input, value);
            }
            catch(Exception e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        else {
            int [] input = {1, 5, 2, 1, 10};
            int value = 6;
            aboveBelow(input, value);
        }
    }
}
