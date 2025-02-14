public class searchrotatedII {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 88, 0, 1, 2 };
        int target = 8;
        boolean sec = search(arr, target);
        System.out.println(sec);

        // for (int i = 0; i < sec.length; i++) {
        // System.out.println(sec[i]);
        // }
    }

    // Approach 2
    public static boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If found the target, return true
            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates (skip them)
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {
                // If target is in the sorted left half
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Otherwise, the right half is sorted
            else {
                // If target is in the sorted right half
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        // Target not found
        return false;
    }

    public static int[] searchrotatedIIi(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        System.out.println(found);
        return arr;
    }
}
