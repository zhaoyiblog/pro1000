package manger.bean;

import java.util.List;

public class RecordDictBean {
    private List<String> sexList;
    private List<String> nationList;
    private List<String> politicsList;
    private List<String> titleList;
    private List<String> educationList;
    private List<String> degreeList;
    private List<String> positionList;
    private List<String> deparmentList;
    private List<String> isAuthroziedList;
    private List<String> nationalityList;
    private List<String> marriedList;
    private List<String> subjectList;

    public List<String> getNationalityList() {
        return nationalityList;
    }

    public void setNationalityList(List<String> nationalityList) {
        this.nationalityList = nationalityList;
    }

    public List<String> getMarriedList() {
        return marriedList;
    }

    public void setMarriedList(List<String> marriedList) {
        this.marriedList = marriedList;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

    public List<String> getSexList() {
        return sexList;
    }

    public void setSexList(List<String> sexList) {
        this.sexList = sexList;
    }

    public List<String> getNationList() {
        return nationList;
    }

    public void setNationList(List<String> nationList) {
        this.nationList = nationList;
    }

    public List<String> getPoliticsList() {
        return politicsList;
    }

    public void setPoliticsList(List<String> politicsList) {
        this.politicsList = politicsList;
    }

    public List<String> getTitleList() {
        return titleList;
    }

    public void setTitleList(List<String> titleList) {
        this.titleList = titleList;
    }

    public List<String> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<String> educationList) {
        this.educationList = educationList;
    }

    public List<String> getDegreeList() {
        return degreeList;
    }

    public void setDegreeList(List<String> degreeList) {
        this.degreeList = degreeList;
    }

    public List<String> getPositionList() {
        return positionList;
    }

    public void setPositionList(List<String> positionList) {
        this.positionList = positionList;
    }

    public List<String> getDeparmentList() {
        return deparmentList;
    }

    public void setDeparmentList(List<String> deparmentList) {
        this.deparmentList = deparmentList;
    }

    public List<String> getIsAuthroziedList() {
        return isAuthroziedList;
    }

    @Override
    public String toString() {
        return "RecordDictBean{" +
                "sexList=" + sexList +
                ", nationList=" + nationList +
                ", politicsList=" + politicsList +
                ", titleList=" + titleList +
                ", educationList=" + educationList +
                ", degreeList=" + degreeList +
                ", positionList=" + positionList +
                ", deparmentList=" + deparmentList +
                ", isAuthroziedList=" + isAuthroziedList +
                '}';
    }

    public void setIsAuthroziedList(List<String> isAuthroziedList) {
        this.isAuthroziedList = isAuthroziedList;
    }

}
