public class firstandlastoccurence {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        bound(nums, 8);
    }

    public static int[] firstlast(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lowbound = -1;
        int highbound = -1;
        int[] ans = new int[2];
        // Find the lower bound;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] <= target) {
                lowbound = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] > target) {
                highbound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        ans[0] = lowbound;
        ans[1] = highbound;
        System.out.println((lowbound) + " " + (highbound - 1));
        return ans;
    }

    public static int[] bound(int[] nums, int target) {
        int start = -1;
        int end = -1;
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (start == -1) {
                if (nums[i] == target) {
                    start = i;
                }
            }

            if (start != -1 && nums[i] == target) {
                end = i;
            }
        }
        ans[0] = start;
        ans[1] = end;

        System.out.println(ans[0] + " - " + ans[1]);

        return ans;
    }
}
