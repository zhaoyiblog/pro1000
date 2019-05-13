package manger.bean;

public class RecordDictRawBean {
    private Integer id;
    private String type;
    private Integer index;
    private String attribute;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "RecordDictRawBean{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", index=" + index +
                ", attribute='" + attribute + '\'' +
                '}';
    }
}
