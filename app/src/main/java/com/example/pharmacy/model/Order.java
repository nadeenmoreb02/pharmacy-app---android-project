package com.example.pharmacy.model;

import android.widget.ImageView;

import java.util.ArrayList;

public class Order {

    private String key;
    private ArrayList<Item> items;
    private double totalPrice;

    private String name;

    private String location;

    private int postalCode;

    private String status;

    public Order() {

    }

    public Order(ArrayList<Item> items, double totalPrice, String name, String location, int postalCode, String status) {
        this.items = items;
        this.totalPrice = totalPrice;
        this.name = name;
        this.location = location;
        this.postalCode = postalCode;
        this.status = status;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Order{" +
                "key='" + key + '\'' +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", postalCode=" + postalCode +
                ", status='" + status + '\'' +
                '}';
    }
}
