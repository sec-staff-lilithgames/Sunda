package io.odeeo.internal.m;

import io.odeeo.internal.d.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends io.odeeo.internal.g.d implements e {
    public a(long j10, long j11, r.a aVar, boolean z10) {
        super(j10, j11, aVar.f63486f, aVar.f63483c, z10);
    }

    @Override // io.odeeo.internal.m.e
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // io.odeeo.internal.m.e
    public long getTimeUs(long j10) {
        return getTimeUsAtPosition(j10);
    }
}
