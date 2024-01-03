package DBMS.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.sql.Time;
@Table(name = "PRESCRIPTION")
@Entity
public class Prescription {
    @Id
    @Column(name = "PRESCRIPTION_ID")
    private int prescriptionId;
    @Column(name = "P_HEALTH_RECORD_ID")
    private int healthrecordId;
    @Column(name = "P_QUANTITY ")
    private int quanlity;
    @Column(name = "P_MEDICINE_ID")
    private int medicineId;

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public int getHealthrecordId() {
        return healthrecordId;
    }

    public void setHealthrecordId(int healthrecordId) {
        this.healthrecordId = healthrecordId;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
}
