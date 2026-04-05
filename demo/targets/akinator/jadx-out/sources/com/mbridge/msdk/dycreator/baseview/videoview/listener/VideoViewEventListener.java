package com.mbridge.msdk.dycreator.baseview.videoview.listener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface VideoViewEventListener {
    void onBufferingEnd();

    void onBufferingFail(String str);

    void onBufferingStart();

    void onPlayCompleted();

    void onPlayProgress(int i10, int i11);

    void onPlayStart(String str);

    void onPlayerError(int i10, String str);
}
