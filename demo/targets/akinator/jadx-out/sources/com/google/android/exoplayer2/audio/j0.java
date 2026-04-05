package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface j0 {
    void onInvalidLatency(long j10);

    void onPositionAdvancing(long j10);

    void onPositionFramesMismatch(long j10, long j11, long j12, long j13);

    void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13);

    void onUnderrun(int i10, long j10);
}
