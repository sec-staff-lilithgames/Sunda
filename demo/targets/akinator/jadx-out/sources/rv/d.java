package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f84999b;

    /* renamed from: c, reason: collision with root package name */
    public int f85000c;

    public d(e eVar) {
        this.f84999b = eVar.f85003a.iterator();
        this.f85000c = eVar.f85004b;
    }

    public final Iterator<Object> getIterator() {
        return this.f84999b;
    }

    public final int getLeft() {
        return this.f85000c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Iterator it;
        while (true) {
            int i10 = this.f85000c;
            it = this.f84999b;
            if (i10 <= 0 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f85000c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Iterator it;
        while (true) {
            int i10 = this.f85000c;
            it = this.f84999b;
            if (i10 <= 0 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f85000c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setLeft(int i10) {
        this.f85000c = i10;
    }
}
