package com.example.banhtrung.model;

public class Cake {
    private int id;
    private String name;
    private String details;
    private String type;
    private int price;
    private boolean status;

    public Cake() {
    }

    public Cake(int id, String name, String details, String type, int price, boolean status) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
