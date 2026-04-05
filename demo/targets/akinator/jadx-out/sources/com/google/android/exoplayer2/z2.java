package com.google.android.exoplayer2;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface z2 extends t2 {
    void disable();

    void enable(c3 c3Var, z0[] z0VarArr, bf.b1 b1Var, long j10, boolean z10, boolean z11, long j11, long j12) throws r;

    b3 getCapabilities();

    com.google.android.exoplayer2.util.h0 getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    bf.b1 getStream();

    int getTrackType();

    @Override // com.google.android.exoplayer2.t2
    /* synthetic */ void handleMessage(int i10, Object obj) throws r;

    boolean hasReadStreamToEnd();

    void init(int i10, zd.c0 c0Var);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void render(long j10, long j11) throws r;

    void replaceStream(z0[] z0VarArr, bf.b1 b1Var, long j10, long j11) throws r;

    void reset();

    void resetPosition(long j10) throws r;

    void setCurrentStreamFinal();

    void start() throws r;

    void stop();

    default void release() {
    }

    default void setPlaybackSpeed(float f10, float f11) throws r {
    }
}
