package com.example.android.tourguideapp;

/**
 * Created by mjyatco on 8/11/17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PublicTransportationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PublicTransportationFragment())
                .commit();
    }
}

