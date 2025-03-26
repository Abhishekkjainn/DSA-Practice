public class slidingwindow {
    public static void main(String[] args) {
        int[] nums = { 1, 79, 80, 1, 1, 1, 200, 1 };
        getmaxpoints(nums, 3);
    }

    public static void getmaxpoints(int[] nums, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            lsum = lsum + nums[i];
        }
        maxsum = lsum;
        int rind = nums.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - nums[i];
            rsum = rsum + nums[rind--];
            if (maxsum < (lsum + rsum)) {
                maxsum = lsum + rsum;
            }
        }
        System.out.println(maxsum);
    }

}
