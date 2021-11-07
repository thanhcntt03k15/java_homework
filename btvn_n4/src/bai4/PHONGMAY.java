package bai4;

import java.util.Scanner;

public class PHONGMAY {
    private String Maphong,Tenphong;
    private int Dientich,n;
    private QUANLY x=new QUANLY();
    private MAY [] y;
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma phong : ");
        Maphong=sc.nextLine();
        System.out.println("Nhap ten phong : ");
        Tenphong=sc.nextLine();
        System.out.println("Nhap dien tich : ");
        Dientich=sc.nextInt();

        x.nhap();
        System.out.println("Nhap so luong may : ");
        n=sc.nextInt();
        y=new MAY[n];
        for (int i=0; i<n ; i++)
        {
            y[i]=new MAY();
            System.out.println("Nhap may so : "+(i+1));
            y[i].nhap();
        }
    }
    public void xuat()
    {
        System.out.println("Ma phong : "+Maphong);
        System.out.println("Ten phong : "+Tenphong);
        System.out.println("Dien tich : "+Dientich);
        x.xuat();
        for (int i=0; i<n ; i++)
        {
            System.out.println("May so : "+(i+1));
            y[i].xuat();
        }
    }

}
