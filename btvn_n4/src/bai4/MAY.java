package bai4;

import java.util.Scanner;

public class MAY {
    private String Mamay,Kieumay,Tinhtrang;
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma may : ");
        Mamay=sc.nextLine();
        System.out.println("Nhap kieu may : ");
        Kieumay=sc.nextLine();
        System.out.println("Nhap tinh trang may : ");
        Tinhtrang=sc.nextLine();
    }
    public void xuat()
    {
        System.out.println("Ma may : "+Mamay);
        System.out.println("Kieu may : "+Kieumay);
        System.out.println("Tinh trang : "+Tinhtrang);
    }
}
