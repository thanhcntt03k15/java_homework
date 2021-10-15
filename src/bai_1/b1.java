package bai_1;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("Nhập chiều dài : ");
        n = sc.nextInt();
        System.out.print("Nhập chiều rộng : ");
        m = sc.nextInt();
        for (int i=0; i<m ; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == m - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.print("\n");
        }
    }
}
