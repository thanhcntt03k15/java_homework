package Model;

public class Pet {
     public int id;
    public String name ;
    public String period;
    public String gender;
    public int quantily;
    public String status;

    public Pet() {
    }

    public Pet(int id, String name, String period, String gender, int quantily, String status) {
        this.id = id;
        this.name = name;
        this.period = period;
        this.gender = gender;
        this.quantily = quantily;
        this.status = status;
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

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void output()
    {
        System.out.printf(this.id+"|" +this.name +"|" +this.period +"|" +this.gender +"|"+ this.quantily+ "|"+ this.status +"\n");
    }

}
