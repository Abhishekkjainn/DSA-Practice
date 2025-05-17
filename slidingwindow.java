public class slidingwindow {
    public static void main(String[] args) {
        int[] nums = { 6, 2, 3, 4, 7, 2, 1, 7, 1 };
        getmaxpoints(nums, 4);
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
        int val = 'a';
        System.out.println(maxsum);
        System.out.println(val);
    }

}
