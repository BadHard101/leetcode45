public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1};
        //int[] nums = {2,3,0,1,4};
        int res = 0;
        int lastStep = -1;
        int position = nums.length - 1;

        while (position != 0) {
            //System.out.println("NEW");
            for (int i = position - 1; i >= 0; i--) {
                if (nums[i] + i >= position) {
                    lastStep = i;
                    //System.out.println("LAST " + nums[i]);
                }
            }
            res++;
            position = lastStep;
            //System.out.println("POS " + position);
        }
        System.out.println(res);
    }
}