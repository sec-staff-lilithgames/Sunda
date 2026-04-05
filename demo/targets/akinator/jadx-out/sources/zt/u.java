package zt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f98784c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f98785e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f98786f;

    public u(mt.y yVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        super(yVar);
        this.f98784c = j10;
        this.f98785e = timeUnit;
        this.f98786f = m0Var;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new t(vVar, this.f98784c, this.f98785e, this.f98786f));
    }
}
