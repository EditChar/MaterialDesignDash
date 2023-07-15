package com.example.materialdesigndash.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.materialdesigndash.Adapters.TrendsAdapter;
import com.example.materialdesigndash.Domains.TrendsDomain;
import com.example.materialdesigndash.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewTrends;
    RecyclerView.Adapter adapterTrendList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initRecyclerView();
        BottomNavigation();
    }

    private void BottomNavigation() {
        LinearLayout profileBtn = findViewById(R.id.profileBtn);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<TrendsDomain> items= new ArrayList<>();

        items.add(new TrendsDomain("Futura in AI, What will\n tomorrow be like?", "The national","trends"));
        items.add(new TrendsDomain("Important points\n a work contact?", "Reuters","trends2"));
        items.add(new TrendsDomain("Futura in AI, What will\n tomorrow be like?", "The national","trends"));

        recyclerViewTrends = findViewById(R.id.view1);
        recyclerViewTrends.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        adapterTrendList = new TrendsAdapter(items);
        recyclerViewTrends.setAdapter(adapterTrendList);

    }
}