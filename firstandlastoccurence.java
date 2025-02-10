public class firstandlastoccurence {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        firstlast(nums, 5);
    }

    public static int[] firstlast(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int[] ans = { -1, -1 }; // Default value if target is not found

        // Find the first occurrence (lower bound)
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans[0] = mid; // Store the index
                high = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Reset low and high for finding the last occurrence (upper bound)
        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans[1] = mid; // Store the index
                low = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans[0] + " " + ans[1]); // Print the correct indices
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
