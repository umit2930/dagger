package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Mobile mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent mobileComponent=DaggerMobileComponent.create();
        mobileComponent.injectField(this);
        mobile.run();
        mobile.board.storage.runStorage();
    }
}