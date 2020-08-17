package com.sw.eneity;


import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "stunt")
public class Stunt {

    @Id
    private Integer id;
    private String name;
    private String pwd;
    private String address;
    private String phone;
    public Stunt() {
    }

    public Stunt(Integer id, String name, String pwd, String address, String phone) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.address = address;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Stunt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
