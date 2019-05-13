package manger.bean;

public class ContractBean {
    private int id;
    private String location;
    private String comment;

    @Override
    public String toString() {
        return "ContractBean{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
