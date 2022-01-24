package Model;

public class AccountFarm {
    private int idAccount;
    private String userName;
    private String passWord;
    private String email;
    private String creatAt;
    private String position;
    private String phone;

    public AccountFarm() {
    }

    public AccountFarm(int idAccount, String userName, String passWord, String email, String creatAt, String position, String phone) {
        this.idAccount = idAccount;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.creatAt = creatAt;
        this.position = position;
        this.phone = phone;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(String creatAt) {
        this.creatAt = creatAt;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "AccountFarm{" +
                "idAccount=" + idAccount +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                ", creatAt='" + creatAt + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
