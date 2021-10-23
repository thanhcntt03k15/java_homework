package bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String s=sc.nextLine();
        s=s.trim();
        s=s.replaceAll("\\s{2,}"," ");
        s=s.replaceAll("[0-9]","");
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++)
            if(str[i]==' ') str[i+1]=Character.toUpperCase(str[i+1]);
        str[0]=Character.toUpperCase(str[0]);
        s=String.valueOf(str);
        System.out.println(s);
    }
}
