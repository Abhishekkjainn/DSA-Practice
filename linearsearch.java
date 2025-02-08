public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(searchInSorted(arr, 6));
    }

    static boolean searchInSorted(int arr[], int k) {
        // int ind = 0;
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                res = true;
                break;
            }
        }
        return res;
    }
}
