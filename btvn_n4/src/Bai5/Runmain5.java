package Bai5;

import java.util.Scanner;

public class Runmain5 {
    public static boolean isPrime(int n) {
        if( n == (int)n) {
            for(int i = 2; i*i < n; i++) {
                if(n % i == 0)
                    return false;
            }
            return n > 1;
        } else
            return false;
    }
    public static boolean isPrime(long n) {
        if( n == (int)n) {
            for(int i = 2; i*i < n; i++) {
                if(n % i == 0)
                    return false;
            }
            return n > 1;
        } else
            return false;
    }
    public static boolean isPrime(float n) {
        if( n == (int)n) {
            for(int i = 2; i*i < n; i++) {
                if(n % i == 0)
                    return false;
            }
            return n > 1;
        } else
            return false;
    }
    public static boolean isPrime(double n) {
        if( n == (int)n) {
            for(int i = 2; i*i < n; i++) {
                if(n % i == 0)
                    return false;
            }
            return n > 1;
        } else
            return false;
    }
    public static void main(String[] args) {
        System.out.println("------int------");
        System.out.println(isPrime(7));
        System.out.println(isPrime(21));
        System.out.println("------long------");
        System.out.println(isPrime(124l));
        System.out.println(isPrime(29l));
        System.out.println("------float----");
        System.out.println(isPrime(3.7f));
        System.out.println(isPrime(9.2f));
        System.out.println("-----double------");
        System.out.println(isPrime(12.5));
        System.out.println(isPrime(25.625));
    }
}
