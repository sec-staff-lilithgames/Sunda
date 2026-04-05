package u0;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends uu.n implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final f f87498b;

    public l(f fVar) {
        this.f87498b = fVar;
    }

    @Override // uu.n, java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f87498b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f87498b.containsValue(obj);
    }

    @Override // uu.n
    public int getSize() {
        return this.f87498b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new m(this.f87498b);
    }
}
