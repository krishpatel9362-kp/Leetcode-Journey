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

## Key Takeaways

167 - Two Sum II

- Brute force checks every pair and takes O(n²).
- Since the array is sorted, two pointers can be used.
- If the sum is too small, move the left pointer.
- If the sum is too large, move the right pointer.
- Time Complexity: O(n)
- Space Complexity: O(1)

1 - Segregate 0s and 1s

- Brute force can count the number of 0s and fill the array accordingly.
- Since only two distinct values exist, the array can be partitioned using two pointers.
- The left pointer searches for misplaced 1s.
- The right pointer marks where 1s should be placed.
- Swapping gradually moves all 0s to the left and all 1s to the right.
- Time Complexity: O(n)
- Space Complexity: O(1)

