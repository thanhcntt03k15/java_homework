package bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class runmain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<book> books = new ArrayList<>();

    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println("1) Add book");
            System.out.println("2) Edit book by id");
            System.out.println("3) Delete book by id");
            System.out.println("4) Sort books by name (ascending)");
            System.out.println("5) Sort books by price (descending) ");
            System.out.println("6) Show all books");
            System.out.println("7) Exit");
            System.out.println("Enter your choose : ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    addBook();
                    break;
                case 2:
                    editBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    sortByPrice();
                    break;
                case 6:
                    output();
                    break;
                case 7:
                    System.out.println("Escaped!!!");
                    break;
                default:
                    System.out.println("Don't have this choose!");
            }
        }
        while
        (i!=7);
    }
    public static void addBook()
    {
        book b = new book();
        b.INPUT();
        if (isApear(b.getId()))
        {
            System.out.println("Duplicate id !");
            return;
        }
        books.add(b);
    }

    public static void editBook() {
        if (books.isEmpty())
        {
            System.out.println("Empty list !");
            return;
        }
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        if (isApear(id)==false)
        {
            System.out.println("Don't have this book!");
        }
        for (int i=0; i< books.size(); i++)
        {
            if (books.get(i).getId()==id)
                books.get(i).EDIT();
        }

    }

    public static void deleteBook() {
        if (books.isEmpty())
        {
            System.out.println("Empty list !");
            return;
        }
        System.out.println("Enter the book id to delete : ");
        int id = sc.nextInt();
        for (int i=0 ; i<books.size(); i++)
        {
            if (books.get(i).getId()==id)
                books.remove(i);
        }
    }

    public static void sortByName() {
        if (books.isEmpty())
        {
            System.out.println("Empty list !");
            return;
        }
        System.out.println("Sorting . . .");
        for (int i=0 ; i<books.size()-1; i++)
            for (int j=books.size()-1; j>i ; j--)
            {
                String s1 = books.get(j-1).getName();
                String s2 = books.get(j).getName();
                if (s1.compareToIgnoreCase(s2)>0)
                    Collections.swap(books , j-1, j);
            }
        System.out.println("Sorted!");
    }

    public static void sortByPrice() {
        if (books.isEmpty())
        {
            System.out.println("Empty list !");
            return;
        }
        System.out.println("Sorting . . .");
        for (int i=0 ; i<books.size()-1; i++)
            for (int j=books.size()-1; j>i ; j--)
            {
                if (books.get(j-1).getPrice()<books.get(j).getPrice())
                    Collections.swap(books,j-1,j);
            }
    }

    public static void output() {
        if (books.isEmpty())
        {
            System.out.println("Empty list !");
            return;
        }
        System.out.printf(" %-15s | %-20s | %-20s | %-15s | %-15s | %-20s \n", "id" , "name", "publisher", "price", "number Of Page" , "author");
        for (book b: books)
            b.OUTPUT();
    }

    public static boolean isApear(int id) {
        for (int i=0 ; i<books.size(); i++)
        {
            if (books.get(i).getId()==id)
            {
                return true;
            }
        }
        return false;
    }
}
