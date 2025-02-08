
import java.util.ArrayList;
import java.util.List;
// import java.util.ArrayList;

public class factorialless {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(20));
    }

    public static List<Integer> factorial(int n) {

        List<Integer> factlist = new ArrayList<>();
        int fact = 1;
        if (n == 1) {
            factlist.add(1);
        } else {
            for (int i = 1; i <= (n / 2); i++) {
                fact = fact * i;
                if (fact <= n) {
                    factlist.add(fact);
                }
            }
        }

        for (int i = 0; i < factlist.size(); i++) {
            System.out.println(factlist.get(i));
        }

        return factlist;
    }

    public static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> factlist = new ArrayList<>();
        long fact = 1L;
        if (n == 1) {
            factlist.add(n);
        } else {
            for (int i = 1; i <= (n / 2); i++) {
                fact = fact * i;
                if (fact <= n) {
                    factlist.add(fact);
                }
            }
        }

        for (int i = 0; i < factlist.size(); i++) {
            System.out.println(factlist.get(i));
        }

        return factlist;
    }

}
