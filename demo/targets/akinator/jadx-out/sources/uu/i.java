package uu;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f88742b;

    public i(Iterator it) {
        this.f88742b = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88742b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return ((Map.Entry) this.f88742b.next()).getKey();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
