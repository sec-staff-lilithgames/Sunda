package yt;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i6 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f95666b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95667c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f95668e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f95669f;

    public i6(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f95666b = lVar;
        this.f95667c = j10;
        this.f95668e = timeUnit;
        this.f95669f = m0Var;
    }

    @Override // java.util.concurrent.Callable
    public rt.a call() {
        return this.f95666b.replay(this.f95667c, this.f95668e, this.f95669f);
    }
}
