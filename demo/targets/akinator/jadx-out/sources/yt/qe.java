package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class qe extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Callable f96217e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96218f;

    public qe(mt.l lVar, Callable<? extends tw.b> callable, int i10) {
        super(lVar);
        this.f96217e = callable;
        this.f96218f = i10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new pe(cVar, this.f96218f, this.f96217e));
    }
}
