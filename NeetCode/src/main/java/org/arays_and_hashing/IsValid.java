package org.arays_and_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://neetcode.io/problems/validate-parentheses
public class IsValid {

    /*
    You are given a string s consisting of the following characters:
    '(', ')', '{', '}', '[' and ']'.

    The input string s is valid if and only if:

    Every open bracket is closed by the same type of close bracket.
    Open brackets are closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
    Return true if s is a valid string, and false otherwise.

    Example 1:

        Input: s = "[]"

        Output: true
    Example 2:

        Input: s = "([{}])"

        Output: true
    Example 3:

        Input: s = "[(])"

        Output: false
        Explanation: The brackets are not closed in the correct order.

    Constraints:

        1 <= s.length <= 1000
     */

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>(3);

        bracketLookup.put(')', '(');
        bracketLookup.put('}', '{');
        bracketLookup.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        }

        return stack.isEmpty();
    }
}
