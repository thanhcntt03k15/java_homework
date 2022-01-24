package Model;

public class Worker {
    public int id;
    public String username ;
    public String pass;
    public String name;
    public int age;
    public String gender;
    public String address;
    public String phone ;
    public Worker()
    {

    }


    public Worker(int id, String username, String pass, String name, int age, String gender, String address, String phone) {
        this.id = id;
        this.username = username;
        this.pass= pass;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void output()
    {
        System.out.printf(this.id+"|"+this.username+"|"+this.pass+"|"+this.name+"|"+this.age+
                "|"+this.gender+"|"+ this.address +"|"+ this.phone+"\n");
    }
    public void Worker(int data0, String data1, String data2 , String data3, int data4 , String data5 , String data6 , String data7)
    {
        setId(data0);
        setUsername(data1);
        setPass(data2);
        setName(data3);
        setAge(data4);
        setGender(data5);
        setAddress(data6);
        setPhone(data7);
    }
}
