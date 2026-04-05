package io.odeeo.internal.u0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class o3<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator<? extends F> f67017a;

    public o3(Iterator<? extends F> it) {
        this.f67017a = (Iterator) io.odeeo.internal.t0.u.checkNotNull(it);
    }

    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67017a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f67017a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f67017a.remove();
    }
}
