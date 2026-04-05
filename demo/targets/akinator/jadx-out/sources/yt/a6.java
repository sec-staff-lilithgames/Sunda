package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a6 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f95148b;

    public a6(mt.l lVar) {
        this.f95148b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public rt.a call() {
        return this.f95148b.replay();
    }
}
