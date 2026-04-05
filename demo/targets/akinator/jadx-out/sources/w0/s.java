package w0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final q f90317b;

    public s(c cVar) {
        this.f90317b = new q(cVar.getFirstKey$runtime(), cVar.getHashMap$runtime());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90317b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f90317b.next().getValue();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
