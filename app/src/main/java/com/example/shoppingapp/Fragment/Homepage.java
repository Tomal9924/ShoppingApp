package com.example.shoppingapp.Fragment;


import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.shoppingapp.Adapter.CategoriesHomepageSliderAdapter;
import com.example.shoppingapp.Adapter.FeaturedBrandsSliderAdapter;
import com.example.shoppingapp.Adapter.GlobalProductsAdapter;
import com.example.shoppingapp.Adapter.HotOfferForHomepageAdapter;
import com.example.shoppingapp.Adapter.QuickLinkListForHomepageAdapter;
import com.example.shoppingapp.Adapter.SliderAdapter;
import com.example.shoppingapp.Adapter.TrendingNowHomepageAdapter;
import com.example.shoppingapp.Model.HomePageModel;
import com.example.shoppingapp.Model.SliderModel;
import com.example.shoppingapp.R;
import com.example.shoppingapp.ViewModel.HomeFragmentViewModel;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends Fragment {


    View fragmentView;
    SearchView mSearchview;
    SliderView sliderView,mFeaturedBrandsSliderView;
    private SliderAdapter mSliderAdapter;
    private FeaturedBrandsSliderAdapter mBrandsSliderAdapter;
    RecyclerView mQuickList,mHotOfferList,mTrendingList,mCategoriesList,mGlobalList;
    HomeFragmentViewModel mViewModel;
    QuickLinkListForHomepageAdapter mQuickLinkAdapter;
    HotOfferForHomepageAdapter mHotOfferForHomepageAdapter;
    TrendingNowHomepageAdapter mTrendingAdapter;
    CategoriesHomepageSliderAdapter mCategoriesAdapter;
    GlobalProductsAdapter mGlobalAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        fragmentView= inflater.inflate(R.layout.fragment_fragment_dashboard, container, false);

        mViewModel = ViewModelProviders.of(getActivity()).get(HomeFragmentViewModel.class);
        mViewModel.init();
        init();
       /* mViewModel.getModel().observe(getActivity(), new Observer<HomePageModel>() {
            @Override
            public void onChanged(@Nullable HomePageModel homePageModel) {
                mQuickLinkAdapter.notifyDataSetChanged();
                mSliderAdapter.notifyDataSetChanged();
                mTrendingAdapter.notifyDataSetChanged();
                mHotOfferForHomepageAdapter.notifyDataSetChanged();
            }
        });*/
        initRecyclerView();

        return fragmentView;
    }
    private  void init(){

        mSearchview=fragmentView.findViewById(R.id.homepage_searchView);
        sliderView=fragmentView.findViewById(R.id.homepage_offer_slider);
        mFeaturedBrandsSliderView=fragmentView.findViewById(R.id.top_brands_slider);
        mCategoriesList=fragmentView.findViewById(R.id.categories_list_recyclerView);
        mQuickList=fragmentView.findViewById(R.id.quick_menu_recyclerView);
        mGlobalList=fragmentView.findViewById(R.id.global_product_list);
        mHotOfferList=fragmentView.findViewById(R.id.hot_offer_recyclerView);
        mTrendingList=fragmentView.findViewById(R.id.trending_now_recyclerView);

        RecyclerView.LayoutManager layoutmanager = new GridLayoutManager(getActivity(), 4);
        mQuickList.setLayoutManager(layoutmanager);


        mHotOfferList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        mHotOfferList.setNestedScrollingEnabled(true);

        mTrendingList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        mTrendingList.setNestedScrollingEnabled(true);

        RecyclerView.LayoutManager mCategoriesListLayout = new GridLayoutManager(getActivity(), 3);
        mCategoriesList.setLayoutManager(mCategoriesListLayout);

        RecyclerView.LayoutManager mGlobalListLayout = new GridLayoutManager(getActivity(), 2);
        mGlobalList.setLayoutManager(mGlobalListLayout);

        mSearchview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSearchview.setIconified(false);
            }
        });
        mSearchview.clearFocus();
        EditText txtSearch = ((EditText) mSearchview.findViewById(androidx.appcompat.R.id.search_src_text));
        txtSearch.setHintTextColor(Color.LTGRAY);
        txtSearch.setTextColor(Color.BLACK);
        ImageView searchIcon=
                mSearchview.findViewById(androidx.appcompat.R.id.search_mag_icon);
        searchIcon.setColorFilter(getResources().getColor(R.color.colorPrimary),
                android.graphics.PorterDuff.Mode.SRC_IN);

        mSliderAdapter = new SliderAdapter(getContext());
        sliderView.setSliderAdapter(mSliderAdapter);
        renewItems(null);

        mBrandsSliderAdapter = new FeaturedBrandsSliderAdapter(getContext());
        mFeaturedBrandsSliderView.setSliderAdapter(mBrandsSliderAdapter);
        renewItemsForBrandsSlider(null);

        sliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

        mFeaturedBrandsSliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        mFeaturedBrandsSliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        mFeaturedBrandsSliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        mFeaturedBrandsSliderView.setIndicatorSelectedColor(Color.WHITE);
        mFeaturedBrandsSliderView.setIndicatorUnselectedColor(Color.GRAY);
        mFeaturedBrandsSliderView.setScrollTimeInSec(3);
        mFeaturedBrandsSliderView.setAutoCycle(true);
        mFeaturedBrandsSliderView.startAutoCycle();

    }

    private void initRecyclerView() {
        mQuickLinkAdapter = new QuickLinkListForHomepageAdapter(getContext(), mViewModel.getModel().getValue().getSuperModels());
        mQuickList.setAdapter(mQuickLinkAdapter);

        mHotOfferForHomepageAdapter = new HotOfferForHomepageAdapter(getContext(), mViewModel.getModel().getValue().getHotOffersModels());
        mHotOfferList.setAdapter(mHotOfferForHomepageAdapter);

        mTrendingAdapter = new TrendingNowHomepageAdapter(getContext(), mViewModel.getModel().getValue().getTrendingProducts());
        mTrendingList.setAdapter(mTrendingAdapter);

        mCategoriesAdapter = new CategoriesHomepageSliderAdapter(getContext(), mViewModel.getModel().getValue().getCategoriesProducts());
        mCategoriesList.setAdapter(mCategoriesAdapter);

        mGlobalAdapter = new GlobalProductsAdapter(getContext(), mViewModel.getModel().getValue().getGlobalProducts());
        mGlobalList.setAdapter(mGlobalAdapter);
    }
    public void renewItems(View view) {
        List<SliderModel> sliderItemList = new ArrayList<>();
        //dummy data
        for (int i = 0; i < 10; i++) {
            SliderModel sliderItem = new SliderModel();
            if (i % 2 == 0) {
                sliderItem.setImageUrl("https://www.softwaresuggest.com/blog/wp-content/uploads/2018/10/ecommerce2-1.png");
            } else if(i%3==0){
                sliderItem.setImageUrl("https://cdn.searchenginejournal.com/wp-content/uploads/2018/04/e-commerce-store-760x400.png");
            }
            else{
                sliderItem.setImageUrl("https://specials-images.forbesimg.com/imageserve/5d95d03767dd830006a295b6/960x0.jpg?fit=scale");
            }
            sliderItemList.add(sliderItem);
        }
        mSliderAdapter.renewItems(sliderItemList);
    }

    public void renewItemsForBrandsSlider(View view) {
        List<SliderModel> sliderItemList = new ArrayList<>();
        //dummy data
        for (int i = 0; i < 10; i++) {
            SliderModel sliderItem = new SliderModel();
            if (i % 2 == 0) {
                sliderItem.setImageUrl("https://iconshots.com/wp-content/uploads/2018/10/word-image-8.jpeg");
            } else if(i%3==0){
                sliderItem.setImageUrl("https://www.sportstrategies.com/wp-content/uploads/2018/12/decathlon-logo-2538.png");
            }
            else if(i%5==0){
                sliderItem.setImageUrl("https://1000logos.net/wp-content/uploads/2017/05/Color-oNorth-Face.jpg");
            }
            else{
                sliderItem.setImageUrl("https://www.sportstrategies.com/wp-content/uploads/2018/12/decathlon-logo-2538.png");
            }
            sliderItemList.add(sliderItem);
        }
        mBrandsSliderAdapter.renewItemsForTopBrands(sliderItemList);
    }


   /* public void removeLastItem(View view) {
        if (mSliderAdapter.getCount() - 1 >= 0)
            mSliderAdapter.deleteItem(mSliderAdapter.getCount() - 1);
    }

    public void addNewItem(View view) {
        SliderModel sliderItem = new SliderModel();
        sliderItem.setDescription("Slider Item Added Manually");
        sliderItem.setImageUrl("https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
        mSliderAdapter.addItem(sliderItem);
    }*/
}
