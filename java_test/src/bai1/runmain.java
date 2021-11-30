package bai1;

import java.util.Scanner;

public class runmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h;
        int s =0,cnt=0,ex=1;
        System.out.println("Nhap chuoi s : ");
        h= sc.nextLine();
        for (int i=0 ; i<h.length(); i++)
        {
            if (Character.isDigit(h.charAt(i))){
                cnt++;
                s+= h.charAt(i)-48;
            }
        }
        System.out.println("Chuỗi có : "+cnt+" chữ số");
        for (int i=0; i<h.length(); i++)
        {
            if (Character.getNumericValue(h.charAt(i))>0)
            {
                if (h.charAt(i)-48>0){
                    if (s% (h.charAt(i)-48)==0)
                    {
                        ex *= (h.charAt(i) - 48);
                    }
                }
            }
        }
        System.out.println("Tích : "+ex);


    }
}
