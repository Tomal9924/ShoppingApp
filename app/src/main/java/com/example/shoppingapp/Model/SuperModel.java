package com.example.shoppingapp.Model;

public class SuperModel {

    int id;
    int image;
    String text;
    String productTitle;
    int ratting;
    double productNewPrice;
    double productOffPrice;



    public SuperModel(int id, int image, String productTitle, int ratting, double productNewPrice) {
        this.id = id;
        this.image = image;
        this.productTitle = productTitle;
        this.ratting = ratting;
        this.productNewPrice = productNewPrice;
    }

    public SuperModel(int id, int image, String text, String productTitle, int ratting, double productNewPrice, double productOffPrice) {
        this.id = id;
        this.image = image;
        this.text = text;
        this.productTitle = productTitle;
        this.ratting = ratting;
        this.productNewPrice = productNewPrice;
        this.productOffPrice = productOffPrice;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getRatting() {
        return ratting;
    }

    public void setRatting(int ratting) {
        this.ratting = ratting;
    }

    public double getProductNewPrice() {
        return productNewPrice;
    }

    public void setProductNewPrice(double productNewPrice) {
        this.productNewPrice = productNewPrice;
    }

    public double getProductOffPrice() {
        return productOffPrice;
    }

    public void setProductOffPrice(double productOffPrice) {
        this.productOffPrice = productOffPrice;
    }

    public SuperModel(int id, int image, String text) {
        this.id = id;
        this.image = image;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
