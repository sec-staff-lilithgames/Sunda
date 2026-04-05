package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class vi implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f76725b;

    public vi(Iterator it) {
        this.f76725b = (Iterator) mh.p1.checkNotNull(it);
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f76725b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f76725b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f76725b.remove();
    }
}
