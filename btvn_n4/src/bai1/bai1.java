package Bai1;
import  java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap so luong sach: ");
        int n=sc.nextInt();
        Bai1.SACH[] a=new Bai1.SACH[n];
        for(int i=0;i<n;i++) {
            a[i] = new Bai1.SACH();
            System.out.println("Nhap thong tin sach thu " + (i + 1));
            a[i].Nhap();
        }
        for(int i=0;i<n;i++) {
            a[i].Xuat();
            System.out.println("----------------------------");
        }

    }
}