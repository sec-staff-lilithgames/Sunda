package ao;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface s0 {
    default void onDownstreamFormatChanged(int i10, k0 k0Var, g0 g0Var) {
    }

    default void onUpstreamDiscarded(int i10, k0 k0Var, g0 g0Var) {
    }

    default void onLoadCanceled(int i10, k0 k0Var, b0 b0Var, g0 g0Var) {
    }

    default void onLoadCompleted(int i10, k0 k0Var, b0 b0Var, g0 g0Var) {
    }

    default void onLoadError(int i10, k0 k0Var, b0 b0Var, g0 g0Var, IOException iOException, boolean z10) {
    }

    default void onLoadStarted(int i10, k0 k0Var, b0 b0Var, g0 g0Var, int i11) {
    }
}
