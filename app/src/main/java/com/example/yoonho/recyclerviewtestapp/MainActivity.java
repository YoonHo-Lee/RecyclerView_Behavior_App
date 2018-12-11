package com.example.yoonho.recyclerviewtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar myToolbar;
    RecyclerView rv_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 추가된 소스, Toolbar를 생성한다.
        myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        init();
        setData();
    }

    private void setData() {
        ArrayList<FoodItem> listItem = new ArrayList<>();

        //더미 데이터
        for(int i=0; i<30; i++) {
            FoodItem item = new FoodItem(
                    "#991991",
                    "고기"+i,
                    100*i,
                    500*i
            );
            listItem.add(i,item);
        }

        FoodAdapter adapter = new FoodAdapter(this, listItem);
        rv_list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv_list.setAdapter(adapter);


    }

    private void init() {



        rv_list = findViewById(R.id.rv_list);
    }
}
