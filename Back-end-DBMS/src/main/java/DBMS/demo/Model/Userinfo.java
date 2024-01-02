package DBMS.demo.Model;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.Modifying;

import java.util.BitSet;
import java.util.Date;

@Entity

@Table(name="USER_INFO")
public class Userinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PHONE_NUMBER")
    private String password;
    @Column(name = "U_PASSWORD")
    private String userid;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "U_NAME")
    private String name;
    @Column(name = "DAY_OF_BIRTH")
    private Date dob;
    @Column(name = "ROLE_TYPE")
    private String role;
    @Column(name = "IS_AVAILABLE")
    private int avalable;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAvalable() {
        return avalable;
    }

    public void setAvalable(int avalable) {
        this.avalable = avalable;
    }
}
