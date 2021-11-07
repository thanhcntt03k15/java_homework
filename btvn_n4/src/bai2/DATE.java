package bai2;
import java.util.Scanner;
public class DATE {
    private int D,M,Y;
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ngay : ");
        D=sc.nextInt();
        System.out.print("Nhap thang : ");
        M=sc.nextInt();
        System.out.print("Nhap nam : ");
        Y=sc.nextInt();
    }
    public void xuat()
    {
        System.out.print("Ngay : "+D+"/"+M+"/"+Y);
    }
}
