package x0;

import j1.o2;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public Object f91320b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f91321c;

    /* renamed from: e, reason: collision with root package name */
    public int f91322e;

    public d(Object obj, Map<Object, a> map) {
        this.f91320b = obj;
        this.f91321c = map;
    }

    public final int getIndex$runtime() {
        return this.f91322e;
    }

    public final Map<Object, a> getMap$runtime() {
        return this.f91321c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f91322e < this.f91321c.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f91320b;
        this.f91322e++;
        Object obj2 = this.f91321c.get(obj);
        if (obj2 == null) {
            throw new ConcurrentModificationException(o2.k(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.f91320b = ((a) obj2).getNext();
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime(int i10) {
        this.f91322e = i10;
    }
}
