/*
Problem: 80. Remove Duplicates from Sorted Array II
Pattern: Two Pointers
Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

Description:
Given a sorted array, remove duplicates in-place such that
each unique element appears at most twice and return the
length of the modified array.

Key Idea:
Use two pointers:
- One pointer keeps track of the position where the next valid
  element should be placed.
- The other pointer scans the array.

A boolean flag is used to track whether a duplicate has already
been allowed. The first duplicate is kept, while additional
duplicates are skipped.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public int removeDuplicates1(int[] nums) {
    int assign = 0;
    int check = 1;
    boolean repeat = true;

    while (check < nums.length) {

        if (nums[check] != nums[check - 1]) {
            nums[assign + 1] = nums[check];
            assign++;
            check++;
            repeat = true;
        } else {

            if (repeat == true) {
                nums[assign + 1] = nums[check];
                assign++;
                check++;
                repeat = false;
            } else {
                check++;
            }
        }
    }

    return assign + 1;
}
