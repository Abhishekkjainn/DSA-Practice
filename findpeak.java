public class findpeak {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
        System.out.println(findpeakbinaryII(nums));
    }

    public static int findpeakbinary(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // check for left side
            int mid2 = (low + mid) / 2;
            if (mid2 > 1) {
                if (nums[mid2] > nums[mid2 - 1] && nums[mid2] > nums[mid2 + 1]) {
                    return mid2;
                }
            }
            int mid3 = (high + mid) / 2;
            if (mid3 < nums.length - 2) {
                if (nums[mid3] > nums[mid3 - 1] && nums[mid3] > nums[mid3 + 1]) {
                    return mid3;
                }
            }
        }
        return 0;
    }

    public static int findpeakbinaryII(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) { // Use `low < high` instead of `low <= high`
            int mid = low + (high - low) / 2;

            // Handle boundaries safely
            if (mid > 0 && nums[mid] > nums[mid - 1] && mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid]; // Peak found
            } else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                low = mid + 1; // Move right
            } else {
                high = mid; // Move left
            }
        }

        return low;
    }

}
