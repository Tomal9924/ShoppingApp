package com.example.shoppingapp.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.shoppingapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomepageFavouriteList extends Fragment {


    public HomepageFavouriteList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__favourite_list, container, false);
    }

}
