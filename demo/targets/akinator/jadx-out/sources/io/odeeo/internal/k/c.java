package io.odeeo.internal.k;

import io.odeeo.internal.g.i;
import io.odeeo.internal.g.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final long f64422b;

    public c(i iVar, long j10) {
        super(iVar);
        io.odeeo.internal.q0.a.checkArgument(iVar.getPosition() >= j10);
        this.f64422b = j10;
    }

    @Override // io.odeeo.internal.g.q, io.odeeo.internal.g.i
    public long getLength() {
        return super.getLength() - this.f64422b;
    }

    @Override // io.odeeo.internal.g.q, io.odeeo.internal.g.i
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f64422b;
    }

    @Override // io.odeeo.internal.g.q, io.odeeo.internal.g.i
    public long getPosition() {
        return super.getPosition() - this.f64422b;
    }

    @Override // io.odeeo.internal.g.q, io.odeeo.internal.g.i
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        super.setRetryPosition(j10 + this.f64422b, e10);
    }
}
