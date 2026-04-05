package nh;

import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface ca {
    void clear();

    ca copyFor(ReferenceQueue<Object> referenceQueue, a9 a9Var);

    Object get();

    a9 getEntry();
}
