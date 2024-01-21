class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int end = 0;
        int reachable = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            reachable = Math.max(reachable, i + nums[i]);

            /*if (reachable >= nums.length - 1) {
                ans++;
                return ans;
            }*/

            if (i == end) {
                ans++;
                end = reachable;
            }
        }

        return ans;
    }
}