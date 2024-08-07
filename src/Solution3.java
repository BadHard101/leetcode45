class Solution3 {
    public int jump(int[] nums) {
        int ans = 0;
        int farthest = 0;
        int end = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length-1) {
                return ++ans;
            }
            if (i == end) {
                ans++;
                end = farthest;
            }
        }
        return ans;
    }
}