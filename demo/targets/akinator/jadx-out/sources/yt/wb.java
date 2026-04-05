package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class wb extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96508e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f96509f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f96510g;

    /* renamed from: h, reason: collision with root package name */
    public final int f96511h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f96512i;

    public wb(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10, boolean z10) {
        super(lVar);
        this.f96508e = j10;
        this.f96509f = timeUnit;
        this.f96510g = m0Var;
        this.f96511h = i10;
        this.f96512i = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new vb(cVar, this.f96508e, this.f96509f, this.f96510g, this.f96511h, this.f96512i));
    }
}
