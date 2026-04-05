package io.odeeo.internal.y1;

import java.io.IOException;
import xv.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface b<T> extends Cloneable {
    void cancel();

    b<T> clone();

    void enqueue(d<T> dVar);

    r<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    o0 request();
}
