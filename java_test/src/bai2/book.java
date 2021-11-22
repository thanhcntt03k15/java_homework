package bai2;

import java.util.Scanner;

public class book extends document{
    public static void main(String[] args) {
        private int numberOfPage;
        private String author;
        public void nhap()
        {
            Scanner sc = new Scanner(System.in);
            super.NHAP();
            System.out.println("Nhap so trang : ");
            numberOfPage = sc.nextInt();
            System.out.println("Nhap ten tac gia : ");
            author = sc.nextLine();
        }
        public void xuat()
        {
            super.XUAT();
            System.out.println("So trang : "+ numberOfPage);
            System.out.println("Ten tac gia : "+author);
        }
    }

}
