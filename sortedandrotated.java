public class sortedandrotated {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(Sortedandrotated(arr));
    }

    public static boolean Sortedandrotated(int[] arr) {
        int dipcount = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                dipcount++;
            }
        }
        if (dipcount > 1) {
            return false;
        }
        if (dipcount == 1 && (arr[0] < arr[arr.length - 1])) {

            return false;

        } else {
            return true;
        }
    }
}
