package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface Tf {
    static /* synthetic */ void a(Tf tf2, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        tf2.a(runnable, j10);
    }

    void a(Runnable runnable);

    void a(Runnable runnable, long j10);
}
