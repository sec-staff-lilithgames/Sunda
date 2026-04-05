package yt;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v5 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96437c;

    /* renamed from: e, reason: collision with root package name */
    public final long f96438e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f96439f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f96440g;

    public v5(mt.l lVar, int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f96436b = lVar;
        this.f96437c = i10;
        this.f96438e = j10;
        this.f96439f = timeUnit;
        this.f96440g = m0Var;
    }

    @Override // java.util.concurrent.Callable
    public rt.a call() {
        return this.f96436b.replay(this.f96437c, this.f96438e, this.f96439f, this.f96440g);
    }
}
