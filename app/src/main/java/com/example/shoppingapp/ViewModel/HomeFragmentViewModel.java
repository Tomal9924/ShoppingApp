package com.example.shoppingapp.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.shoppingapp.Model.HomePageModel;
import com.example.shoppingapp.Repository.HompageRepository;

public class HomeFragmentViewModel extends ViewModel {
    private MutableLiveData<HomePageModel> mModel;
    private HompageRepository mRepo;
    public void init(){
        if (mModel != null) {
            return;
        }
        mRepo = HompageRepository.getInstance();
        mModel = mRepo.getModel();
    }

    public LiveData<HomePageModel> getModel() {
        return mModel;
    }
}