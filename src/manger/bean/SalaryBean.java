package manger.bean;

public class SalaryBean {
    private int id;
    private int sid;
    private int base;
    private int tech_year;
    private int class_number;
    private int allowance;
    private String name;
    private  int count;
    @Override
    public String toString() {
        return "SalaryBean{" +
                "id=" + id +
                ", sid=" + sid +
                ", base=" + base +
                ", tech_year=" + tech_year +
                ", class_number=" + class_number +
                ", allowance=" + allowance +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getTech_year() {
        return tech_year;
    }

    public void setTech_year(int tech_year) {
        this.tech_year = tech_year;
    }

    public int getClass_number() {
        return class_number;
    }

    public void setClass_number(int class_number) {
        this.class_number = class_number;
    }



    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }
}
