package qf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface p0 {
    void onLoadCanceled(s0 s0Var, long j10, long j11, boolean z10);

    void onLoadCompleted(s0 s0Var, long j10, long j11);

    q0 onLoadError(s0 s0Var, long j10, long j11, IOException iOException, int i10);
}
