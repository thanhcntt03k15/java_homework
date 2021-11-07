package bai3;

import java.util.Scanner;

public class PHIEU {
    private String Maphieu;
    private HANG [] x;
    private int n;
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu : ");
        Maphieu=sc.nextLine();
        System.out.println("Nhap so luong hang : ");
        n=sc.nextInt();
        x=new HANG[n];
        for (int i=0; i<n ; i++)
        {
            x[i]=new HANG();
            System.out.println("Nhap thong tin hang :"+(i+1));
            x[i].nhap();
        }
    }
    public void xuat()
    {
        System.out.println("Ma phieu : "+Maphieu);
        for (int i=0; i<n ; i++)
        {
            System.out.println("Thong tin hang : "+(i+1));
            x[i].xuat();
        }
    }
}
