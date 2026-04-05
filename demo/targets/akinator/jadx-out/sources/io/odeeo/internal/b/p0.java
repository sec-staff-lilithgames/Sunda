package io.odeeo.internal.b;

import io.odeeo.internal.b.m0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface p0 extends m0.b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onSleep(long j10);

        void onWakeup();
    }

    void disable();

    void enable(r0 r0Var, t[] tVarArr, io.odeeo.internal.a0.d0 d0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws n;

    q0 getCapabilities();

    io.odeeo.internal.q0.r getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    io.odeeo.internal.a0.d0 getStream();

    int getTrackType();

    @Override // io.odeeo.internal.b.m0.b
    /* synthetic */ void handleMessage(int i10, Object obj) throws n;

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void render(long j10, long j11) throws n;

    void replaceStream(t[] tVarArr, io.odeeo.internal.a0.d0 d0Var, long j10, long j11) throws n;

    void reset();

    void resetPosition(long j10) throws n;

    void setCurrentStreamFinal();

    void setIndex(int i10);

    void start() throws n;

    void stop();

    default void setPlaybackSpeed(float f10, float f11) throws n {
    }
}
