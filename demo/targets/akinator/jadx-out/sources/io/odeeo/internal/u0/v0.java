package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h2;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class v0<E> extends p0<E> implements h2<E> {
    public int add(E e10, int i10) {
        return delegate().add(e10, i10);
    }

    @Override // io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract h2<E> delegate();

    @Override // io.odeeo.internal.u0.h2
    public int count(Object obj) {
        return delegate().count(obj);
    }

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<h2.a<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, io.odeeo.internal.u0.h2
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, io.odeeo.internal.u0.h2
    public int hashCode() {
        return delegate().hashCode();
    }

    public int remove(Object obj, int i10) {
        return delegate().remove(obj, i10);
    }

    public int setCount(E e10, int i10) {
        return delegate().setCount(e10, i10);
    }

    public boolean setCount(E e10, int i10, int i11) {
        return delegate().setCount(e10, i10, i11);
    }
}
