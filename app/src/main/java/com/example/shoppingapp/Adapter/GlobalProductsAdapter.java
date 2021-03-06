package com.example.shoppingapp.Adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingapp.Model.SuperModel;
import com.example.shoppingapp.R;

import java.util.ArrayList;

public class GlobalProductsAdapter extends RecyclerView.Adapter<GlobalProductsAdapter.ViewHolder> {

    Context mContext;
    ArrayList<SuperModel> mArraylist;

    public GlobalProductsAdapter(Context mContext, ArrayList<SuperModel> mArraylist) {
        this.mContext = mContext;
        this.mArraylist = mArraylist;
    }

    @NonNull
        @Override
        public GlobalProductsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout_global_products, viewGroup, false);
            GlobalProductsAdapter.ViewHolder holder = new GlobalProductsAdapter.ViewHolder(view);
            return holder;
        }
    @Override
    public void onBindViewHolder( ViewHolder viewHolder, final int position) {
        viewHolder.mLogo.setImageResource(mArraylist.get(position).getImage());
        viewHolder.mProductTitle.setText(mArraylist.get(position).getProductTitle());
        viewHolder.mProductRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                ratingBar.getNumStars();
                ratingBar.setRating(mArraylist.get(position).getRatting());
            }
        });
        viewHolder.mProductNewPrice.setText(String.valueOf(mArraylist.get(position).getProductNewPrice()));
       }

        @Override
        public int getItemCount() {
            return mArraylist.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView mLogo;
            TextView mProductTitle,mProductNewPrice;
            RatingBar mProductRating;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                mLogo = itemView.findViewById(R.id.global_image);
                mProductTitle = itemView.findViewById(R.id.product_title);
                mProductRating = itemView.findViewById(R.id.product_ratting);
                mProductNewPrice = itemView.findViewById(R.id.global_price);
            }
        }
    }


