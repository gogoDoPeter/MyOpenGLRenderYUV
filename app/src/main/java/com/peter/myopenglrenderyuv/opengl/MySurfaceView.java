package com.peter.myopenglrenderyuv.opengl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private NativeOpenGl nativeOpenGl;
    public MySurfaceView(Context context) {
        this(context, null);
    }

    public MySurfaceView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MySurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        getHolder().addCallback(this);//TODO 很重要，这样设置有什么用？
    }

    public void setNativeOpenGl(NativeOpenGl nativeOpenGl) {
        this.nativeOpenGl = nativeOpenGl;
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {

        if(nativeOpenGl!=null){
            nativeOpenGl.surfaceCreate(holder.getSurface());
        }
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {
        if(nativeOpenGl!=null){
            nativeOpenGl.surfaceChange(width,height);
        }
    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {
        if(nativeOpenGl!=null){
            nativeOpenGl.surfaceDestory();
        }
    }
}
