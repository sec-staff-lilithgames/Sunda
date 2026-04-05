package com.facebook.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface MediaViewListener {
    void onComplete(MediaView mediaView);

    void onEnterFullscreen(MediaView mediaView);

    void onExitFullscreen(MediaView mediaView);

    void onFullscreenBackground(MediaView mediaView);

    void onFullscreenForeground(MediaView mediaView);

    void onPause(MediaView mediaView);

    void onPlay(MediaView mediaView);

    void onVolumeChange(MediaView mediaView, float f10);
}
