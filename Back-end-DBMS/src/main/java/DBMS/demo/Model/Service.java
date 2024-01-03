package DBMS.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Service {
    @Id
    @Column(name = "SERVICE_ID")
    private int serviceId;
    @Column(name = "SV_NAME")
    private String name;
    @Id
    @Column(name = "SV_COST")
    private int cost;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
