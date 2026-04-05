package uu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f88747c;

    public j(m mVar) {
        this.f88747c = mVar;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f88747c.containsKey(obj);
    }

    @Override // uu.a
    public int getSize() {
        return this.f88747c.size();
    }

    @Override // uu.s, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new i(this.f88747c.entrySet().iterator());
    }
}
