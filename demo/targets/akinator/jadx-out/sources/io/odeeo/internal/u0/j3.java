package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h2;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface j3<E> extends k3<E>, g3<E> {
    @Override // io.odeeo.internal.u0.g3
    Comparator<? super E> comparator();

    j3<E> descendingMultiset();

    @Override // io.odeeo.internal.u0.k3, io.odeeo.internal.u0.h2
    NavigableSet<E> elementSet();

    @Override // io.odeeo.internal.u0.k3, io.odeeo.internal.u0.h2
    /* synthetic */ SortedSet elementSet();

    @Override // io.odeeo.internal.u0.k3, io.odeeo.internal.u0.h2
    Set<h2.a<E>> entrySet();

    h2.a<E> firstEntry();

    j3<E> headMultiset(E e10, o oVar);

    @Override // io.odeeo.internal.u0.k3, io.odeeo.internal.u0.h2, java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    h2.a<E> lastEntry();

    h2.a<E> pollFirstEntry();

    h2.a<E> pollLastEntry();

    j3<E> subMultiset(E e10, o oVar, E e11, o oVar2);

    j3<E> tailMultiset(E e10, o oVar);
}
