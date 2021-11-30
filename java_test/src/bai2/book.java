package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class book extends document{
    private int numberOfPage;
    private String author;

    public book() {
    }

    public book(int id, String name, String publisher, int price, int numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public void INPUT() {
            Scanner sc = new Scanner(System.in);
            super.INPUT();
            System.out.println("Enter number of page : ");
            numberOfPage = sc.nextInt();
            System.out.println("Enter author name : ");
            author = sc.nextLine();
        }

    @Override
    public void  OUTPUT()
        {
            super.OUTPUT();
            System.out.printf(" %-15d | %-20s ", this.numberOfPage , this.author);
        }
    @Override
    public void EDIT()
    {
        super.EDIT();
        Scanner sc = new Scanner(System.in);
        super.INPUT();
        System.out.println("Enter number of page : ");
        numberOfPage = sc.nextInt();
        System.out.println("Enter author name : ");
        author = sc.nextLine();
    }

}
