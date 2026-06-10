/*
Problem: 15. 3Sum
Pattern: Two Pointers
Link : https://leetcode.com/problems/3sum/

Description:
Given an integer array nums, return all unique triplets
[nums[i], nums[j], nums[k]] such that:

nums[i] + nums[j] + nums[k] == 0

The solution set must not contain duplicate triplets.

Key Idea:
Sort the array first. Fix one element and then use
two pointers to find the remaining two elements that
sum to the negative of the fixed element.

Since the array is sorted:
- Move the left pointer right to increase the sum.
- Move the right pointer left to decrease the sum.
- Skip duplicate values to avoid duplicate triplets.

Time Complexity: O(n²)
Space Complexity: O(1) (excluding the output list)
*/

public List<List<Integer>> threeSum(int[] arr) {

    List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 2; i++) {

        if (i > 0 && arr[i] == arr[i - 1]) {
            continue;
        }

        int left = i + 1;
        int right = arr.length - 1;
        int target = -arr[i];

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                ans.add(Arrays.asList(arr[i], arr[left], arr[right]));

                left++;
                right--;

                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }

                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    return ans;
}
