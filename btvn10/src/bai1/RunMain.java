package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
    static Scanner sc= new Scanner(System.in);
    static ArrayList<Person> personArrayList = new ArrayList<>();
    public static void main(String[] args) {
        try
        {
            int n;
            System.out.println("Nhap so nguoi : ");
            n=sc.nextInt();

            sc.nextLine();
            for (int i=0 ; i<n ; i++)
            {
                Person person = new Person();
                System.out.println("Nhap id : ");
                person.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhap ten : ");
                person.setName(sc.nextLine());
                System.out.println("Nhap dia chi : ");
                person.setAddress(sc.nextLine());
                personArrayList.add(person);
            }
        }
        catch (Exception ex)
        {
            System.out.println("Loi dau vao ");// nếu đầu vào
        }

        Collections.sort(personArrayList, new Comparator<Person>() {

            public int compare(Person o1, Person o2) {
                if (o1.getName().compareTo(o2.getName())==0)
                    return o2.getAddress().compareTo(o1.getAddress());
                return o1.getName().compareTo(o2.getName());
            }
        });
        personArrayList.forEach(person -> System.out.println(person.toString()));
        Collections.sort(personArrayList);
        for (Person person : personArrayList) {
            System.out.println(person.toString());
        }
    }
}
