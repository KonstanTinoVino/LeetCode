package org.arays_and_hashing;

import java.util.HashSet;
import java.util.Set;

// https://neetcode.io/problems/duplicate-integer
public class ContainsDuplicate {


    /*
    Given an integer array nums, return true if any value appears more than once in the array,
    otherwise return false.

    Example 1:

        Input: nums = [1, 2, 3, 3]

        Output: true
        Example 2:

    Input: nums = [1, 2, 3, 4]

        Output: false
     */

    public static boolean Solution(int[] nums){

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }

}
