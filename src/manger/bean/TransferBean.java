package manger.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TransferBean {
    private int id;
    private int sid;
    private  String ison;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fromtime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date finaltime;

    @Override
    public String toString() {
        return "TransferBean{" +
                "id=" + id +
                ", sid=" + sid +
                ", ison='" + ison + '\'' +
                ", fromtime=" + fromtime +
                ", finaltime=" + finaltime +
                '}';
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

    public String getIson() {
        return ison;
    }

    public void setIson(String ison) {
        this.ison = ison;
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    public Date getFromtime() {
        return fromtime;
    }

    public void setFromtime(Date fromtime) {
        this.fromtime = fromtime;
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    public Date getFinaltime() {
        return finaltime;
    }

    public void setFinaltime(Date finaltime) {
        this.finaltime = finaltime;
    }
}
