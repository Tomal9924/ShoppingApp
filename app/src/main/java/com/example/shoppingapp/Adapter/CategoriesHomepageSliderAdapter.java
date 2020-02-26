package com.example.shoppingapp.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingapp.Model.SuperModel;
import com.example.shoppingapp.R;

import java.util.ArrayList;
import java.util.List;

public class CategoriesHomepageSliderAdapter extends RecyclerView.Adapter<CategoriesHomepageSliderAdapter.viewHolderVH> {

    private Context context;
    private List<SuperModel> mSuperModels = new ArrayList<>();


    public CategoriesHomepageSliderAdapter(Context context, List<SuperModel> mSuperModels) {
        this.context = context;
        this.mSuperModels = mSuperModels;
    }

    @NonNull
    @Override
    public CategoriesHomepageSliderAdapter.viewHolderVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout_categories , viewGroup, false);
        CategoriesHomepageSliderAdapter.viewHolderVH holder = new CategoriesHomepageSliderAdapter.viewHolderVH(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesHomepageSliderAdapter.viewHolderVH holder, int position) {


        holder.mCategoriesImage.setImageResource(mSuperModels.get(position).getImage());
        holder.mText.setText(mSuperModels.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return mSuperModels.size();
    }

    public class viewHolderVH extends RecyclerView.ViewHolder {
        ImageView mCategoriesImage;
        TextView mText;

        public viewHolderVH(@NonNull View itemView) {
            super(itemView);

            mCategoriesImage=itemView.findViewById(R.id.categories_image);
            mText=itemView.findViewById(R.id.categories_text);
        }
    }
}