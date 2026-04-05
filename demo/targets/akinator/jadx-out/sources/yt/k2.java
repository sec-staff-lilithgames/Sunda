package yt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k2 extends AtomicLong implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final qu.d f95787b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95788c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f95789e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f95790f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f95791g;

    /* renamed from: h, reason: collision with root package name */
    public j2 f95792h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f95793i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f95794j;

    public k2(qu.d dVar, long j10, TimeUnit timeUnit, m0.a aVar) {
        this.f95787b = dVar;
        this.f95788c = j10;
        this.f95789e = timeUnit;
        this.f95790f = aVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f95791g.cancel();
        this.f95790f.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95794j) {
            return;
        }
        this.f95794j = true;
        j2 j2Var = this.f95792h;
        if (j2Var != null) {
            j2Var.dispose();
        }
        if (j2Var != null) {
            j2Var.a();
        }
        this.f95787b.onComplete();
        this.f95790f.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95794j) {
            mu.a.onError(th2);
            return;
        }
        this.f95794j = true;
        j2 j2Var = this.f95792h;
        if (j2Var != null) {
            j2Var.dispose();
        }
        this.f95787b.onError(th2);
        this.f95790f.dispose();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95794j) {
            return;
        }
        long j10 = this.f95793i + 1;
        this.f95793i = j10;
        j2 j2Var = this.f95792h;
        if (j2Var != null) {
            j2Var.dispose();
        }
        j2 j2Var2 = new j2(obj, j10, this);
        this.f95792h = j2Var2;
        j2Var2.setResource(this.f95790f.schedule(j2Var2, this.f95788c, this.f95789e));
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95791g, dVar)) {
            this.f95791g = dVar;
            this.f95787b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this, j10);
        }
    }
}
