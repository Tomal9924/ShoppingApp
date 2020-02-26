package com.example.shoppingapp.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.shoppingapp.Model.SliderModel;
import com.example.shoppingapp.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class FeaturedBrandsSliderAdapter extends SliderViewAdapter<FeaturedBrandsSliderAdapter.SliderAdapterVH> {

    private Context context;
    private List<SliderModel> mSliderModels = new ArrayList<>();


    public FeaturedBrandsSliderAdapter(Context context) {
        this.context = context;
    }

    public void renewItemsForTopBrands(List<SliderModel> sliderItems) {
        this.mSliderModels = sliderItems;
        notifyDataSetChanged();
    }

    public void deleteItem(int position) {
        this.mSliderModels.remove(position);
        notifyDataSetChanged();
    }

    public void addItem(SliderModel sliderItem) {
        this.mSliderModels.add(sliderItem);
        notifyDataSetChanged();
    }

    @Override
    public FeaturedBrandsSliderAdapter.SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new FeaturedBrandsSliderAdapter.SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(FeaturedBrandsSliderAdapter.SliderAdapterVH viewHolder, final int position) {

        SliderModel sliderItem = mSliderModels.get(position);

        viewHolder.textViewDescription.setText(sliderItem.getDescription());
        viewHolder.textViewDescription.setTextSize(16);
        viewHolder.textViewDescription.setTextColor(Color.WHITE);
        Glide.with(viewHolder.itemView)
                .load(sliderItem.getImageUrl())
                .fitCenter()
                .into(viewHolder.imageViewBackground);

    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return mSliderModels.size();
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        ImageView imageGifContainer;
        TextView textViewDescription;

        SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            imageGifContainer = itemView.findViewById(R.id.iv_gif_container);
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView = itemView;
        }
    }
}
