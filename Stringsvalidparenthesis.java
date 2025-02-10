public class Stringsvalidparenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(valid(s));
    }

    public static int valid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count = count + 1;
            } else if (s.charAt(i) == ')') {
                count = count - 1;
            } else {
                continue;
            }
        }
        return count;
    }
}
