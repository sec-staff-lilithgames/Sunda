package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface eh extends fh, qg {
    @Override // nh.fh, nh.ud
    /* synthetic */ int add(Object obj, int i10);

    @Override // nh.fh, nh.ud, java.util.Collection
    /* synthetic */ boolean add(Object obj);

    @Override // nh.qg
    Comparator<Object> comparator();

    @Override // nh.fh, nh.ud, java.util.Collection
    /* synthetic */ boolean contains(Object obj);

    @Override // nh.fh, nh.ud, java.util.Collection
    /* synthetic */ boolean containsAll(Collection collection);

    @Override // nh.fh, nh.ud
    /* synthetic */ int count(Object obj);

    eh descendingMultiset();

    @Override // nh.fh, nh.ud
    NavigableSet<Object> elementSet();

    @Override // nh.fh, nh.ud
    /* bridge */ /* synthetic */ default Set elementSet() {
        return ((gj) this).elementSet();
    }

    @Override // nh.fh, nh.ud
    Set<td> entrySet();

    td firstEntry();

    eh headMultiset(Object obj, r0 r0Var);

    @Override // nh.fh, nh.ud, java.util.Collection, java.lang.Iterable, nh.qg, java.util.Set, java.util.NavigableSet
    Iterator<Object> iterator();

    td lastEntry();

    td pollFirstEntry();

    td pollLastEntry();

    @Override // nh.fh, nh.ud
    /* synthetic */ int remove(Object obj, int i10);

    @Override // nh.fh, nh.ud, java.util.Collection
    /* synthetic */ boolean remove(Object obj);

    @Override // nh.fh, nh.ud, java.util.Collection
    /* synthetic */ boolean removeAll(Collection collection);

    @Override // nh.fh, nh.ud, java.util.Collection
    /* synthetic */ boolean retainAll(Collection collection);

    @Override // nh.fh, nh.ud
    /* synthetic */ int setCount(Object obj, int i10);

    @Override // nh.fh, nh.ud
    /* synthetic */ boolean setCount(Object obj, int i10, int i11);

    @Override // nh.fh, nh.ud, java.util.Collection
    /* synthetic */ int size();

    eh subMultiset(Object obj, r0 r0Var, Object obj2, r0 r0Var2);

    eh tailMultiset(Object obj, r0 r0Var);

    @Override // nh.fh, nh.ud
    /* bridge */ /* synthetic */ default SortedSet elementSet() {
        return ((gj) this).elementSet();
    }
}
