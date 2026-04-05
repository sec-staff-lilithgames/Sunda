package uu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f88771b;

    public l(m mVar) {
        this.f88771b = mVar;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f88771b.containsValue(obj);
    }

    @Override // uu.a
    public int getSize() {
        return this.f88771b.size();
    }

    @Override // uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new k(this.f88771b.entrySet().iterator());
    }
}
