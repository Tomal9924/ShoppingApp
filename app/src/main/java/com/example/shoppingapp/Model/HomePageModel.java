package com.example.shoppingapp.Model;

import java.util.ArrayList;

public class HomePageModel {

    private ArrayList<QuickMenu> quickMenus;
    private ArrayList<QuickMenu> hotOffersModels;

    public HomePageModel() {}

    public HomePageModel(ArrayList<QuickMenu> quickMenus, ArrayList<QuickMenu> hotOffersModels) {
        this.quickMenus = quickMenus;
        this.hotOffersModels = hotOffersModels;
    }

    public ArrayList<QuickMenu> getHotOffersModels() {
        return hotOffersModels;
    }

    public void setHotOffersModels(ArrayList<QuickMenu> hotOffersModels) {
        this.hotOffersModels = hotOffersModels;
    }

    public ArrayList<QuickMenu> getQuickMenus() {
        return quickMenus;
    }

    public void setQuickMenus(ArrayList<QuickMenu> quickMenus) {
        this.quickMenus = quickMenus;
    }
}
