package rv;

import java.util.Iterator;
import uu.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f85055b;

    /* renamed from: c, reason: collision with root package name */
    public int f85056c;

    public p(q qVar) {
        this.f85055b = qVar.f85065a.iterator();
    }

    public final int getIndex() {
        return this.f85056c;
    }

    public final Iterator<Object> getIterator() {
        return this.f85055b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85055b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i10) {
        this.f85056c = i10;
    }

    @Override // java.util.Iterator
    public g1 next() {
        int i10 = this.f85056c;
        this.f85056c = i10 + 1;
        if (i10 < 0) {
            uu.p0.throwIndexOverflow();
        }
        return new g1(i10, this.f85055b.next());
    }
}
