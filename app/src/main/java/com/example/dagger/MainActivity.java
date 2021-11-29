package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent mobileComponent=DaggerMobileComponent.create();
        Mobile mobile=mobileComponent.buildMobile();
        mobile.run();
    }
}