package zt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f4 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final long f98603b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f98604c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f98605e;

    public f4(long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f98603b = j10;
        this.f98604c = timeUnit;
        this.f98605e = m0Var;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        e4 e4Var = new e4(vVar);
        vVar.onSubscribe(e4Var);
        tt.d.replace(e4Var, this.f98605e.scheduleDirect(e4Var, this.f98603b, this.f98604c));
    }
}
