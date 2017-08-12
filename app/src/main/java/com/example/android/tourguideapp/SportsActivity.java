package com.example.android.tourguideapp;

/**
 * Created by mjyatco on 8/12/17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SportsFragment())
                .commit();
    }
}

