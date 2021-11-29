package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    private static final String TAG = "Mobile";


    Screen screen;
    Board board;

    @Inject
    Mobile(Screen screen, Board board) {
        this.screen = screen;
        this.board = board;
    }


    @Inject
    public void setGuard(Guard guard) {

        guard.setGuardForMobile(this);

    }

    void run(){

        Log.i(TAG, "run: mobile is started...");

    }
}
