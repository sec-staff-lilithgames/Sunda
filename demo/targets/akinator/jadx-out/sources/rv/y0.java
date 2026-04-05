package rv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y0 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public int f85117b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f85118c;

    public y0(z0 z0Var) {
        this.f85117b = z0Var.f85129b;
        this.f85118c = z0Var.f85128a.iterator();
    }

    public final Iterator<Object> getIterator() {
        return this.f85118c;
    }

    public final int getLeft() {
        return this.f85117b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85117b > 0 && this.f85118c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f85117b;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        this.f85117b = i10 - 1;
        return this.f85118c.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setLeft(int i10) {
        this.f85117b = i10;
    }
}
