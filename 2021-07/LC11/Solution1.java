package LC11;

class Solution1 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, ans = 0;
        while (l < r) {
            ans = height[l] < height[r] ? 
                Math.max(ans, (r - l) * height[l++]) : 
                Math.max(ans, (r - l) * height[r--]);
        }
        return ans;
    }
}
