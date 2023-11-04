import java.util.*;

public class NoOfZeroes {
    public static void main(String[] args) {

        System.out.println(countZeroes(50607));
    }

    static int countZeroes(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int count) {
        if (n == 0)
            return count;
        int rem = n % 10;
        if (rem == 0)
            return helper(n / 10, count + 1);
        return helper(n / 10, count);
    }
}
