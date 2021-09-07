package com.peter.myopenglrenderyuv.opengl;

import android.view.Surface;

public class NativeOpenGl {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }


    public native void surfaceCreate(Surface surface);

    public native void surfaceChange(int width, int height);

    public native void surfaceDestory() ;
}
