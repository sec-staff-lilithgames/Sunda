package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.b f95402b;

    public e(tw.b bVar) {
        this.f95402b = bVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        d dVar = new d();
        mt.l.fromPublisher(this.f95402b).materialize().subscribe((mt.q) dVar);
        return dVar;
    }
}
