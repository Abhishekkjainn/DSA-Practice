public class insertposition {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };

        System.out.println(insert(nums, 7));
    }

    public static int insert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] < target) {
                // ans = mid;
                low = mid + 1;
            }
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
