package com.example.shoppingapp.Repository;

import androidx.lifecycle.MutableLiveData;

import com.example.shoppingapp.Model.HomePageModel;
import com.example.shoppingapp.Model.SuperModel;
import com.example.shoppingapp.R;

import java.util.ArrayList;

public class HompageRepository {

    private static HompageRepository instance;
    private HomePageModel model = new HomePageModel();

    public static HompageRepository getInstance() {
        if (instance == null) {
            instance = new HompageRepository();
        }
        return instance;
    }
    public MutableLiveData<HomePageModel> getModel() {
        setModel();
        MutableLiveData<HomePageModel> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(model);
        return mutableLiveData;
    }

    private void setModel() {
        model = new HomePageModel();
        model.setSuperModels(
                new ArrayList<SuperModel>() {
                    {
                        add(new SuperModel(1,  R.drawable.ic_food,"Foods"));
                        add(new SuperModel(2,  R.drawable.ic_tree,"Trees"));
                        add(new SuperModel(3,  R.drawable.ic_bag,"Bags"));
                        add(new SuperModel(3,  R.drawable.ic_discount,"Discounts"));
                        add(new SuperModel(4,  R.drawable.ic_clothes,"Fashions"));
                        add(new SuperModel(5,  R.drawable.ic_watch,"Watches"));
                        add(new SuperModel(6,  R.drawable.ic_jewellery,"Jewellery"));
                        add(new SuperModel(6,  R.drawable.ic_categories,"Categories"));

                    }
                }
        );
        model.setHotOffersModels(
                new ArrayList<SuperModel>() {
                    {
                        add(new SuperModel(1,  R.drawable.jacket,"75%","Fleece Jacket",4,10000.00,30));
                        add(new SuperModel(2,  R.drawable.ice_axe,"60%","Ice Axe",4,500.00,40));
                        add(new SuperModel(3,  R.drawable.tree_image,"60%","Tree",2,700.00,44));
                        add(new SuperModel(4,  R.drawable.shoes,"60%","Nike Shoes",1,600.00,15));
                        add(new SuperModel(5,  R.drawable.shoes,"10%","Adidas Shoes",5,4000.00,10));
                        add(new SuperModel(6,  R.drawable.watch,"60%","Fast Track Watch",3,300.00,20));


                    }
                }
        );
        model.setGlobalProducts(
                new ArrayList<SuperModel>() {
                    {
                        add(new SuperModel(1,  R.drawable.jacket,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(2,  R.drawable.ice_axe,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(3,  R.drawable.tree_image,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(4,  R.drawable.shoes,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(5,  R.drawable.jacket,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(6,  R.drawable.watch,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(7,  R.drawable.sleeping_bag,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(8,  R.drawable.jacket,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(9,  R.drawable.ice_axe,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(10,  R.drawable.tree_image,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(11,  R.drawable.shoes,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(12,  R.drawable.jacket,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(13,  R.drawable.watch,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(14,  R.drawable.jacket,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(15,  R.drawable.jacket,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(16,  R.drawable.ice_axe,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(17,  R.drawable.shoes,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(18,  R.drawable.ice_axe,"Ice Axe",4,10000.00));
                        add(new SuperModel(19,  R.drawable.jacket,"Fleece Jacket Winter",4,10000.00));
                        add(new SuperModel(20,  R.drawable.watch,"Trekking Watch",4,10000.00));
                        add(new SuperModel(21,  R.drawable.sleeping_bag,"Sleeping Bags For -10 degree",4,10000.00));

                    }
                }
        );
        model.setTrendingProducts(
                new ArrayList<SuperModel>() {
                    {
                        add(new SuperModel(1,  R.drawable.tree_image,"Tree",4,100.00));
                        add(new SuperModel(2,  R.drawable.watch,"Titan Watch",4,100.00));
                        add(new SuperModel(3,  R.drawable.jacket,"Fleece Jacket",4,100.00));
                        add(new SuperModel(4,  R.drawable.tent,"2 Person Tent",4,100.00));
                        add(new SuperModel(5,  R.drawable.sleeping_bag,"-10 Sleeping Bag",4,100.00));
                        add(new SuperModel(6,  R.drawable.watch,"Titan Watch",4,100.00));

                    }
                }
        );
        model.setCategoriesProducts(
                new ArrayList<SuperModel>() {
                    {
                        add(new SuperModel(1,  R.drawable.jacket,"256.00"));
                        add(new SuperModel(2,  R.drawable.sleeping_bag,"755.55"));
                        add(new SuperModel(3,  R.drawable.tent,"240"));
                        add(new SuperModel(4,  R.drawable.ice_axe,"1050"));
                        add(new SuperModel(5,  R.drawable.tree_image,"2000"));
                        add(new SuperModel(6,  R.drawable.sleeping_bag,"755.55"));
                        add(new SuperModel(7,  R.drawable.tent,"4000"));
                        add(new SuperModel(8,  R.drawable.watch,"6000"));
                        add(new SuperModel(9,  R.drawable.tree_image,"2000"));

                    }
                }
        );
    }
}
