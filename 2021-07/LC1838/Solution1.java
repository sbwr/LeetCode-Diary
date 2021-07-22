package LC1838;

import java.util.Arrays;

class Solution1 {
    static public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        long total = 0;
        int l = 0, res = 1;
        for (int r = 1; r < n; ++r) {
            total += (long) (nums[r] - nums[r - 1]) * (r - l);
            while (total > k) {
                total -= nums[r] - nums[l];
                ++l;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,4,8,8,13};
        System.out.println(maxFrequency(nums, 5));
    }
}
