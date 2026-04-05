package w0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public Object f90313b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f90314c;

    /* renamed from: e, reason: collision with root package name */
    public int f90315e;

    public q(Object obj, Map<Object, a> map) {
        this.f90313b = obj;
        this.f90314c = map;
    }

    public final int getIndex$runtime() {
        return this.f90315e;
    }

    public final Object getNextKey$runtime() {
        return this.f90313b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90315e < this.f90314c.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime(int i10) {
        this.f90315e = i10;
    }

    public final void setNextKey$runtime(Object obj) {
        this.f90313b = obj;
    }

    @Override // java.util.Iterator
    public a next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f90314c.get(this.f90313b);
        if (obj == null) {
            throw new ConcurrentModificationException(i.e(new StringBuilder("Hash code of a key ("), this.f90313b, ") has changed after it was added to the persistent map."));
        }
        a aVar = (a) obj;
        this.f90315e++;
        this.f90313b = aVar.getNext();
        return aVar;
    }
}
