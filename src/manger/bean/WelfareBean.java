package manger.bean;

public class WelfareBean {
    private int id;
    private String accident_insurance;
    private String medical_insurance;
    private String endowment_insurance;
    private int sid;

    @Override
    public String toString() {
        return "WelfareBean{" +
                "id=" + id +
                ", accident_insurance='" + accident_insurance + '\'' +
                ", medical_insurance='" + medical_insurance + '\'' +
                ", endowment_insurance='" + endowment_insurance + '\'' +
                ", sid=" + sid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccident_insurance() {
        return accident_insurance;
    }

    public void setAccident_insurance(String accident_insurance) {
        this.accident_insurance = accident_insurance;
    }

    public String getMedical_insurance() {
        return medical_insurance;
    }

    public void setMedical_insurance(String medical_insurance) {
        this.medical_insurance = medical_insurance;
    }

    public String getEndowment_insurance() {
        return endowment_insurance;
    }

    public void setEndowment_insurance(String endowment_insurance) {
        this.endowment_insurance = endowment_insurance;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
