package bai3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HANG {
    private String Mahang,Tenhang;
    private int Dongia;
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma hang : ");
        Mahang=sc.nextLine();
        System.out.println("Nhap ten hang : ");
        Tenhang=sc.nextLine();
        System.out.println("Nhap don gia  : ");
        Dongia=sc.nextInt();
    }
    public void xuat()
    {
        System.out.println("Ma hang : "+Mahang);
        System.out.println("Ten hang : "+Tenhang);
        System.out.println("Don gia : "+Dongia);
    }
}
