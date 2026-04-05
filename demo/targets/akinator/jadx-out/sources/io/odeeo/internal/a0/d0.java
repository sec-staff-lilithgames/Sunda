package io.odeeo.internal.a0;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface d0 {
    boolean isReady();

    void maybeThrowError() throws IOException;

    int readData(io.odeeo.internal.b.u uVar, io.odeeo.internal.e.g gVar, int i10);

    int skipData(long j10);
}
