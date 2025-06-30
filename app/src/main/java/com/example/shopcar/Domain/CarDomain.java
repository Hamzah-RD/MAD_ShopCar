package com.example.shopcar.Domain;
import java.io.Serializable;

public class CarDomain  implements Serializable {
    private  String title;
    private  String descrition;
    private String picUrl;
    private  String TotalCapacity;

    public CarDomain() {
    }

    public CarDomain(String title, String descrition, String picUrl, String totalCapacity, String engineOutput, String highestSpeed, String url, double price) {
        this.title = title;
        this.descrition = descrition;
        this.picUrl = picUrl;
        TotalCapacity = totalCapacity;
        this.engineOutput = engineOutput;
        HighestSpeed = highestSpeed;
        Url = url;
        this.price = price;
    }

    private  String engineOutput;
    private  String HighestSpeed;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getTotalCapacity() {
        return TotalCapacity;
    }

    public void setTotalCapacity(String totalCapacity) {
        TotalCapacity = totalCapacity;
    }

    public String getEngineOutput() {
        return engineOutput;
    }

    public void setEngineOutput(String engineOutput) {
        this.engineOutput = engineOutput;
    }

    public String getHighestSpeed() {
        return HighestSpeed;
    }

    public void setHighestSpeed(String highestSpeed) {
        HighestSpeed = highestSpeed;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private  String Url;
    private double price;

}
