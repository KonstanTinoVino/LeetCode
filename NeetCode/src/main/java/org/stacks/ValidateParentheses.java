package org.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://neetcode.io/problems/validate-parentheses
public class ValidateParentheses {

    public boolean isValid(String s) {

        Stack<Character> characters = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>(3);

        bracketLookup.put(')', '(');
        bracketLookup.put('}', '{');
        bracketLookup.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (bracketLookup.containsKey(c)) { // if it contains closing parenthesis
                // check if it's not empty ex. "}"
                // check if closing bracket matches preceding opening bracket
                if (!characters.isEmpty() && bracketLookup.get(c).equals(characters.peek())) {
                    // remove opening parenthesis from the stack i.e. ex. "{"
                    characters.pop();
                // else either the list was empty, and we are trying to add a closing parenthesis
                // or the previous character is a mismatch to the incoming one i.e. "[}"
                } else {
                    return false;
                }
            // else the incoming char is an opening parenthesis
            } else {
                // push to stack
                characters.push(c);
            }
        }
        // If the list is empty all parenthesis were closed correctly
        // else there is a missing closing parenthesis
        return characters.isEmpty();
    }

}
