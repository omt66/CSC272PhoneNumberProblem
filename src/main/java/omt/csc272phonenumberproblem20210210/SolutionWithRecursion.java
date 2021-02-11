package omt.csc272phonenumberproblem20210210;

import java.util.List;

/**
 * This is the application (i.e. the demo)
 * It uses the util library that we created during the class.
 * 
 * @author omt
 */
public class SolutionWithRecursion {
    public static void main(String[] args) {
        System.out.println("--- Our Soluton with Recursion ---");
        
        PhoneNumberToWordsFinder finder = new PhoneNumberToWordsFinder();
        String phoneNumber = "7382273";
        List<String> words = finder.findWords(phoneNumber);
        
        for (String word: words) {
            System.out.println("Word I found: " + word);
        }
        
        System.out.println("Let's find out the phone numbers now");
        String word = "1-800-PETCARE";
        phoneNumber = finder.findPhoneNumber(word);
        System.out.println(String.format("%s phone number is %s", word, phoneNumber));
        
        word = "1-800-HAIRCUT";
        phoneNumber = finder.findPhoneNumber(word);
        System.out.println(String.format("%s phone number is %s", word, phoneNumber));
    }
}
