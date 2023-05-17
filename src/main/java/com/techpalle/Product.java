package com.techpalle;

import jakarta.persistence.*;


import java.util.Objects;
@Entity
public class Product
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String pname;
    private String batchno;
    private Double price ;
    private Integer noofproduct;

    public Product() {
    }

    public Product(String pname, String batchno, Double price, Integer noofproduct) {
        this.pname = pname;
        this.batchno = batchno;
        this.price = price;
        this.noofproduct = noofproduct;
    }

    public Product(Integer id, String pname, String batchno, Double price, Integer noofproduct) {
        this.id = id;
        this.pname = pname;
        this.batchno = batchno;
        this.price = price;
        this.noofproduct = noofproduct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNoofproduct() {
        return noofproduct;
    }

    public void setNoofproduct(Integer noofproduct) {
        this.noofproduct = noofproduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", batchno='" + batchno + '\'' +
                ", price=" + price +
                ", noofproduct=" + noofproduct +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(pname, product.pname) && Objects.equals(batchno, product.batchno) && Objects.equals(price, product.price) && Objects.equals(noofproduct, product.noofproduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pname, batchno, price, noofproduct);
    }
}
