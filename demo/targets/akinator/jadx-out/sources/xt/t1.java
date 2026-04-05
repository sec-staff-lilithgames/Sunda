package xt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93506b;

    /* renamed from: c, reason: collision with root package name */
    public final long f93507c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f93508e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f93509f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.i f93510g;

    public t1(mt.i iVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, mt.i iVar2) {
        this.f93506b = iVar;
        this.f93507c = j10;
        this.f93508e = timeUnit;
        this.f93509f = m0Var;
        this.f93510g = iVar2;
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        pt.b bVar = new pt.b();
        fVar.onSubscribe(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        bVar.add(this.f93509f.scheduleDirect(new r1(this, atomicBoolean, bVar, fVar), this.f93507c, this.f93508e));
        this.f93506b.subscribe(new s1(atomicBoolean, fVar, bVar));
    }
}
