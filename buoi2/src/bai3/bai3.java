package bai3;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String s=sc.nextLine();
        boolean check=false;
        int sum=0,cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                check =true;
                sum+=s.charAt(i)-'0';
                cnt++;
            }
        }
        if(check==true) {
            System.out.println("true");
            System.out.println((float) sum / (float) cnt);
        }
        else System.out.println("flase");

    }
}
