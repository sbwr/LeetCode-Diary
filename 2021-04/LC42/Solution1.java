package LC42;

class Solution1 {
    private int trapin1(int[] height, int i){
        int n,m,lmax = 0, rmax = 0;
        // search for right max
        for(int j = i; j < height.length; j++) {
            if(height[j] > rmax) { rmax = height[j]; }
        }
        // search for left max
        for(int j = i; j >= 0 ; j--) {
            if(height[j] > lmax) { lmax = height[j]; }
        }
        if(i == 0 || i == height.length - 1)return 0;
        else{
            n = lmax - height[i];
            m = rmax - height[i];
        }// water trap in 1 the minimum of left max and right max
        int min = n > m ? m : n;
        if(min < 0)return 0;
        else return min;
    }
    public int trap(int[] height) {
        int len = height.length;
        // int[] trap = new int[len];
        int trap = 0;
        for(int i = 1; i < len; i++){
            trap += trapin1(height, i);
        }
        return trap;
    }
    public static void main(String arg[]){
        int[] height = {2, 0, 2};
        Solution1 s = new Solution1();
        System.out.println(s.trap(height));
    }
}