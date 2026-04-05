package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface k3<E> extends h2<E> {
    @Override // io.odeeo.internal.u0.h2
    /* synthetic */ int add(Object obj, int i10);

    @Override // io.odeeo.internal.u0.h2, java.util.Collection
    /* synthetic */ boolean add(Object obj);

    @Override // io.odeeo.internal.u0.h2, java.util.Collection
    /* synthetic */ boolean contains(Object obj);

    @Override // io.odeeo.internal.u0.h2, java.util.Collection
    /* synthetic */ boolean containsAll(Collection collection);

    @Override // io.odeeo.internal.u0.h2
    /* synthetic */ int count(Object obj);

    @Override // io.odeeo.internal.u0.h2
    /* synthetic */ Set elementSet();

    @Override // io.odeeo.internal.u0.h2
    SortedSet<E> elementSet();

    @Override // io.odeeo.internal.u0.h2
    /* synthetic */ Set entrySet();

    @Override // io.odeeo.internal.u0.h2, java.util.Collection, java.lang.Iterable
    /* synthetic */ Iterator iterator();

    @Override // io.odeeo.internal.u0.h2
    /* synthetic */ int remove(Object obj, int i10);

    @Override // io.odeeo.internal.u0.h2, java.util.Collection
    /* synthetic */ boolean remove(Object obj);

    @Override // io.odeeo.internal.u0.h2, java.util.Collection
    /* synthetic */ boolean removeAll(Collection collection);

    @Override // io.odeeo.internal.u0.h2, java.util.Collection
    /* synthetic */ boolean retainAll(Collection collection);

    @Override // io.odeeo.internal.u0.h2
    /* synthetic */ int setCount(Object obj, int i10);

    @Override // io.odeeo.internal.u0.h2
    /* synthetic */ boolean setCount(Object obj, int i10, int i11);

    @Override // io.odeeo.internal.u0.h2, java.util.Collection
    /* synthetic */ int size();
}
