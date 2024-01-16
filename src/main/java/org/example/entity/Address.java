package org.example.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;
    @Column(name = "street_name",length = 50)
    private String street;
    @Column(name = "city_name",length = 50)
    private String city;
    @Column(name = "is_open")
    private boolean isopen;
    @Transient
    private double x;
    @Temporal(TemporalType.DATE)
    @Column(name = "added_date")
    private Date addedDate;
    @Lob
    private byte[] image;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Address(int addressId, String street, String city, boolean isopen, double x, Date addedDate, byte[] image) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.isopen = isopen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }
    public Address(){
        super();
    }

}
