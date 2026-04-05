package n1;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f75517b;

    public u0(v0 v0Var) {
        this.f75517b = v0Var.f75529l.iterator();
    }

    public final Iterator<x0> getIt() {
        return this.f75517b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75517b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public x0 next() {
        return (x0) this.f75517b.next();
    }
}
