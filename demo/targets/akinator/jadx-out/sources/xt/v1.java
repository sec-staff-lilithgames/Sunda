package xt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final long f93523b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f93524c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f93525e;

    public v1(long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f93523b = j10;
        this.f93524c = timeUnit;
        this.f93525e = m0Var;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        u1 u1Var = new u1(fVar);
        fVar.onSubscribe(u1Var);
        tt.d.replace(u1Var, this.f93525e.scheduleDirect(u1Var, this.f93523b, this.f93524c));
    }
}
