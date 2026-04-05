package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u5 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96400c;

    public u5(mt.l lVar, int i10) {
        this.f96399b = lVar;
        this.f96400c = i10;
    }

    @Override // java.util.concurrent.Callable
    public rt.a call() {
        return this.f96399b.replay(this.f96400c);
    }
}
