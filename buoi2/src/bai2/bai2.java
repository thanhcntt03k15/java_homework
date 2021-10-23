package bai2;

import java.util.Scanner;
import java.util.Arrays;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        while (true) {
            System.out.print("nhap lua chon: ");
            int k = sc.nextInt();
            switch (k) {
                case 1: {
                    inPut(a, n);
                    break;
                }
                case 2: {
                    outPut(a, n);
                    break;
                }
                case 3: {
                    a = Arrays.copyOf(a, (n + 1));
                    n++;
                    in_Sert(a, n);
                    break;
                }
                case 4: {
                    Delete(a, n);
                    n--;
                    break;
                }
                case 5: {
                    Reverse(a, n);
                    break;
                }
                case 6: {
                    Outa1(a, n);
                    break;
                }
                case 7: {
                    OutNt(a,n);
                    break;
                }

                case 8: {
                    System.out.println("ket thuc");
                    return;
                }
            }
            System.out.println();
        }
    }

    public static void inPut ( int[] a, int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "]= ");
            a[i] = sc.nextInt();
        }
    }

    public static void outPut ( int[] a, int n){
        for (int i = 0; i < n; i++)
            System.out.print((a[i]) + " ");


    }

    public static void in_Sert ( int[] a, int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tri muon them: ");
        int m = sc.nextInt();
        System.out.print("nhap vi tri muon them: ");
        int id = sc.nextInt();


        for (int i = n - 1; i >= id; i--) a[i] = a[i - 1];
        a[id - 1] = m;
    }

    public static void Delete ( int[] a, int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vi tri muon xoa: ");
        int id = sc.nextInt();
        for (int i = id - 1; i < n-1; i++)
            a[i] = a[i + 1];
    }
    public static void Reverse ( int[] a, int n)
    {
        for (int i = n - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
    }
    public static void Outa1 ( int[] a, int n)
    {
        System.out.print("a[1] va cac so trong mang chia het cho a[1]");
        System.out.println(a[1]);
        for (int i = 0; i < n; i++) {
            if (i == 1) continue;
            if (a[i] % a[1] == 0) System.out.print(a[i] + " ");
        }
    }
    public static boolean check ( int n)
    {
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }
    public static void OutNt ( int[] a, int n)
    {
        System.out.println("cac so nguyen to trong mang");
        for (int i = 0; i < n; i++)
            if (check(a[i]) == true) System.out.print(a[i] + " ");
    }
}
