package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f95564b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f95565c;

    public h(mt.l lVar, Object obj) {
        this.f95564b = lVar;
        this.f95565c = obj;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        Object obj = this.f95565c;
        g gVar = new g();
        gVar.f95504c = iu.u.next(obj);
        this.f95564b.subscribe((mt.q) gVar);
        return gVar.getIterable();
    }
}
