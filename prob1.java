class prob1 {
    public static void main(String[] args) {
        lcmAndGcd(370);
    }

    public static void lcmAndGcd(int a) {
        int length = 0;
        int check = a;
        while (check > 0) {
            length++;
            check = check / 10;
        }
        double sum = 0;
        int check2 = a;
        while (check2 > 0) {
            sum = sum + Math.pow((check2 % 10), length);
            check2 = check2 / 10;
        }

        if (sum == a) {
            System.out.println("Yes its a armstrong number - " + a);
        } else {
            System.out.println("No its not a armstrong number - " + a);
        }

        System.out.println(length);
    }
}