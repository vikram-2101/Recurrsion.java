public class SumOfDigit {
    public static void main(String[] args) {
        int n = 2345;
        int ans = Sum(n);
        System.out.println(ans);
    }

    static int Sum(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + Sum(n / 10);
    }
}
