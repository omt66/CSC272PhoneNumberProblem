package omt.csc272phonenumberproblem20210210;

/**
 *
 * @author omt
 */
public class SolutionWithForLoop {

    public static void main(String[] args) {
        System.out.println("--- Phone Number Problem (using for loops) ---");
        showAllWordsForPhoneNumber("2349876");
    }

    /**
     * This is a naive solution with for loops (not recommended)
     * 
     * @param phoneNumber 
     */
    static void showAllWordsForPhoneNumber(String phoneNumber) {
        System.out.println("Phone number is " + phoneNumber);
        String[] numStrs = phoneNumber.split("");
        int n1 = Integer.parseInt(numStrs[0]);
        int n2 = Integer.parseInt(numStrs[1]);
        int n3 = Integer.parseInt(numStrs[2]);
        int n4 = Integer.parseInt(numStrs[3]);
        int n5 = Integer.parseInt(numStrs[4]);
        int n6 = Integer.parseInt(numStrs[5]);
        int n7 = Integer.parseInt(numStrs[6]);
        String[] letters1 = getLettersFromNumber(n1);
        String[] letters2 = getLettersFromNumber(n2);
        String[] letters3 = getLettersFromNumber(n3);
        String[] letters4 = getLettersFromNumber(n4);
        String[] letters5 = getLettersFromNumber(n5);
        String[] letters6 = getLettersFromNumber(n6);
        String[] letters7 = getLettersFromNumber(n7);
        String[] letters = new String[7];

        for (int i = 0; i < 3; i++) {
            letters[0] = letters1[i];
            for (int j = 0; j < 3; j++) {
                letters[1] = letters2[j];
                for (int k = 0; k < 3; k++) {
                    letters[2] = letters3[k];
                    for (int l = 0; l < 3; l++) {
                        letters[3] = letters4[l];
                        for (int m = 0; m < 3; m++) {
                            letters[4] = letters5[m];
                            for (int n = 0; n < 3; n++) {
                                letters[5] = letters6[n];
                                for (int o = 0; o < 3; o++) {
                                    letters[6] = letters7[o];
                                    String word = String.join("", letters);
                                    System.out.println("word is " + word);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static void print(String msg, String[] arr) {
        System.out.println(msg);
        for (String item : arr) {
            System.out.println("item-> " + item);
        }
    }

    static String[] getLettersFromNumber(int n) {
        String[] num2strMap = {
            "000", // 0
            "111", // 1
            "ABC", // 2
            "DEF", // 3
            "GHI", // 4
            "JKL", // 5
            "MNO", // 6
            "PRS", // 7
            "TUV", // 8
            "WXY" // 9
        };
        String[] letters = num2strMap[n].split("");
        return letters;
    }
}
