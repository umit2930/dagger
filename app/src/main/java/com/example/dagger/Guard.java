package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Guard {
    private static final String TAG = "Mobile";

    @Inject
    Guard(){}




    void setGuardForMobile(Mobile mobile){

        Log.i(TAG, "setGuardForMobile: your phone is protected");


    }

}
