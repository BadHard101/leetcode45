class Solution1 {
    public static int indexStep = -1;

    public static int jump(int[] nums) {
        if (nums[0] == 0 || nums.length == 1)
            return 0;
        if (indexStep == -1)
            indexStep = nums.length - 1;
        for (int i = 0; i < indexStep; i++) {
            if (nums[i] >= indexStep - i) {
                indexStep = i;
                return jump(nums) + 1;
            }
        }
        indexStep = -1;
        return 0;
    }
}