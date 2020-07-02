package com.company;

public class SmallestPositiveNumber {
    public static void main(String[] args) {
        long lcm=1;
        for(long i=2;i<=20;i++)
        {
            lcm *= i/gcd(lcm,i);
        }
        System.out.println("SmallestPositive number is: "+lcm);
    }

    static long gcd(long a, long b) {
        while(b > 0) {
            a %= b;
            if (a == 0){
                return b;
            }
            b %= a;
        }
        return a;
    }
}
