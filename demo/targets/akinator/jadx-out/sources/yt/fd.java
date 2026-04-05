package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class fd extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f95491e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f95492f;

    public fd(mt.l lVar, TimeUnit timeUnit, mt.m0 m0Var) {
        super(lVar);
        this.f95491e = m0Var;
        this.f95492f = timeUnit;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new ed(cVar, this.f95492f, this.f95491e));
    }
}
