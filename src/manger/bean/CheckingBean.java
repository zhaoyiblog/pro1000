package manger.bean;

public class CheckingBean {
    private int id;
    private int on_time;
    private String name;
    private  int year;
    private int month;
    private int sid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOn_time() {
        return on_time;
    }

    public void setOn_time(int on_time) {
        this.on_time = on_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "CheckingBean{" +
                "id=" + id +
                ", on_time=" + on_time +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                '}';
    }
}
