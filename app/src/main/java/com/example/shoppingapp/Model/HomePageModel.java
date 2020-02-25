package com.example.shoppingapp.Model;

import java.util.ArrayList;

public class HomePageModel {

    private ArrayList<SuperModel> superModels;
    private ArrayList<SuperModel> hotOffersModels;
    private ArrayList<SuperModel> trendingProducts;

    public HomePageModel() {}

    public HomePageModel(ArrayList<SuperModel> superModels, ArrayList<SuperModel> hotOffersModels) {
        this.superModels = superModels;
        this.hotOffersModels = hotOffersModels;
    }

    public ArrayList<SuperModel> getTrendingProducts() {
        return trendingProducts;
    }

    public void setTrendingProducts(ArrayList<SuperModel> trendingProducts) {
        this.trendingProducts = trendingProducts;
    }

    public ArrayList<SuperModel> getHotOffersModels() {
        return hotOffersModels;
    }

    public void setHotOffersModels(ArrayList<SuperModel> hotOffersModels) {
        this.hotOffersModels = hotOffersModels;
    }

    public ArrayList<SuperModel> getSuperModels() {
        return superModels;
    }

    public void setSuperModels(ArrayList<SuperModel> superModels) {
        this.superModels = superModels;
    }
}
