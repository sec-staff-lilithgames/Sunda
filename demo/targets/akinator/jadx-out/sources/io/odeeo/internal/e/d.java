package io.odeeo.internal.e;

import io.odeeo.internal.e.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface d<I, O, E extends f> {
    I dequeueInputBuffer() throws f;

    O dequeueOutputBuffer() throws f;

    void flush();

    String getName();

    void queueInputBuffer(I i10) throws f;

    void release();
}
