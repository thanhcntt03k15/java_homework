package ManagementAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RunMain extends Account {
    static String regUserName = "^[\\w]{6,}$";
    static String regPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])[A-Za-z0-9@#$%^&+=]{8,}$";
    static String regPhone = "^[0-9\\-\\+]{9,15}$";
    static String regEmail = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}";

    static Scanner sc = new Scanner(System.in);
    static List<Account> accounts = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int i;
        do {
            System.out.println("1. Create new account.\n" +
                    "2. Login to an existing account.\n" +
                    "3. Sort accounts by username.\n" +
                    "4. Exit.\n");
            i=sc.nextByte();
            sc.nextLine();
            switch (i)
            {
                case 1:
                {
                    addAccount();
                    break;
                }
                case 2:
                {
                    loginAccount();
                    break;
                }
                case 3:
                {
                    sortAcount();
                    break;
                }
                case 4:
                {
                    System.out.println("Escapse !!!");
                    break;
                }

            }
        }while(i!=4);
    }
    static void addAccount() throws IOException {
        Account a = new Account();
        a.INPUT();
        FileWriter fileWriter= new FileWriter("ACC.DAT",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println(a.getId()+" | "+a.getFullName()+" | "+a.getUsername()+" | "+a.getPassword()+" | "
                            +a.getEmail() + " | "+ a.getPhone() + " | "+a.getCreateAt());
        accounts.add(a);
    }
    static void loginAccount() throws IOException {
        System.out.println("Enter user name : ");
        String t = sc.nextLine();
        for (Account u : accounts)
        {
            if (u.getUsername().compareToIgnoreCase(t)==0)
            {
                boolean k=true;
                do {
                    System.out.println("Enter password : ");
                    String s = sc.nextLine();
                    if (u.getPassword().compareToIgnoreCase(s)==1)
                    {
                        System.out.println("Wrong password !");
                    }
                    else
                    {
                        dologinAcount(u);
                    }
                }
                while(k==false);
            }
        }
    }
    static void dologinAcount(Account a) throws IOException {
        int i;
            System.out.println("1. Show info.\n" +
                    "2. Change password.\n");
            System.out.println("Enter your choose : ");
            i=sc.nextByte();
            switch (i)
            {
                case 1 :
                {
                    showInfor(a);
                    break;
                }
                case 2 :
                {
                    changePassword(a);
                    break;
                }
            }
    }
    static void showInfor(Account a)
    {
        System.out.println(a.getId()+" | "+a.getFullName()+" | "+a.getUsername()+" | "
                +a.getEmail() + " | "+ a.getPhone() + " | "+a.getCreateAt());
    }
    static void changePassword(Account a) throws IOException {


            boolean k=true;
            String password;
            do {
                sc.nextLine();
                System.out.println("Enter your new password : ");
                password = sc.nextLine();
                Pattern pattern = Pattern.compile(regPassword);
                if (pattern.matcher(password).find() == false) {
                    k=false;
                    System.out.println("Password Wrong!");
                }
                else {
                    k = true;
                }

            }
            while (k==false);
            do {
                System.out.println("Enter re-password : ");
                String repassword = sc.nextLine();
                if (repassword.compareToIgnoreCase(password)==1)
                {
                    System.out.println("Wrong re-password !");
                    k=false;
                }
            }
            while (k==false);
            a.setPassword(password);
            FileWriter fileWriter= null;

                fileWriter = new FileWriter("Acount.DAT",true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(a.getId()+" | "+a.getFullName()+" | "+a.getUsername()+" | "+a.getPassword()+" | "
                    +a.getEmail() + " | "+ a.getPhone() + " | "+a.getCreateAt());

                fileWriter.close();


                bufferedWriter.close();

            printWriter.close();

    }
    static void sortAcount()
    {
        for (int i=0 ; i<accounts.size(); i++)
            for (int j=i+1; j<accounts.size(); j++)
            {
                if (accounts.get(i).getUsername().compareToIgnoreCase(accounts.get(i).getUsername())>0)
                    Collections.swap(accounts,j,i);
            }
        for (Account a : accounts)
        {
            showInfor(a);
        }
    }
}
