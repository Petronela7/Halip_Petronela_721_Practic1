package com.company;

import java.util.Objects;

public class Offer {
    private Integer id;
    private String shopName;
    private Double price;
    private Double tax;
    private String address;
    private Place place;

    public Offer(Integer id, String shopName, Double price, Double tax, String address, Place place) {
        this.id = id;
        this.shopName = shopName;
        this.price = price;
        this.tax = tax;
        this.address = address;
        this.place = place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(id, offer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ", address='" + address + '\'' +
                ", place=" + place +
                '}';
    }
}
