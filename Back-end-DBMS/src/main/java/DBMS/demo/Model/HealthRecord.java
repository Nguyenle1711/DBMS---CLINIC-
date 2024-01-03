package DBMS.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "HEALTH_RECORD")
public class HealthRecord {
    @Id

    @Column(name = "HEALTH_RECORD_ID")
    private int healthRecordId;
    @Column(name = "HR_PATIENT_ID")
    private int patientId;
    @Column(name = "HR_DATE")
    private Date date;
    @Column(name = "HR_DENTIST_ID")
    private int dentistId;
    @Column(name = "HR_SERVICE_ID")
    private int serviceId;
    @Column(name = "PAID")
    private boolean paid;

    public int getHealthRecordId() {
        return healthRecordId;
    }

    public void setHealthRecordId(int healthRecordId) {
        this.healthRecordId = healthRecordId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDentistId() {
        return dentistId;
    }

    public void setDentistId(int dentistId) {
        this.dentistId = dentistId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
