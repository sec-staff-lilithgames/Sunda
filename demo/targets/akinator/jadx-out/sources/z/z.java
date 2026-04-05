package z;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public int f96993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f96994c;

    public z(x xVar) {
        this.f96994c = xVar;
    }

    public final int getIndex() {
        return this.f96993b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96993b < this.f96994c.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f96993b;
        this.f96993b = i10 + 1;
        return this.f96994c.valueAt(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i10) {
        this.f96993b = i10;
    }
}
