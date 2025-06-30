package com.example.shopcar.Domain;

public class CategoryDomain {
    private String title;
    private String picUrl;

    public CategoryDomain() {}

    public CategoryDomain(String title, String picUrl) {
        this.title = title;
        this.picUrl = picUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getPicUrl() {
        return picUrl;
    }
}