package Model;

public class Crops {
    public int id;
    public String name ;
    public String period;
    public int area;
    public String status;

    public Crops() {
    }

    public Crops(int id, String name, String period, int area, String status) {
        this.id = id;
        this.name = name;
        this.period = period;
        this.area = area;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void output()
    {
        System.out.printf(this.id+"|"+this.name+"|"+this.period+"|"+this.area+"|"+this.status+"\n" );
    }
}
