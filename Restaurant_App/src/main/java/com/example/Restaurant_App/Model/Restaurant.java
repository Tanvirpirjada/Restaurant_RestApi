package com.example.Restaurant_App.Model;



public class Restaurant {
    private String Restaurant_name;
    private  String Restaurant_Owner;

    private String Restaurant_Address;
    private  Integer Restaurant_Number;
    private String Restaurant_Speciality;
    private Integer Restaurant_TotalStaff;
    private Integer Restaurant_TotalBranches;
    private  Double Restaurant_Stars;

     Restaurant(){}


    public Restaurant(String Restaurant_Owner, String Restaurant_name, String Restaurant_Address, Integer Restaurant_Number, String Restaurant_Speciality, Integer Restaurant_TotalStaff, Integer Restaurant_TotalBranches, Double Restaurant_Stars){
        this.Restaurant_Owner=Restaurant_Owner;
        this.Restaurant_name=Restaurant_name;
        this.Restaurant_Address=Restaurant_Address;
        this.Restaurant_Number=Restaurant_Number;
        this.Restaurant_Speciality=Restaurant_Speciality;
        this.Restaurant_TotalStaff=Restaurant_TotalStaff;
        this.Restaurant_TotalBranches=Restaurant_TotalBranches;
        this.Restaurant_Stars=Restaurant_Stars;
    }

    public String getRestaurant_Owner() {
        return Restaurant_Owner;
    }

    public void setRestaurant_Owner(String restaurant_Owner) {
        Restaurant_Owner = restaurant_Owner;
    }

    public String getRestaurant_name() {
        return Restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        Restaurant_name = restaurant_name;
    }

    public String getRestaurant_Address() {
        return Restaurant_Address;
    }

    public void setRestaurant_Address(String restaurant_Address) {
        Restaurant_Address = restaurant_Address;
    }

    public Integer getRestaurant_Number() {
        return Restaurant_Number;
    }

    public void setRestaurant_Number(Integer restaurant_Number) {
        Restaurant_Number = restaurant_Number;
    }

    public String getRestaurant_Speciality() {
        return Restaurant_Speciality;
    }

    public void setRestaurant_Speciality(String restaurant_Speciality) {
        Restaurant_Speciality = restaurant_Speciality;
    }

    public Integer getRestaurant_TotalStaff() {
        return Restaurant_TotalStaff;
    }

    public void setRestaurant_TotalStaff(Integer restaurant_TotalStaff) {
        Restaurant_TotalStaff = restaurant_TotalStaff;
    }

    public Integer getRestaurant_TotalBranches() {
        return Restaurant_TotalBranches;
    }

    public void setRestaurant_TotalBranches(Integer restaurant_TotalBranches) {
        Restaurant_TotalBranches = restaurant_TotalBranches;
    }

    public Double getRestaurant_Stars() {
        return Restaurant_Stars;
    }

    public void setRestaurant_Stars(Double restaurant_Stars) {
        Restaurant_Stars = restaurant_Stars;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                ", Restaurant_name='" + Restaurant_name + '\'' +
                "Restaurant_Owner='" + Restaurant_Owner + '\'' +
                ", Restaurant_Address='" + Restaurant_Address + '\'' +
                ", Restaurant_Number=" + Restaurant_Number +
                ", Restaurant_Speciality='" + Restaurant_Speciality + '\'' +
                ", Restaurant_TotalStaff=" + Restaurant_TotalStaff +
                ", Restaurant_TotalBranches=" + Restaurant_TotalBranches +
                ", Restaurant_Stars=" + Restaurant_Stars +
                '}';
    }
}
