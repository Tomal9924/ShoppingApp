package com.example.shoppingapp.Adapter;

import android.content.Context;
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

public class TrendingNowHomepageAdapter extends RecyclerView.Adapter<TrendingNowHomepageAdapter.ViewHolder> {

    Context mContext;
    ArrayList<SuperModel> mArraylist;

    public TrendingNowHomepageAdapter(Context mContext, ArrayList<SuperModel> mArraylist) {
        this.mContext = mContext;
        this.mArraylist = mArraylist;
    }

    @NonNull
        @Override
        public TrendingNowHomepageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_trending_now_layout, viewGroup, false);
            TrendingNowHomepageAdapter.ViewHolder holder = new TrendingNowHomepageAdapter.ViewHolder(view);
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
            TextView mCaption,mProductTitle,mProductNewPrice,mProductPriceOff;
            RatingBar mProductRating;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                mLogo = itemView.findViewById(R.id.image);
                mProductTitle = itemView.findViewById(R.id.title);
                mProductRating = itemView.findViewById(R.id.rating);
                mProductNewPrice = itemView.findViewById(R.id.price);
            }
        }
    }


