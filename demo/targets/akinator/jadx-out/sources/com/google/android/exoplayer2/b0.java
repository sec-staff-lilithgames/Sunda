package com.google.android.exoplayer2;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface b0 {
    @Deprecated
    void clearCameraMotionListener(tf.a aVar);

    @Deprecated
    void clearVideoFrameMetadataListener(sf.l lVar);

    @Deprecated
    void clearVideoSurface();

    @Deprecated
    void clearVideoSurface(Surface surface);

    @Deprecated
    void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Deprecated
    void clearVideoSurfaceView(SurfaceView surfaceView);

    @Deprecated
    void clearVideoTextureView(TextureView textureView);

    @Deprecated
    int getVideoChangeFrameRateStrategy();

    @Deprecated
    int getVideoScalingMode();

    @Deprecated
    sf.x getVideoSize();

    @Deprecated
    void setCameraMotionListener(tf.a aVar);

    @Deprecated
    void setVideoChangeFrameRateStrategy(int i10);

    @Deprecated
    void setVideoFrameMetadataListener(sf.l lVar);

    @Deprecated
    void setVideoScalingMode(int i10);

    @Deprecated
    void setVideoSurface(Surface surface);

    @Deprecated
    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Deprecated
    void setVideoSurfaceView(SurfaceView surfaceView);

    @Deprecated
    void setVideoTextureView(TextureView textureView);
}
