package go;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface u {
    void onLoadCanceled(x xVar, long j10, long j11, boolean z10);

    void onLoadCompleted(x xVar, long j10, long j11);

    v onLoadError(x xVar, long j10, long j11, IOException iOException, int i10);

    default void onLoadStarted(x xVar, long j10, long j11, int i10) {
    }
}
