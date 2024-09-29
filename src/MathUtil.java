public class MathUtil {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int reverseNumber(int n) {
        int reversedNum = 0;
        while (n != 0) {
            reversedNum = reversedNum * 10 + n % 10;
            n /= 10;
        }
        return reversedNum;
    }

    public boolean isArmstrongNumber(int n) {
        int sum = 0;
        int temp = n;
        int digits = String.valueOf(n).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public int nextPrime(int n) {
        int next = n + 1;
        while(!isPrime(next)) {
            next++;
        }
        return next;
    }
}
