package omt.csc272phonenumberproblem20210210;

import java.util.ArrayList;
import java.util.List;

/**
 * This util class will help us to find the words for a given phone number
 * as well as finds the phone number from the word.
 * @author omt
 */
public class PhoneNumberToWordsFinder {
    int nofChar;
    List<String> words;
    
    /**
     * This method will find all the words for the given phone number info.
     * @param phoneNumber
     * @return words (all words found recursively)
     */
    public List<String> findWords(String phoneNumber) {
        System.out.println("I will find the words, I promise :) " + phoneNumber);
        nofChar = phoneNumber.length();
        words = new ArrayList<>();
        permutate("", phoneNumber);
        
        return words;
    }
    
    /**
     * This one does the reverse, i.e. it finds the phone number based
     * on the given word.
     * @param phoneWord
     * @return phone number
     */
    public String findPhoneNumber(String phoneWord) {
        String[] letters = phoneWord.split("");
        String phoneNumber = "";
        for (String letter: letters) {
            if ("ABC".contains(letter)) phoneNumber += "2";
            else if ("DEF".contains(letter)) phoneNumber += "3";
            else if ("GHI".contains(letter)) phoneNumber += "4";
            else if ("JKL".contains(letter)) phoneNumber += "5";
            else if ("MNO".contains(letter)) phoneNumber += "6";
            else if ("PQRS".contains(letter)) phoneNumber += "7";
            else if ("TUV".contains(letter)) phoneNumber += "8";
            else if ("WXYZ".contains(letter)) phoneNumber += "9";
            else phoneNumber += letter;
        }
        
        return phoneNumber;
    }
    
    /**
     * This is the important part: A recursive method that allows us to 
     * find the words based on the prefix, and the remaining number string.
     * In each recursive call, it removes the first character from the
     * string (i.e. the numStr).
     * @param prefix
     * @param numStr 
     */
    private void permutate(String prefix, String numStr) {
        if (prefix.length() == nofChar) {
            words.add(prefix);
        }
        if (numStr.equals("")) return;
        
        int n = Character.getNumericValue(numStr.charAt(0));
        String[] letters = getLettersFromNumber(n);
        numStr = numStr.substring(1);
        for (String letter: letters) {
            permutate(prefix + letter, numStr);
        }
    }
    
    /**
     * This is our look up table (or simple map) to find the corresponding
     * letters for a give number [0..9]
     * @param n
     * @return corresponding letters for the number n
     */
    private String[] getLettersFromNumber(int n) {
        String[] num2strMap = {
            "000",  // 0
            "111",  // 1
            "ABC",  // 2
            "DEF",  // 3
            "GHI",  // 4
            "JKL",  // 5
            "MNO",  // 6
            "PQRS", // 7
            "TUV",  // 8
            "WXYZ"  // 9
        };
        String[] letters = num2strMap[n].split("");
        return letters;
    }
}
