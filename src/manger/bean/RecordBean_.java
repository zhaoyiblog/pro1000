package manger.bean;

import java.util.Date;

public class RecordBean_ {
    private Integer id;
    private String name;
    private  String nation;
    private String sex;
    private String politics_status;
    private String  profession_title;
    private String  education;
    private String  degree;
    private String education_school;
    private String degree_school;
    private String  position;
    private String department;
    private String phone;
    private String  is_authorized;

    private String id_number;
    private  String pic;
    private String  nationality;
    private Date birth;
    private String address;
    private  String  married;
    private  String major;
    private  Date towork;
    private  String educationexp;

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getTowork() {
        return towork;
    }

    public void setTowork(Date towork) {
        this.towork = towork;
    }

    public String getEducationexp() {
        return educationexp;
    }

    public void setEducationexp(String educationexp) {
        this.educationexp = educationexp;
    }

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

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPolitics_status() {
        return politics_status;
    }

    public void setPolitics_status(String politics_status) {
        this.politics_status = politics_status;
    }

    public String getProfession_title() {
        return profession_title;
    }

    public void setProfession_title(String profession_title) {
        this.profession_title = profession_title;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEducation_school() {
        return education_school;
    }

    public void setEducation_school(String education_school) {
        this.education_school = education_school;
    }

    public String getDegree_school() {
        return degree_school;
    }

    public void setDegree_school(String degree_school) {
        this.degree_school = degree_school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIs_authorized() {
        return is_authorized;
    }

    public void setIs_authorized(String is_authorized) {
        this.is_authorized = is_authorized;
    }

    @Override
    public String toString() {
        return "RecordBean_{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", sex='" + sex + '\'' +
                ", politics_status='" + politics_status + '\'' +
                ", profession_title='" + profession_title + '\'' +
                ", education='" + education + '\'' +
                ", degree='" + degree + '\'' +
                ", education_school='" + education_school + '\'' +
                ", degree_school='" + degree_school + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                ", is_authorized='" + is_authorized + '\'' +
                ", id_number='" + id_number + '\'' +
                ", pic='" + pic + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birth=" + birth +
                ", address='" + address + '\'' +
                ", married='" + married + '\'' +
                ", major='" + major + '\'' +
                ", towork=" + towork +
                ", educationexp='" + educationexp + '\'' +
                '}';
    }
}
