public class longestsubstringwithoutrepeatingcharacter {
    public static void main(String[] args) {
        String str = "abcabcbb";
        sol(str);
    }

    public static void sol(String str) {
        int[] arr = new int[256];
        int maxlen = 0;
        for (int i = 0; i < 256; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                char st = str.charAt(j);
                int val = st;
                if (arr[val - 1] == 1) {
                    maxlen = Math.max(maxlen, j - i + 1);
                    break;
                } else {
                    arr[val - 1] = 1;
                }

            }
        }

        System.out.println(maxlen);
    }
}
