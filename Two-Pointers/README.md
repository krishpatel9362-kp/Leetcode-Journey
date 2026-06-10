# Two Pointers Pattern

## When to Use

The Two Pointers pattern is useful when:

- The array is sorted.
- Looking for a pair of values.
- Comparing elements from both ends.
- Trying to reduce a nested loop solution.

## Core Idea

Maintain two indices and move them based on a condition.

Common behavior:

- Move the left pointer to increase a value or sum.
- Move the right pointer to decrease a value or sum.

This often improves the time complexity from O(n²) to O(n).

## Problems Solved

| # | Problem | Difficulty |
|---|---------|------------|
| 167 | Two Sum II - Input Array Is Sorted | Medium |
| 1 | Segregate 0s and 1s | Easy |
| 26 | Remove Duplicates from Sorted Array | Easy |
| 80 | Remove Duplicates from Sorted Array II | Medium |
| 977 | Squares of a Sorted Array | Easy |
| 15 | 3Sum | Medium |


## Key Takeaways

## 167 - Two Sum II

- Brute force checks every pair and takes O(n²).
- Since the array is sorted, two pointers can be used.
- If the sum is too small, move the left pointer.
- If the sum is too large, move the right pointer.
- Time Complexity: O(n)
- Space Complexity: O(1)

## 1 - Segregate 0s and 1s

- Brute force can count the number of 0s and fill the array accordingly.
- Since only two distinct values exist, the array can be partitioned using two pointers.
- The left pointer searches for misplaced 1s.
- The right pointer marks where 1s should be placed.
- Swapping gradually moves all 0s to the left and all 1s to the right.
- Time Complexity: O(n)
- Space Complexity: O(1)

## 26 - Remove Duplicates from Sorted Array

- Brute force can use an additional array or collection to store unique values.
- Since the array is sorted, duplicate values will always be adjacent.
- One pointer keeps track of the last unique element.
- Another pointer scans the array looking for new unique values.
- When a new unique value is found, it is placed immediately after the unique section.
- The length of the unique section is returned as the answer.
- Time Complexity: O(n)
- Space Complexity: O(1)

## 80 - Remove Duplicates from Sorted Array II

- Brute force can use an additional array or collection to store valid elements.
- Since the array is sorted, duplicate values appear consecutively.
- One pointer keeps track of where the next valid element should be placed.
- Another pointer scans the array from left to right.
- The first duplicate is allowed, but any additional duplicates are skipped.
- A flag can be used to track whether a duplicate has already been accepted.
- Time Complexity: O(n)
- Space Complexity: O(1)

## 977 - Squares of a Sorted Array

- Brute force squares every element and then sorts the result.
- Squaring negative numbers can change their relative order.
- The original sorted array can be viewed as two sorted sections:
  negative values and non-negative values.
- After converting negatives to absolute values, the problem becomes
  similar to merging two sorted arrays.
- Two pointers can efficiently merge the two sections into the answer.
- Time Complexity: O(n)
- Space Complexity: O(n)

## 15 - 3Sum

- Brute force checks every possible triplet and takes O(n³).
- Sorting the array enables the use of the Two Pointers pattern.
- Fix one element and reduce the problem to a Two Sum search.
- Use left and right pointers to find pairs that complete the triplet.
- Skip duplicate values for the fixed element and the two pointers to avoid duplicate triplets.
- Sorting transforms an O(n³) problem into an O(n²) solution.
- Time Complexity: O(n²)
- Space Complexity: O(1) (excluding output storage)

## What I Learned

- Sorted arrays often allow duplicates to be processed in a single pass.
- Two pointers do not always start from opposite ends.
- One pointer can act as a write position while the other acts as a scanning pointer.
- This pattern appears in many in-place array modification problems.
- Two pointer problems can involve controlling how many duplicates are allowed.
- Sorted arrays make it easier to detect duplicate groups.
- A write pointer and a scan pointer are a common pattern for in-place array modification.
- Additional state variables can be combined with two pointers to enforce custom rules.
- Two pointers can be used for merging, not just for searching.
- A sorted array may contain hidden sorted subarrays that can be exploited.
- Transforming the problem can reveal a familiar pattern.
- Sometimes avoiding a sort operation leads to a linear-time solution.
- Many Three Sum problems can be reduced to a Two Sum problem after sorting.
- Two Pointers can be nested inside a loop to solve more complex problems.
- Handling duplicates is often as important as finding the correct values.
- Sorting can reveal patterns that are difficult to see in an unsorted array.
- A common interview technique is to fix one value and search for the remaining values.

