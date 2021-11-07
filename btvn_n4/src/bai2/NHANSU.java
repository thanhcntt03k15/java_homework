package bai2;

import java.sql.DataTruncation;
import java.util.Scanner;

public class NHANSU {
    private String Manhansu,Hoten;
    private DATE NS;
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien : ");
        Manhansu=sc.nextLine();
        System.out.println("Nhap ten nhan vien : ");
        Hoten=sc.nextLine();
        NS= new DATE();
        NS.nhap();
    }
    public void xuat()
    {
        System.out.println("Ma nv : "+Manhansu);
        System.out.println("Ten nv : "+Hoten);
        NS.xuat();
    }
}
