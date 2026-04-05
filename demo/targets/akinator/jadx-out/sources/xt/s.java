package xt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93489b;

    /* renamed from: c, reason: collision with root package name */
    public final long f93490c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f93491e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f93492f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f93493g;

    public s(mt.i iVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, boolean z10) {
        this.f93489b = iVar;
        this.f93490c = j10;
        this.f93491e = timeUnit;
        this.f93492f = m0Var;
        this.f93493g = z10;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f93489b.subscribe(new r(fVar, this.f93490c, this.f93491e, this.f93492f, this.f93493g));
    }
}
