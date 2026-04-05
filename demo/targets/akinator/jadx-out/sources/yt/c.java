package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f95242b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95243c;

    public c(mt.l lVar, int i10) {
        this.f95242b = lVar;
        this.f95243c = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        b bVar = new b(this.f95243c);
        this.f95242b.subscribe((mt.q) bVar);
        return bVar;
    }
}
