package com.example.shoppingapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingapp.Model.SuperModel;
import com.example.shoppingapp.R;

import java.util.ArrayList;

public class QuickLinkListForHomepageAdapter extends RecyclerView.Adapter<QuickLinkListForHomepageAdapter.ViewHolder> {

    Context mContext;
    ArrayList<SuperModel> mArraylist;

    public QuickLinkListForHomepageAdapter(Context mContext, ArrayList<SuperModel> mArraylist) {
        this.mContext = mContext;
        this.mArraylist = mArraylist;
    }

    @NonNull
        @Override
        public QuickLinkListForHomepageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout_quick_link, viewGroup, false);
            QuickLinkListForHomepageAdapter.ViewHolder holder = new QuickLinkListForHomepageAdapter.ViewHolder(view);

            return holder;
        }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, final int position) {
        viewHolder.mCaption.setText(mArraylist.get(position).getText());

        switch (mArraylist.get(position).getId()) {
            case 1:
                viewHolder.mLogo.setImageResource(mArraylist.get(position).getImage());
                break;
            case 2:
                viewHolder.mLogo.setImageResource(mArraylist.get(position).getImage());
                break;
            case 3:
                viewHolder.mLogo.setImageResource(mArraylist.get(position).getImage());
                break;
            case 4:
                viewHolder.mLogo.setImageResource(mArraylist.get(position).getImage());
                break;
            case 5:
                viewHolder.mLogo.setImageResource(mArraylist.get(position).getImage());
                break;
            case 6:
                viewHolder.mLogo.setImageResource(mArraylist.get(position).getImage());
                break;
        }

      /*  viewHolder.mLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position) {
                    case 0:
                        //mContext.startActivity(new Intent(mContext, HomePageActivity.class).putExtra(FRAGMENT_GOTO_HOMEPAGE, CLASS_NAME_PORTFOLIO));
                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                }
            }
        });*/
    }

        @Override
        public int getItemCount() {
            return mArraylist.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            RelativeLayout mLayout;
            ImageView mLogo;
            TextView mCaption;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                mCaption = itemView.findViewById(R.id.row_layout_quick_link_caption);
                mLogo = itemView.findViewById(R.id.row_layout_quick_link_logo);
            }
        }
    }


