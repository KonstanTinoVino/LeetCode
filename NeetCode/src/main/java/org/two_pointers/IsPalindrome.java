package org.two_pointers;

public class IsPalindrome {

    /*
    Given a string s, return true if it is a palindrome, otherwise return false.

    A palindrome is a string that reads the same forward and backward.
    It is also case-insensitive and ignores all non-alphanumeric characters.

    Example 1:

        Input: s = "Was it a car or a cat I saw?"

        Output: true
        Explanation: After considering only alphanumerical characters we have
        "wasitacaroracatisaw", which is a palindrome.

    Example 2:

        Input: s = "tab a cat"

        Output: false
        Explanation: "tabacat" is not a palindrome.

    Constraints:

        1 <= s.length <= 1000
        s is made up of only printable ASCII characters.
         */

    public static boolean isPalindrome(String s) {

        s = s.replaceAll(
                "[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char one = s.charAt(i);
            char two = s.charAt(s.length() - (i+1));

            if (one != two) return false;
            else if (i < s.length() - (i+1)) return true;
        }

        return true;
    }

    public boolean isPalindromeWhile(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";

        System.out.printf(String.valueOf(isPalindrome(s)));

    }
}
