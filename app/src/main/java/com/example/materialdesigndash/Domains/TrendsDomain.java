package com.example.materialdesigndash.Domains;

public class TrendsDomain {

    private String title;
    private String subTitle;
    private String picAdress;

    public TrendsDomain(String title, String subTitle, String picAdress) {
        this.title = title;
        this.subTitle = subTitle;
        this.picAdress = picAdress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getPicAdress() {
        return picAdress;
    }

    public void setPicAdress(String picAdress) {
        this.picAdress = picAdress;
    }
}
