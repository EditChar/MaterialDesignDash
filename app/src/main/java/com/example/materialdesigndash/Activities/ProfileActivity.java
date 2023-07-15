package com.example.materialdesigndash.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.example.materialdesigndash.R;

public class ProfileActivity extends AppCompatActivity {

    private ConstraintLayout backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        backBtn=findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> finish());

    }
}