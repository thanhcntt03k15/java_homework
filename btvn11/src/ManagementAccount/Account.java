package ManagementAccount;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Account {
    private String regUserName = "^[\\w]{6,}$";
    private String regPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])[A-Za-z0-9@#$%^&+=]{8,}$";
    private String regPhone = "^[0-9\\-\\+]{9,15}$";
    private String regEmail = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}";
    private long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String createAt;

    public Account() {
    }

    public Account(long id, String fullName, String username, String password,
                   String email, String phone, String createAt) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    public void INPUT()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your full name : ");
        fullName = sc.nextLine();
        boolean k= true;
        do {
            System.out.println("Enter your username : ");
            username = sc.nextLine();
            Pattern pattern = Pattern.compile(regUserName);
            if (pattern.matcher(username).find() == false) {
                k=false;
                System.out.println("Username Wrong!");
            }
            else
            {
                k=true;
            }
        }
        while (k==false);
        do {
            System.out.println("Enter your password : ");
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
        do {
            System.out.println("Enter your email : ");
            email = sc.nextLine();
            Pattern pattern = Pattern.compile(regEmail);
            if (pattern.matcher(email).find() == false) {
                k=false;
                System.out.println("email Wrong!");
            }
            else
            {
                k=true;
            }
        }
        while (k==false);
        do {
            System.out.println("Enter your phone : ");
            phone = sc.nextLine();
            Pattern pattern = Pattern.compile(regPhone);
            if (pattern.matcher(phone).find() == false) {
                k=false;
                System.out.println("phone Wrong!");
            }
            else
            {
                k=true;
            }
        }
        while (k==false);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        createAt = formatter.format(date);
        System.out.println("Time create user : "+ createAt);
    }
}
