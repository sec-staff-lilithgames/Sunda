package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface ud extends Collection {
    int add(Object obj, int i10);

    @Override // java.util.Collection
    boolean add(Object obj);

    @Override // java.util.Collection, nh.ud
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<Object> elementSet();

    Set<td> entrySet();

    @Override // nh.ud
    boolean equals(Object obj);

    @Override // nh.ud
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable, nh.qg, java.util.Set, java.util.NavigableSet
    Iterator<Object> iterator();

    int remove(Object obj, int i10);

    @Override // java.util.Collection
    boolean remove(Object obj);

    @Override // java.util.Collection
    boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection
    boolean retainAll(Collection<?> collection);

    int setCount(Object obj, int i10);

    boolean setCount(Object obj, int i10, int i11);

    @Override // java.util.Collection
    int size();

    String toString();
}
