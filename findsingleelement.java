public class findsingleelement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 8 };
        int target = 2;
        System.out.println(findsingle(arr));
    }

    public static int findsingle(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + ((high - low) / 2);
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }
}
