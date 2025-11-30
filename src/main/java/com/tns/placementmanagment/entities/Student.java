package com.tns.placementmanagment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private Integer sid;
    private String name;
    private long phoneNo;
    private String CollegeName;

    public Student(Integer sid, String name, long phoneNo, String collegeName) {
        this.sid = sid;
        this.name = name;
        this.phoneNo = phoneNo;
        CollegeName = collegeName;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                ", CollegeName='" + CollegeName + '\'' +
                '}';
    }
}
