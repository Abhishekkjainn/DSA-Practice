public class findsquareroot {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findsquare(num));
        System.out.println(findsquareII(num));
    }

    public static int findsquare(int num) {
        int ans = 1;
        if (num == 1 || num == 2) {
            return ans;
        }
        for (int i = 0; i <= num / 2; i++) {
            if (i * i <= num && i >= ans) {
                ans = i;
            }
        }
        return ans;
    }

    public static int findsquareII(int num) {
        int low = 1;
        int high = num;
        int ans = 0;
        if (num == 1 || num == 2) {
            return 1;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == num) {
                ans = mid;
                break;
            } else if (mid * mid < num) {
                ans = mid;
                low = mid + 1;
            } else if (mid * mid > num) {
                high = mid - 1;
            }
        }
        return ans;
    }
}
