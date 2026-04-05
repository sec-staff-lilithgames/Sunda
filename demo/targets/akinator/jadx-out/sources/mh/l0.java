package mh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f74647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f74648c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f74649e;

    public l0(q0 q0Var, Iterable iterable) {
        this.f74648c = iterable;
        this.f74649e = q0Var;
        this.f74647b = iterable.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f74647b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f74649e.convert(this.f74647b.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f74647b.remove();
    }
}
