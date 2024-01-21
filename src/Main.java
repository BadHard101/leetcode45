public class Main {
    public static int jump(int[] nums) {
        int ans = 0;
        int cur = 0;
        int reachable = nums[cur] + cur;
        int max = nums[cur] + cur;

        while (cur < nums.length - 1) {
            for (int i = cur + 1; i <= reachable; i++) { // 1) от следующего (cur+1) до максимального шага (reachable)
                if (reachable >= nums.length - 1) { // 6) если достигаем последнего, делаем шаг и return
                    ans++;
                    return ans;
                }
                if (nums[i] + i > max) { // 2) ищем максимальный шаг (max - самый опережающий) шаг из возможных
                    max = nums[i] + i;
                    cur = i; // 3) делаем максимальный - текущим
                }
            }
            reachable = nums[cur] + cur; // 4) после нахождения максимального, запоминаем следующие доступные
            ans++; // 5) делаем шаг
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jump(new int[]{1, 2}));
        System.out.println(jump(new int[]{2, 1}));
    }
}