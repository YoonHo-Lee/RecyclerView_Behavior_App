package com.example.yoonho.recyclerviewtestapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    public ImageView iv_food;
    public TextView tv_food, tv_price;
    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);

        iv_food = itemView.findViewById(R.id.iv_food);
        tv_food = itemView.findViewById(R.id.tv_food);
        tv_price = itemView.findViewById(R.id.tv_price);
    }
}
