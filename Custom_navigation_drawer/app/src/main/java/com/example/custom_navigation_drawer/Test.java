package com.example.custom_navigation_drawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        setTitle("Test activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
