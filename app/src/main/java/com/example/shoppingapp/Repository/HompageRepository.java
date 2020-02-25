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
                        add(new SuperModel(4,  R.drawable.ic_clothes,"Cloths"));
                        add(new SuperModel(5,  R.drawable.ic_watch,"Watches"));
                        add(new SuperModel(6,  R.drawable.ic_jewellery,"Jewellery"));

                    }
                }
        );
        model.setHotOffersModels(
                new ArrayList<SuperModel>() {
                    {
                        add(new SuperModel(1,  R.drawable.watch,"75%","Titan Watch",4,100.00,30));
                        add(new SuperModel(2,  R.drawable.shoes,"60%","Nike Shoes",4,500.00,40));
                        add(new SuperModel(3,  R.drawable.tree_image,"60%","Tree",2,700.00,44));
                        add(new SuperModel(4,  R.drawable.shoes,"60%","Nike Shoes",1,600.00,15));
                        add(new SuperModel(5,  R.drawable.shoes,"10%","Adidas Shoes",5,4000.00,10));
                        add(new SuperModel(6,  R.drawable.watch,"60%","Fast Track Watch",3,300.00,20));


                    }
                }
        );
        model.setTrendingProducts(
                new ArrayList<SuperModel>() {
                    {
                        add(new SuperModel(1,  R.drawable.tree_image,"Tree",4,100.00));
                        add(new SuperModel(2,  R.drawable.watch,"Titan Watch",4,100.00));
                        add(new SuperModel(3,  R.drawable.shoes,"Nike Shoes",4,100.00));
                        add(new SuperModel(4,  R.drawable.tent,"2 Person Tent",4,100.00));
                        add(new SuperModel(5,  R.drawable.sleeping_bag,"-10 Sleeping Bag",4,100.00));
                        add(new SuperModel(6,  R.drawable.watch,"Titan Watch",4,100.00));

                    }
                }
        );
    }
}
