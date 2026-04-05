package io.odeeo.internal.u0;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class y0<E> extends p0<E> implements Set<E> {
    @Override // io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }
}
