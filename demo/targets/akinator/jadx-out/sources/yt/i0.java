package yt;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Callable f95640e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f95641f;

    public i0(mt.l lVar, Callable<? extends tw.b> callable, Callable<Collection<Object>> callable2) {
        super(lVar);
        this.f95640e = callable;
        this.f95641f = callable2;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new h0(new qu.d(cVar), this.f95641f, this.f95640e));
    }
}
