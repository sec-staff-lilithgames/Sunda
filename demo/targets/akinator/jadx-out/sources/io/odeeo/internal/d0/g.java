package io.odeeo.internal.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface g extends io.odeeo.internal.e.d<k, l, h> {
    @Override // io.odeeo.internal.e.d
    /* synthetic */ k dequeueInputBuffer() throws io.odeeo.internal.e.f;

    @Override // io.odeeo.internal.e.d
    /* synthetic */ l dequeueOutputBuffer() throws io.odeeo.internal.e.f;

    @Override // io.odeeo.internal.e.d
    /* synthetic */ void flush();

    @Override // io.odeeo.internal.e.d
    /* synthetic */ String getName();

    @Override // io.odeeo.internal.e.d
    /* synthetic */ void queueInputBuffer(k kVar) throws io.odeeo.internal.e.f;

    @Override // io.odeeo.internal.e.d
    /* synthetic */ void release();

    void setPositionUs(long j10);
}
