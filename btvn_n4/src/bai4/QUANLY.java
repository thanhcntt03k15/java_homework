package bai4;

import java.util.Scanner;

public class QUANLY {
    private String Maql,Hoten;
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma quan ly : ");
        Maql=sc.nextLine();
        System.out.println("Nhap ho ten quan ly : ");
        Hoten=sc.nextLine();
    }
    public void xuat()
    {
        System.out.println("Ma quan ly : "+Maql);
        System.out.println("Ho ten : "+Hoten);
    }
}
