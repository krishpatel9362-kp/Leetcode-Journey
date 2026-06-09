/*
Problem: 977. Squares of a Sorted Array
Pattern: Two Pointers
Link : https://leetcode.com/problems/squares-of-a-sorted-array/

Description:
Given a sorted integer array, return an array containing the
squares of each number, also sorted in non-decreasing order.

Key Idea:
Negative numbers become positive after squaring, which can
change their relative order. Convert negative numbers to their
absolute values and treat the array as two sorted portions:
the original negative numbers (in reverse order) and the
non-negative numbers.

Use two pointers to merge these two sorted portions into
the final answer array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public int[] sortedSquares(int[] nums) {

    int positiveIndex = 0;
    int negativeIndex = 0;

    // Handle the case where all numbers are negative
    if (nums[nums.length - 1] < 0) {
        positiveIndex = nums.length;
    }

    // Find the first non-negative number
    // and convert negatives to absolute values
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] >= 0) {
            positiveIndex = i;
            break;
        } else {
            nums[i] *= -1;
        }
    }

    negativeIndex = positiveIndex - 1;

    int[] result = new int[nums.length];
    int resultIndex = 0;

    while (positiveIndex < nums.length && negativeIndex >= 0) {

        if (nums[positiveIndex] <= nums[negativeIndex]) {
            result[resultIndex] = nums[positiveIndex] * nums[positiveIndex];
            positiveIndex++;
        } else {
            result[resultIndex] = nums[negativeIndex] * nums[negativeIndex];
            negativeIndex--;
        }

        resultIndex++;
    }

    while (positiveIndex < nums.length) {
        result[resultIndex] = nums[positiveIndex] * nums[positiveIndex];
        positiveIndex++;
        resultIndex++;
    }

    while (negativeIndex >= 0) {
        result[resultIndex] = nums[negativeIndex] * nums[negativeIndex];
        negativeIndex--;
        resultIndex++;
    }

    return result;
}
