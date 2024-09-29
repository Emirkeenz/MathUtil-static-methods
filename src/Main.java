public class Main {
    public static void main(String[] args) {
        System.out.println("Is 11 prime? " + MathUtil.isPrime(11));
        System.out.println("GCD of 81 and 45: " + MathUtil.gcd(81, 45));
        System.out.println("LCM of 17 and 21: " + MathUtil.lcm(17, 21));
        System.out.println("9th Fibonacci number: " + MathUtil.fibonacci(9));
        System.out.println("Factorial of 8: " + MathUtil.factorial(8));

        MathUtil util = new MathUtil();
        System.out.println("Is 80 a perfect number? " + util.isPerfectNumber(80));
        System.out.println("Sum of digits of 12367: " + util.sumOfDigits(12367));
        System.out.println("Reversed number of 5000: " + util.reverseNumber(5000));
        System.out.println("Is 934 an Armstrong number? " + util.isArmstrongNumber(934));
        System.out.println("Next prime after 13: " + util.nextPrime(13));
    }
}