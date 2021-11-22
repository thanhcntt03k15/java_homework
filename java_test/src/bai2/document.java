package bai2;

import java.util.Scanner;

public class document {
    protected String name,publisher;
    protected int price;
    public void NHAP()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sach : ");
        name = sc.nextLine();
        System.out.println("Nhap ten nxb : ");
        publisher = sc.nextLine();
        System.out.println("Nhap gia sach : ");
        price = sc.nextInt();
    }
    public void XUAT()
    {
        System.out.println("Ten sach : " + name);
        System.out.println("Ten nxb : "+ publisher);
        System.out.println("Gia sach : "+ price);
    }
}
