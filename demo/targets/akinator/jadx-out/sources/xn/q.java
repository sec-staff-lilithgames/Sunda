package xn;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface q {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void queueSecureInputBuffer(int i10, int i11, nn.d dVar, long j10, int i12);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();

    void waitUntilQueueingComplete() throws InterruptedException;
}
