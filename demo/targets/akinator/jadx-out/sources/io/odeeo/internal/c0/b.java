package io.odeeo.internal.c0;

import io.odeeo.internal.b.t;
import io.odeeo.internal.p0.i;
import io.odeeo.internal.p0.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b extends a {

    /* renamed from: j, reason: collision with root package name */
    public final long f63307j;

    public b(i iVar, m mVar, t tVar, int i10, Object obj, long j10, long j11, long j12) {
        super(iVar, mVar, 1, tVar, i10, obj, j10, j11);
        io.odeeo.internal.q0.a.checkNotNull(tVar);
        this.f63307j = j12;
    }

    public long getNextChunkIndex() {
        long j10 = this.f63307j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
