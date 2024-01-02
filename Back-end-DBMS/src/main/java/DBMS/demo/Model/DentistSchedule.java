package DBMS.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "DENTIST_SCHEDULE")
public class DentistSchedule {
    @Id
    @Column(name = "SCHEDULE_ID")
    private int scheduleid;
    @Column(name = "DENTIST_ID")
    private int dentistid;
    @Column(name = "SCHEDULE_DATE")
    private Date date;
    @Column(name = "TIMEWORK")
    private Time time;
    @Column(name = "IS_OFF")
    private boolean is_off;

    public int getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(int scheduleid) {
        this.scheduleid = scheduleid;
    }

    public int getDentistid() {
        return dentistid;
    }

    public void setDentistid(int dentistid) {
        this.dentistid = dentistid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public boolean isIs_off() {
        return is_off;
    }

    public void setIs_off(boolean is_off) {
        this.is_off = is_off;
    }
}
