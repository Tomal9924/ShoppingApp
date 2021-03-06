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

public class HotOfferForHomepageAdapter extends RecyclerView.Adapter<HotOfferForHomepageAdapter.ViewHolder> {

    Context mContext;
    ArrayList<SuperModel> mArraylist;

    public HotOfferForHomepageAdapter(Context mContext, ArrayList<SuperModel> mArraylist) {
        this.mContext = mContext;
        this.mArraylist = mArraylist;
    }

    @NonNull
        @Override
        public HotOfferForHomepageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_hot_offer_layout, viewGroup, false);
            HotOfferForHomepageAdapter.ViewHolder holder = new HotOfferForHomepageAdapter.ViewHolder(view);
            return holder;
        }
    @Override
    public void onBindViewHolder( ViewHolder viewHolder, final int position) {
        viewHolder.mCaption.setText(mArraylist.get(position).getText());

        viewHolder.mLogo.setImageResource(mArraylist.get(position).getImage());
        viewHolder.mCaption.setText(mArraylist.get(position).getText());
        viewHolder.mProductTitle.setText(mArraylist.get(position).getProductTitle());
        viewHolder.mProductRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                ratingBar.getNumStars();
                ratingBar.setRating(mArraylist.get(position).getRatting());
            }
        });
        viewHolder.mProductNewPrice.setText(String.valueOf(mArraylist.get(position).getProductNewPrice()));
        viewHolder.mProductPriceOff.setText(String.valueOf(mArraylist.get(position).getProductOffPrice()+"% off"));
        viewHolder.mProductPriceOff.setPaintFlags(viewHolder.mProductPriceOff.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
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
                mCaption = itemView.findViewById(R.id.row_layout_hot_offer_caption);
                mLogo = itemView.findViewById(R.id.hot_offer_image);
                mProductTitle = itemView.findViewById(R.id.product_title);
                mProductRating = itemView.findViewById(R.id.product_ratting);
                mProductNewPrice = itemView.findViewById(R.id.product_new_price);
                mProductPriceOff = itemView.findViewById(R.id.price_off);
            }
        }
    }


