package Bai1;
import java.util.Scanner;
public class SACH {
    private String maSach,tenSach,nhaXuatBan;
    private int soTrang,giaTien;
    public void Nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap Ma sach: ");
        maSach=sc.nextLine();
        System.out.print("nhap Ten sach: ");
        tenSach=sc.nextLine();
        System.out.print("nhap nha xuat ban: ");
        nhaXuatBan=sc.nextLine();
        System.out.print("nhap So trang: ");
        soTrang=sc.nextInt();
        System.out.print("nhap gia tien: ");
        giaTien=sc.nextInt();
    }
    public void Xuat() {
        System.out.println("Ma sach " + (maSach));
        System.out.println("Ten: " + (tenSach));
        System.out.println("Nha Xuat Ban: " + nhaXuatBan);
        System.out.println("So Trang: " + soTrang);
        System.out.println("Gia Tien: " + giaTien);
    }
}
