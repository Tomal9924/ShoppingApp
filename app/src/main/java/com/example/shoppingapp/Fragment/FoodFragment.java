package com.example.shoppingapp.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoppingapp.Adapter.FoodListAdapter;
import com.example.shoppingapp.Adapter.TrendingNowHomepageAdapter;
import com.example.shoppingapp.R;
import com.example.shoppingapp.ViewModel.HomeFragmentViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    View fragmentView;
    RecyclerView mFoodList;
    FoodListAdapter mFoodListAdapter;
    HomeFragmentViewModel mViewModel;


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentView= inflater.inflate(R.layout.fragment_food, container, false);

        mViewModel = ViewModelProviders.of(getActivity()).get(HomeFragmentViewModel.class);
        mViewModel.init();
        init();

        initRecyclerView();
        return  fragmentView;
    }

    private void initRecyclerView() {
        mFoodListAdapter = new FoodListAdapter(getContext(), mViewModel.getModel().getValue().getFoodListModel());
        mFoodList.setAdapter(mFoodListAdapter);

    }

    private void init() {
        mFoodList=fragmentView.findViewById(R.id.food_list_recyclerView);
        RecyclerView.LayoutManager layoutmanager = new GridLayoutManager(getActivity(), 2);
        mFoodList.setLayoutManager(layoutmanager);

    }

}
