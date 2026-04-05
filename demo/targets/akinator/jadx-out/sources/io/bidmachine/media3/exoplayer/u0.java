package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface u0 {
    static {
        new ao.k0(new Object());
    }

    go.c getAllocator();

    default long getBackBufferDurationUs(on.f0 f0Var) {
        return getBackBufferDurationUs();
    }

    default void onPrepared(on.f0 f0Var) {
        onPrepared();
    }

    default void onReleased(on.f0 f0Var) {
        onReleased();
    }

    default void onStopped(on.f0 f0Var) {
        onStopped();
    }

    default void onTracksSelected(t0 t0Var, ao.b2 b2Var, fo.l[] lVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default boolean retainBackBufferFromKeyframe(on.f0 f0Var) {
        return retainBackBufferFromKeyframe();
    }

    default boolean shouldContinueLoading(t0 t0Var) {
        return shouldContinueLoading(t0Var.f61564d, t0Var.f61565e, t0Var.f61566f);
    }

    default boolean shouldContinuePreloading(gn.u1 u1Var, ao.k0 k0Var, long j10) {
        io.bidmachine.media3.common.util.b0.w("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default boolean shouldStartPlayback(t0 t0Var) {
        return shouldStartPlayback(t0Var.f61562b, t0Var.f61563c, t0Var.f61565e, t0Var.f61566f, t0Var.f61567g, t0Var.f61568h);
    }

    @Deprecated
    default long getBackBufferDurationUs() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    @Deprecated
    default void onPrepared() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    @Deprecated
    default void onReleased() {
        throw new IllegalStateException("onReleased not implemented");
    }

    @Deprecated
    default void onStopped() {
        throw new IllegalStateException("onStopped not implemented");
    }

    @Deprecated
    default void onTracksSelected(on.f0 f0Var, gn.u1 u1Var, ao.k0 k0Var, s1[] s1VarArr, ao.b2 b2Var, fo.l[] lVarArr) {
        onTracksSelected(u1Var, k0Var, s1VarArr, b2Var, lVarArr);
    }

    @Deprecated
    default boolean retainBackBufferFromKeyframe() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    @Deprecated
    default boolean shouldContinueLoading(long j10, long j11, float f10) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    @Deprecated
    default boolean shouldStartPlayback(gn.u1 u1Var, ao.k0 k0Var, long j10, float f10, boolean z10, long j11) {
        return shouldStartPlayback(j10, f10, z10, j11);
    }

    @Deprecated
    default void onTracksSelected(gn.u1 u1Var, ao.k0 k0Var, s1[] s1VarArr, ao.b2 b2Var, fo.l[] lVarArr) {
        onTracksSelected(s1VarArr, b2Var, lVarArr);
    }

    @Deprecated
    default boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    @Deprecated
    default void onTracksSelected(s1[] s1VarArr, ao.b2 b2Var, fo.l[] lVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }
}
