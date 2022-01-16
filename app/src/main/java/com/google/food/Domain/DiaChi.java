package com.google.food.Domain;

public class DiaChi {
    private int Id;
    private String Location;
    private String Address;
    private String Name;
    private String Phone_number;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public DiaChi(int id, String location, String address, String name, String phone_number) {
        Id = id;
        Location = location;
        Address = address;
        Name = name;
        Phone_number = phone_number;
    }
}
