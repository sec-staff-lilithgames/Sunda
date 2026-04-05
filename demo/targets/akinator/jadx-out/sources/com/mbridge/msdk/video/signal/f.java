package com.mbridge.msdk.video.signal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface f {
    void configurationChanged(int i10, int i11, int i12);

    boolean endCardShowing();

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardShowing();

    void readyStatus(int i10);

    void resizeMiniCard(int i10, int i11, int i12);

    boolean showAlertWebView();

    void showEndcard(int i10);

    void showMiniCard(int i10, int i11, int i12, int i13, int i14);

    void showVideoClickView(int i10);

    void showVideoEndCover();
}
