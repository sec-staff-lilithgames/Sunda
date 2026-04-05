package io.bidmachine.media3.exoplayer;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface s1 extends n1 {
    void disable();

    void enable(v1 v1Var, io.bidmachine.media3.common.b[] bVarArr, ao.o1 o1Var, long j10, boolean z10, boolean z11, long j11, long j12, ao.k0 k0Var) throws a0;

    u1 getCapabilities();

    default long getDurationToProgressUs(long j10, long j11) {
        return 10000L;
    }

    x0 getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    ao.o1 getStream();

    int getTrackType();

    @Override // io.bidmachine.media3.exoplayer.n1
    /* synthetic */ void handleMessage(int i10, Object obj) throws a0;

    boolean hasReadStreamToEnd();

    void init(int i10, on.f0 f0Var, io.bidmachine.media3.common.util.g gVar);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void render(long j10, long j11) throws a0;

    void replaceStream(io.bidmachine.media3.common.b[] bVarArr, ao.o1 o1Var, long j10, long j11, ao.k0 k0Var) throws a0;

    void reset();

    void resetPosition(long j10) throws a0;

    void setCurrentStreamFinal();

    void setTimeline(gn.u1 u1Var);

    void start() throws a0;

    void stop();

    default void enableMayRenderStartOfStream() {
    }

    default void release() {
    }

    default void setPlaybackSpeed(float f10, float f11) throws a0 {
    }
}
