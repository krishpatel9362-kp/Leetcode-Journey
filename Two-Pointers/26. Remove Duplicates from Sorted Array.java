/*
Problem: 26. Remove Duplicates from Sorted Array
Pattern: Two Pointers
Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

Description:
Given a sorted array, remove the duplicates in-place such that
each unique element appears only once and return the number of
unique elements.

Key Idea:
Use two pointers:
- One pointer keeps track of the last unique element.
- The other pointer scans the array for new unique elements.

When a new unique element is found, place it immediately after
the last unique element and update the position of the unique section.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public int removeDuplicates(int[] arr) {
    int i = 0;
    int j = i + 1;
    int temp;

    while (j < arr.length) {
        if (arr[i] == arr[j]) {
            j++;
        } else {
            temp = arr[i + 1];
            arr[i + 1] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
    }

    return i + 1;
}
