package io.odeeo.internal.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface b {
    a allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(a aVar);

    void release(a[] aVarArr);

    void trim();
}
