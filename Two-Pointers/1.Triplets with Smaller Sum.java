/*
Problem: Count Triplets with Sum Smaller than X
Pattern: Two Pointers
Link : https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

Description:
Given an array of distinct integers and a value X,
count all triplets whose sum is smaller than X.

Key Idea:
Sort the array first. Fix one element and use two pointers
to search for valid pairs.

If the current triplet sum is smaller than X, then every
element between the left and right pointers can form a valid
triplet with the current fixed element because the array is sorted.

Instead of checking each pair individually, count all such
triplets at once using (right - left).

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    int countTriplets(int targetSum, int[] arr) {

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum < targetSum) {

                    count += right - left;
                    left++;

                } else {

                    right--;
                }
            }
        }

        return count;
    }
}
