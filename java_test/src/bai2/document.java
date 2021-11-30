package bai2;

import java.util.Scanner;

public class document {
    protected int id;
    protected String name;
    protected String publisher;
    protected int price;

    public document() {
    }

    public document(int id, String name, String publisher, int price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void INPUT()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book id : ");
        this.id = sc.nextInt();
        System.out.println("Enter book name : ");
        this.name = sc.nextLine();
        System.out.println("Enter publisher name : ");
        this.publisher = sc.nextLine();
        System.out.println("Enter book price : ");
        this.price = sc.nextInt();
    }
    public void EDIT()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book name : ");
        this.name = sc.nextLine();
        System.out.println("Enter publisher name : ");
        this.publisher = sc.nextLine();
        System.out.println("Enter book price : ");
        this.price = sc.nextInt();
    }
    public void OUTPUT()
    {
        System.out.printf(" %-15d | %-20s | %-20s | %-15d | ", this.id , this.name, this.publisher, this.price);
    }

}
