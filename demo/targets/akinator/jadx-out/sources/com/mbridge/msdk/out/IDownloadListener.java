package com.mbridge.msdk.out;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface IDownloadListener {
    void onEnd(int i10, int i11, String str);

    void onProgressUpdate(int i10);

    void onStart();

    void onStatus(int i10);
}
