package com.company;

import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num: ");
        long num = input.nextLong();
        System.out.println("largest prime factor is: " + largestPrimeFactor(num));
    }
    public static long largestPrimeFactor(long n) {
        if (n <= 1) {
            return 0;
        } else {
            long div = 2;
            while (div < n) {
                if (n % div != 0) {
                    div++;
                } else {
                    n = n / div;
                    div = 2;
                }
            }
            return n;
        }
    }
}
