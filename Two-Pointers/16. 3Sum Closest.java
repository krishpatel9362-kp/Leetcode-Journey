/*
Problem: 16. 3Sum Closest
Pattern: Two Pointers
Link : https://leetcode.com/problems/3sum-closest/

Description:
Given an integer array nums and an integer target,
find three integers in nums such that the sum is
closest to the target.

Return the sum of the three integers.

Key Idea:
Sort the array first. Fix one element and use two
pointers to find the pair that produces a sum closest
to the target.

Instead of searching for an exact triplet that sums to
zero (as in 3Sum), continuously track the closest sum
encountered so far.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public int threeSumClosest(int[] arr, int target) {

        Arrays.sort(arr);

        int closestSum = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int currentSum = arr[i] + arr[left] + arr[right];

                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                if (currentSum == target) {
                    return currentSum;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}
