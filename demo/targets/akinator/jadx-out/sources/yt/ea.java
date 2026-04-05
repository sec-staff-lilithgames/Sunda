package yt;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ea implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final int f95428b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95429c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f95430e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f95431f;

    public ea(int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f95428b = i10;
        this.f95429c = j10;
        this.f95430e = timeUnit;
        this.f95431f = m0Var;
    }

    @Override // java.util.concurrent.Callable
    public aa call() {
        return new fa(this.f95428b, this.f95429c, this.f95430e, this.f95431f);
    }
}
