package org.binary_search;

import java.util.Arrays;

public class BinarySearch {

    /*
    You are given an array of distinct integers nums, sorted in ascending order, and an integer target.

    Implement a function to search for target within nums.
    If it exists, then return its index, otherwise, return -1.

    Your solution must run in O(logn) time.

    Example 1:

        Input: nums = [-1,0,2,4,6,8], target = 4

        Output: 3
    Example 2:

        Input: nums = [-1,0,2,4,6,8], target = 3

        Output: -1
    Constraints:

        1 <= nums.length <= 10000.
        -10000 < nums[i], target < 10000

     */

    public int search(int[] nums, int target) {

        if (nums.length == 0) return -1;

        int middle = nums[nums.length / 2];
        if (middle == target) return 0;
        if (middle > target) search(Arrays.copyOfRange(nums, 0, nums.length / 2 ), target);
        else search(Arrays.copyOfRange(nums, 0, nums.length / 2 ), target);

        return -1;
    }
}
