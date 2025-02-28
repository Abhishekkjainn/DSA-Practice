public class binaryconversion {
    public static String converttobin(int n) {
        String res = "";
        int target = n;
        if (target == 0 || target == 1) {
            return String.valueOf(target);
        }
        while (target >= 1) {
            if (target % 2 == 0) {
                res = "0" + res;
            } else {
                res = "1" + res;
            }
            target = target / 2;
        }
        return res;
    }

    public static double converttodecimal(String bin) {
        double sum = 0;
        String target = bin;
        int count = 0;
        if (bin == "0") {
            return 0;
        }
        for (int i = target.length() - 1; i >= 0; i--) {
            sum = sum + Math.pow(2 * (Character.getNumericValue(target.charAt(i))), count);
            count++;
        }
        return (int) (sum);
    }

    public static int converttodecimal2(String bin) {
        int sum = 0;
        int p = 1;
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') {
                sum = sum + p;
            }
            p = p * 2;
        }
        return sum;
    }

    public static String onescomplement(int n) {
        int target = n;
        String res = "";
        while (target >= 1) {
            if (target % 2 == 0) {
                res = "0" + res;
            } else {
                res = "1" + res;
            }
            target = target / 2;
        }
        return res;
    }

    public static int andop(Character a, Character b) {
        if (a == '1' && b == '1') {
            return 1;
        } else {
            return 0;
        }
    }

    public static int orop(Character a, Character b) {
        if (a == '1' || b == '1') {
            return 1;
        } else {
            return 0;
        }
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " - a");
        System.out.println(b + " - b");
    }

    public static boolean setornot(int n, int t) {
        return (n & (1 << t)) != 0;
    }

    public static void main(String[] args) {
        // System.out.println(converttobin(13));
        // System.out.println(converttodecimal2("1101001111"));
        // System.out.println(onescomplement(13));
        // System.out.println(andop('1', '0'));
        // System.out.println(orop('1', '0'));
        System.out.println(setornot(4, 0));
        // swap(5, 8);
    }
}