package com.example.shoppingapp.Repository;

import androidx.lifecycle.MutableLiveData;

import com.example.shoppingapp.Model.HomePageModel;
import com.example.shoppingapp.Model.QuickMenu;
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
        model.setQuickMenus(
                new ArrayList<QuickMenu>() {
                    {
                        add(new QuickMenu(1,  R.drawable.ic_food,"Foods"));
                        add(new QuickMenu(2,  R.drawable.ic_tree,"Trees"));
                        add(new QuickMenu(3,  R.drawable.ic_bag,"Bags"));
                        add(new QuickMenu(4,  R.drawable.ic_clothes,"Cloths"));
                        add(new QuickMenu(5,  R.drawable.ic_watch,"Watches"));
                        add(new QuickMenu(6,  R.drawable.ic_jewellery,"Jewellery"));

                    }
                }
        );
        model.setHotOffersModels(
                new ArrayList<QuickMenu>() {
                    {
                        add(new QuickMenu(1,  R.drawable.watch,"75%"));
                        add(new QuickMenu(2,  R.drawable.shoes,"60%"));
                        add(new QuickMenu(2,  R.drawable.tree_image,"75%"));
                        add(new QuickMenu(2,  R.drawable.shoes,"60%"));
                        add(new QuickMenu(2,  R.drawable.watch,"75%"));
                        add(new QuickMenu(2,  R.drawable.tree_image,"60%"));

                    }
                }
        );
    }
}
