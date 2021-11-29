package com.example.dagger;

import android.graphics.Camera;

import javax.inject.Inject;

public class Board {


    Camera camera;
    Storage storage;
    Board(Camera camera,Storage storage) {
        this.camera=camera;
        this.storage=storage;

    }
//        Camera camera;
//    Storage storage;
//    Board(Camera camera,Storage storage) {
//        this.camera=camera;
//        this.storage=storage;
//
//    }
//}
}
