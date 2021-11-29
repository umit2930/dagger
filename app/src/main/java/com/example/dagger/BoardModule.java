package com.example.dagger;

import android.graphics.Camera;
import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module()
public class BoardModule {
    private static final String TAG = "Mobile";

//    @Provides
//    Camera buildCamera() {
//        Camera camera = new Camera();
//        camera.runCamera();
//        return camera;
//    }


    @Provides
    static Camera buildCamera(){
        return new Camera();
    }

    @Provides
    static Storage buildStorage(){
        return new Storage();
    }




    @Provides
    Board buildBoard(Camera camera, Storage storage) {

        Log.i(TAG, "buildBoard: camera is :"+camera +" and storage is :"+storage) ;

        return new Board(camera, storage);
    }




}
