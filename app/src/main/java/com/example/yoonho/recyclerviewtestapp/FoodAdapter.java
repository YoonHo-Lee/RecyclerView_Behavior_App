package com.example.yoonho.recyclerviewtestapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private Context mContext;
    private ArrayList<FoodItem> listItem;

    public FoodAdapter(Context mContext, ArrayList<FoodItem> listItem) {
        this.mContext = mContext;
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View baseView = View.inflate(mContext, R.layout.item_food,null);
        FoodViewHolder foodViewHolder = new FoodViewHolder(baseView);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder foodViewHolder, int position) {

        FoodItem item = listItem.get(position);
//        foodViewHolder.iv_food.

        foodViewHolder.tv_food.setText(item.getName());
        foodViewHolder.tv_price.setText(item.getMinPrice() + " ~ " + item.getMaxPrice());
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }
}
