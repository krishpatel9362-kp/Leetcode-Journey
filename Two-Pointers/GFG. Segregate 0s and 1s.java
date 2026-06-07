/*
Problem: Segregate 0s and 1s
Pattern: Two Pointers
Link : https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

Description:
Given an array containing only 0s and 1s,
rearrange the array so that all 0s appear before all 1s.

Key Idea:
Use two pointers, one at the beginning and one at the end.
If the left pointer is pointing to 0, move it forward.
If the left pointer is pointing to 1, swap it with the element
at the right pointer and move the right pointer backward.

Time Complexity: O(n)
Space Complexity: O(1)
*/

static void segregate0and1(int[] arr) {
    int p1 = 0;
    int p2 = arr.length - 1;
    int temp;

    while (p1 < p2) {

        if (arr[p1] == 0) {
            p1++;
        } else {
            temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p2--;
        }
    }
}
