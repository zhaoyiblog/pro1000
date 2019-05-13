package manger.bean;

public class PerformanceBean {
    private Integer id;
    private Integer discipline_activities;
    private Integer class_adjustment;
    private Integer unInvigilate;
    private Integer unmarking;
    private Integer pass_rate;
    private Integer competition_award;
    private Integer complatint;
    private  String sid;

    @Override
    public String toString() {
        return "PerformanceBean{" +
                "id=" + id +
                ", discipline_activities=" + discipline_activities +
                ", class_adjustment=" + class_adjustment +
                ", unInvigilate=" + unInvigilate +
                ", unmarking=" + unmarking +
                ", pass_rate=" + pass_rate +
                ", competition_award=" + competition_award +
                ", complatint=" + complatint +
                ", sid='" + sid + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiscipline_activities() {
        return discipline_activities;
    }

    public void setDiscipline_activities(Integer discipline_activities) {
        this.discipline_activities = discipline_activities;
    }

    public Integer getClass_adjustment() {
        return class_adjustment;
    }

    public void setClass_adjustment(Integer class_adjustment) {
        this.class_adjustment = class_adjustment;
    }

    public Integer getUnInvigilate() {
        return unInvigilate;
    }

    public void setUnInvigilate(Integer unInvigilate) {
        this.unInvigilate = unInvigilate;
    }

    public Integer getUnmarking() {
        return unmarking;
    }

    public void setUnmarking(Integer unmarking) {
        this.unmarking = unmarking;
    }

    public Integer getPass_rate() {
        return pass_rate;
    }

    public void setPass_rate(Integer pass_rate) {
        this.pass_rate = pass_rate;
    }

    public Integer getCompetition_award() {
        return competition_award;
    }

    public void setCompetition_award(Integer competition_award) {
        this.competition_award = competition_award;
    }

    public Integer getComplatint() {
        return complatint;
    }

    public void setComplatint(Integer complatint) {
        this.complatint = complatint;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
