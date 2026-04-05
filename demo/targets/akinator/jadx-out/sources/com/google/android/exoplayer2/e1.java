package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bf.b0 f27440a = new bf.b0(new Object());

    qf.c getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    default void onTracksSelected(m3 m3Var, bf.b0 b0Var, z2[] z2VarArr, bf.n1 n1Var, pf.k[] kVarArr) {
        onTracksSelected(z2VarArr, n1Var, kVarArr);
    }

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long j10, long j11, float f10);

    default boolean shouldStartPlayback(m3 m3Var, bf.b0 b0Var, long j10, float f10, boolean z10, long j11) {
        return shouldStartPlayback(j10, f10, z10, j11);
    }

    @Deprecated
    default void onTracksSelected(z2[] z2VarArr, bf.n1 n1Var, pf.k[] kVarArr) {
        onTracksSelected(m3.f27695b, f27440a, z2VarArr, n1Var, kVarArr);
    }

    @Deprecated
    default boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11) {
        return shouldStartPlayback(m3.f27695b, f27440a, j10, f10, z10, j11);
    }
}
