package com.example.shoppingapp.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.shoppingapp.Model.SliderModel;
import com.example.shoppingapp.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class CategoriesHomepageSliderAdapter extends SliderViewAdapter<CategoriesHomepageSliderAdapter.SliderAdapterVH> {

    private Context context;
    private List<SliderModel> mSliderModels = new ArrayList<>();

    public CategoriesHomepageSliderAdapter(Context context) {
        this.context = context;
    }

    public void renewItems(List<SliderModel> sliderItems) {
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
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout_categories, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, final int position) {

        SliderModel sliderItem = mSliderModels.get(position);
        viewHolder.textViewDescription.setText(sliderItem.getDescription());
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
        TextView textViewDescription;

        SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.categories_image);
            textViewDescription = itemView.findViewById(R.id.categories_text);
            this.itemView = itemView;
        }
    }

}
