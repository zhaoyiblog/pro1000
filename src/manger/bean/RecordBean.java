package manger.bean;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Component
public class RecordBean {
    private Integer id;
    private String name;

    private  Integer nation;
    private Integer sex;
    private Integer politics_status;
    private Integer profession_title;
    private Integer education;
    private Integer degree;
    private String education_school;
    private String degree_school;
    private Integer position;
    private Integer department;
    private String phone;
    private Integer is_authorized;

    private String id_number;
    private String pic;
    private Integer nationality;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birth;
    private String address;
    private Integer married;
    private String major;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date toWork;
    private Integer[] subject;
    private  String  educationexp;


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

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPolitics_status() {
        return politics_status;
    }

    public void setPolitics_status(Integer politics_status) {
        this.politics_status = politics_status;
    }

    public Integer getProfession_title() {
        return profession_title;
    }

    public void setProfession_title(Integer profession_title) {
        this.profession_title = profession_title;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String  phone) {
        this.phone = phone;
    }

    public Integer getIs_authorized() {
        return is_authorized;
    }

    public void setIs_authorized(Integer is_authorized) {
        this.is_authorized = is_authorized;
    }

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

    public Integer getNationality() {
        return nationality;
    }

    public void setNationality(Integer nationality) {
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

    public void setAddress(String adress) {
        this.address = adress;
    }

    public Integer getMarried() {
        return married;
    }

    public void setMarried(Integer married) {
        this.married = married;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getToWork() {
        return toWork;
    }

    public void setToWork(Date toWork) {
        this.toWork = toWork;
    }

    public Integer[] getSubject() {
        return subject;
    }

    public void setSubject(Integer[] subject) {
        this.subject = subject;
    }

    public String getEducationexp() {
        return educationexp;
    }

    public void setEducationexp(String educationexp) {
        this.educationexp = educationexp;
    }

    @Override
    public String toString() {
        return "RecordBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nation=" + nation +
                ", sex=" + sex +
                ", politics_status=" + politics_status +
                ", profession_title=" + profession_title +
                ", education=" + education +
                ", degree=" + degree +
                ", education_school='" + education_school + '\'' +
                ", degree_school='" + degree_school + '\'' +
                ", position=" + position +
                ", department=" + department +
                ", phone='" + phone + '\'' +
                ", is_authorized=" + is_authorized +
                ", id_number='" + id_number + '\'' +
                ", pic='" + pic + '\'' +
                ", nationality=" + nationality +
                ", birth=" + birth +
                ", address='" + address + '\'' +
                ", married=" + married +
                ", major='" + major + '\'' +
                ", toWork=" + toWork +
                ", subject=" + Arrays.toString(subject) +
                ", educationexp='" + educationexp + '\'' +
                '}';
    }
}
