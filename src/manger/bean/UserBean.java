package manger.bean;

public class UserBean {
    private Integer id;
    private String name;
    private Integer j_number;
    private int role;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJ_number() {
        return j_number;
    }

    public void setJ_number(Integer j_number) {
        this.j_number = j_number;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", j_number=" + j_number +
                ", role=" + role +
                ", password='" + password + '\'' +
                '}';
    }
}
