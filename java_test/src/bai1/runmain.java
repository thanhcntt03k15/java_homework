package bai1;

import java.util.Scanner;

public class runmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h;
        int s =1;
        System.out.println("Nhap chuoi s : ");
        h= sc.nextLine();
        for (int i=0 ; i<h.length(); i++)
        {
            if (h.charAt(i)>=49 && h.charAt(i)<=57) {
                //System.out.println(h.charAt(i));
                if (h.charAt(i) - 49 == 4)
                    s *= 2;
                if (h.charAt(i) - 49 == 6)
                    s *= 3;
                if (h.charAt(i) - 49 == 8)
                    s *= 4;
                if (h.charAt(i) - 49 == 9)
                    s *= 3;
            }
        }
        System.out.println("Chiều dai chuỗi : "+h.length());
        System.out.println("Tích ước chữ số : "+s);


    }
}
