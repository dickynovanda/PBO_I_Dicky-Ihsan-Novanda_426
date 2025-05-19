package com.praktikum.data;

public class Item {
    protected String itemName;
    protected String description;
    protected String location;
    private String status;

    public Item(String itemName, String description, String location, String status){
        this.itemName = itemName;
        this.description = description;
        this.location = location;
        this.status = status;
    }
    public String getItemName(){
        return itemName;
    }

    public String getDescription(){
        return description;
    }

    public  String getLocation(){
        return location;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
