package DBMS.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table (name = "MEDICINE")
public class Medicine {
    @Id
    @Column(name="MEDICINE_ID")
    private int medicineID;
    @Column(name="M_NAME")
    private String m_name;

    @Column(name="M_UNIT")
    private String m_unit;
    @Column(name="M_CONTRAINDICATION")
    private String m_contraindication;

    @Column(name="M_QUANTITY")

    private int quantity;
    @Column(name="M_EXPIRATION_DATE")

    private Date expiration;
    @Column(name="M_COST")

    private int cost;


    public int getMedicineID() {
        return medicineID;
    }



    public void setMedicineID(int medicineID) {
        this.medicineID = medicineID;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_unit() {
        return m_unit;
    }

    public void setM_unit(String m_unit) {
        this.m_unit = m_unit;
    }

    public String getM_contraindication() {
        return m_contraindication;
    }

    public void setM_contraindication(String m_contraindication) {
        this.m_contraindication = m_contraindication;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpration() {
        return expiration;
    }

    public void setExpration(Date expration) {
        this.expiration = expration;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
