package u0;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends uu.q implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final f f87497b;

    public j(f fVar) {
        this.f87497b = fVar;
    }

    @Override // uu.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f87497b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f87497b.containsKey(obj);
    }

    @Override // uu.q
    public int getSize() {
        return this.f87497b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return new k(this.f87497b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        f fVar = this.f87497b;
        if (!fVar.containsKey(obj)) {
            return false;
        }
        fVar.remove(obj);
        return true;
    }
}
