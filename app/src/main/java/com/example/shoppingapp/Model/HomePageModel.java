package com.example.shoppingapp.Model;

import java.util.ArrayList;

public class HomePageModel {

    private ArrayList<SuperModel> superModels;
    private ArrayList<SuperModel> hotOffersModels;
    private ArrayList<SuperModel> trendingProducts;
    private ArrayList<SuperModel> categoriesProducts;
    private ArrayList<SuperModel> globalProducts;
    private ArrayList<SuperModel> foodListModel;

    public HomePageModel() {}


    public ArrayList<SuperModel> getGlobalProducts() {
        return globalProducts;
    }

    public ArrayList<SuperModel> getFoodListModel() {
        return foodListModel;
    }

    public void setFoodListModel(ArrayList<SuperModel> foodListModel) {
        this.foodListModel = foodListModel;
    }

    public void setGlobalProducts(ArrayList<SuperModel> globalProducts) {
        this.globalProducts = globalProducts;
    }

    public ArrayList<SuperModel> getTrendingProducts() {
        return trendingProducts;
    }

    public ArrayList<SuperModel> getCategoriesProducts() {
        return categoriesProducts;
    }

    public void setCategoriesProducts(ArrayList<SuperModel> categoriesProducts) {
        this.categoriesProducts = categoriesProducts;
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
