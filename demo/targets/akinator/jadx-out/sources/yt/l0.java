package yt;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95835e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f95836f;

    public l0(mt.l lVar, tw.b bVar, Callable<Collection<Object>> callable) {
        super(lVar);
        this.f95835e = bVar;
        this.f95836f = callable;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new k0(new qu.d(cVar), this.f95836f, this.f95835e));
    }
}
