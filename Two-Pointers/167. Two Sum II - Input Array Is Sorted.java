/*
Problem: 167. Two Sum II - Input Array Is Sorted
Pattern: Two Pointers

Description:
Given a sorted array of integers and a target value,
return the 1-based indices of the two numbers whose sum equals the target.

Key Idea:
Use two pointers, one at the beginning and one at the end.
If the current sum is too small, move the left pointer.
If the current sum is too large, move the right pointer.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public static int[] twoSum(int[] numbers, int target) {
    int a = 0;
    int b = numbers.length - 1;
    int sum;

    while (a < b) {
        sum = numbers[a] + numbers[b];

        if (sum == target) {
            return new int[]{a + 1, b + 1};
        } else if (sum < target) {
            a++;
        } else {
            b--;
        }
    }

    return new int[]{-1, -1};
}
