package org.arays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://neetcode.io/problems/is-anagram
public class ValidAnagram {

    /*
        Given two strings s and t, return true if the two strings are anagrams of each other,
        otherwise return false.

        An anagram is a string that contains the exact same characters as another string,
        but the order of the characters can be different.

        Example 1:

        Input: s = "racecar", t = "carrace"

        Output: true
        Example 2:

        Input: s = "jar", t = "jam"

        Output: false
        Constraints:

        s and t consist of lowercase English letters.
     */

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Character key : mapS.keySet()) {
            if (!mapS.get(key).equals(mapT.get(key))) return false;
        }

        return true;
    }

    public static boolean isAnagramSorting(String s, String t){
        if (s.length() != t.length()) return false;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);

        return new String(chars).equals(new String(chars2));
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        System.out.println(isAnagram(s, t));

        System.out.println(isAnagramSorting(s, t));
    }
}
