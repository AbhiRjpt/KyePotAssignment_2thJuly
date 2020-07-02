package com.company;

public class PalindromicNumberThreeDigit {
    public static void main(String[] args) {
        System.out.println("result is: "+getLargestPalindromeOfThreeNumber());
    }

    private static long getLargestPalindromeOfThreeNumber() {
        long ans = 0;
        long max_prod = 0;
        for (long i = 999; i >= 100; i --) {
            for (long j = 999; j >= 100; j --) {
                long prod = i * j;
                if (prod < max_prod) {
                    break;
                }
                long reverse = 0;
                long num =prod;
                while (num != 0)
                {
                    reverse = reverse * 10 + num % 10;
                    num /= 10;
                }
                if (prod == reverse && prod > max_prod)
                    max_prod = prod;
            }
        }
        return max_prod;
    }
}
