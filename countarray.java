public class countarray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 3 };
        int num = 4;
        count(arr, num);
    }

    public static void count(int[] arr, int k) {
        int count = 0;
        int low = 0;
        int high = arr.length - 1;
        int lowbound = 0;
        int highbound = -1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            // first occurence
            if (arr[mid] == k) {
                high = mid - 1;
                lowbound = mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            }
        }
        low = 0;
        high = arr.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == k) {
                low = mid + 1;
                highbound = mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            }
        }
        System.out.println(lowbound);
        System.out.println(highbound);
        count = highbound - lowbound + 1;
        System.out.println(count);
    }
}
