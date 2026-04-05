package io.odeeo.internal.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface y {
    io.odeeo.internal.p0.b getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    void onTracksSelected(p0[] p0VarArr, io.odeeo.internal.a0.l0 l0Var, io.odeeo.internal.n0.d[] dVarArr);

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long j10, long j11, float f10);

    boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11);
}
