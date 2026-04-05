package io.odeeo.internal.g;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h {
    void init(j jVar);

    int read(i iVar, u uVar) throws IOException;

    void release();

    void seek(long j10, long j11);

    boolean sniff(i iVar) throws IOException;
}
