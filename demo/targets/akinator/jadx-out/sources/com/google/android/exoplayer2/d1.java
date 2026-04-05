package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface d1 {
    float getAdjustedPlaybackSpeed(long j10, long j11);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(n1 n1Var);

    void setTargetLiveOffsetOverrideUs(long j10);
}
