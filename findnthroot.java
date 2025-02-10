import java.util.*;

public class findnthroot {
    public static void main(String[] args) {
        int n = 3;
        int m = 9;

        System.out.println(findroot(n, m));
    }

    public static int findroot(int n, int m) {
        int low = 1;
        int high = m;
        int ans = -1;
        if (n == 1) {
            return m;
        }
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            int sol = 1;
            for (int i = 0; i < n; i++) {
                sol = sol * mid;
            }
            if (sol == m) {
                ans = mid;
                return ans;
            } else if (sol < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
