11. 盛最多水的容器
给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

说明：你不能倾斜容器。

 
示例 1：sample1.jpg
输入：[1,8,6,2,5,4,8,3,7]
输出：49 
解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。

示例 2：
输入：height = [1,1]
输出：1

示例 3：
输入：height = [4,3,2,1,4]
输出：16

示例 4：
输入：height = [1,2,1]
输出：2
 
提示：
n = height.length
2 <= n <= 3 * 104
0 <= height[i] <= 3 * 104

## 思路
1. 枚举出所有组合：时间复杂度O(n^2)，数据规模为10^4，理论上会超时。
2. 双指针：每次只需移动数值较小的一边指针。时间复杂度O(n)，空间复杂度O(1)
   容水量的计算公式为高度x宽度 height x width，其中高度为两侧中较小值 height=min(height[left], height[right])。移动数值较大的一边不会增大height，且会减小width，没有意义。