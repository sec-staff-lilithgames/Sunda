package w0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final q f90310b;

    public n(c cVar) {
        this.f90310b = new q(cVar.getFirstKey$runtime(), cVar.getHashMap$runtime());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90310b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        q qVar = this.f90310b;
        return new u0.b(qVar.getNextKey$runtime(), qVar.next().getValue());
    }
}
