# 剑指 Offer 03. 数组中重复的数字
找出数组中重复的数字。

在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：

输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3 
 
限制：

2 <= n <= 100000
## 思路
1. 建立长度为n的标志数组记录每个数字已出现的次数
2. 优化空间使用，不断将nums[i]放到nums[nums[i]]位置；由此可以保证已遍历过的位置上的数都是在正确位置的，若出现需要向前交换的数则为重复数。
3. 原地哈希：使用下标为key，数值正负性为value记录每个数是否出现过。
            每遍历到一个数先检查其是否出现过。
   因为输入无负数，若数字为i，将nums[i]设为负数（0设为n），遍历到每个新的数j时检查nums[j]正负性，若为负数就输出数字j。
   0需要特殊处理，将-n作为-0标志。