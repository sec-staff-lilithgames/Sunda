package bu;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a5 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.b0 f10073b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10074c;

    /* renamed from: e, reason: collision with root package name */
    public final long f10075e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f10076f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f10077g;

    public a5(mt.b0 b0Var, int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f10073b = b0Var;
        this.f10074c = i10;
        this.f10075e = j10;
        this.f10076f = timeUnit;
        this.f10077g = m0Var;
    }

    @Override // java.util.concurrent.Callable
    public ju.a call() {
        return this.f10073b.replay(this.f10074c, this.f10075e, this.f10076f, this.f10077g);
    }
}
