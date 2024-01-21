public class Main {
    public static int jump(int[] nums) {
        int ans = 0;
        int pos = 0;
        int reachable = nums[pos] + pos;
        while (pos < nums.length - 1) {
            int max = pos + nums[pos];
            for (int i = pos + 1; i <= reachable; i++) {
                if (reachable >= nums.length - 1) {
                    ans++;
                    return ans;
                }
                if (nums[i] + i > max) {
                    max = nums[i] + i;
                    pos = i;
                }
            }
            reachable = nums[pos] + pos;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jump(new int[]{1, 2}));
        System.out.println(jump(new int[]{2, 1}));
    }
}