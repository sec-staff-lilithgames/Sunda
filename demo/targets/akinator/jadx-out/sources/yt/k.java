package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.b f95769b;

    public k(tw.b bVar) {
        this.f95769b = bVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return new i(this.f95769b, new j());
    }
}
