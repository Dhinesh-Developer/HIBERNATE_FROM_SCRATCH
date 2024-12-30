package com.hib.pratice;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class OrdersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "oId")
    private int oId;

    @Column(name = "oName")
    private String oName;

    @Column(name = "oPrice")
    private int oPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    public OrdersEntity() {
    }

    public OrdersEntity(String oName, int oPrice) {
        this.oName = oName;
        this.oPrice = oPrice;
    }

    // Getters and Setters
    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public int getoPrice() {
        return oPrice;
    }

    public void setoPrice(int oPrice) {
        this.oPrice = oPrice;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }
}
