package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface fh extends ud {
    @Override // nh.ud
    /* synthetic */ int add(Object obj, int i10);

    @Override // nh.ud, java.util.Collection
    /* synthetic */ boolean add(Object obj);

    @Override // nh.ud, java.util.Collection
    /* synthetic */ boolean contains(Object obj);

    @Override // nh.ud, java.util.Collection
    /* synthetic */ boolean containsAll(Collection collection);

    @Override // nh.ud
    /* synthetic */ int count(Object obj);

    @Override // nh.ud
    /* bridge */ /* synthetic */ default Set elementSet() {
        return ((gj) this).elementSet();
    }

    @Override // nh.ud
    SortedSet<Object> elementSet();

    @Override // nh.ud
    /* synthetic */ Set entrySet();

    @Override // nh.ud, java.util.Collection, java.lang.Iterable, nh.qg, java.util.Set, java.util.NavigableSet
    /* synthetic */ Iterator iterator();

    @Override // nh.ud
    /* synthetic */ int remove(Object obj, int i10);

    @Override // nh.ud, java.util.Collection
    /* synthetic */ boolean remove(Object obj);

    @Override // nh.ud, java.util.Collection
    /* synthetic */ boolean removeAll(Collection collection);

    @Override // nh.ud, java.util.Collection
    /* synthetic */ boolean retainAll(Collection collection);

    @Override // nh.ud
    /* synthetic */ int setCount(Object obj, int i10);

    @Override // nh.ud
    /* synthetic */ boolean setCount(Object obj, int i10, int i11);

    @Override // nh.ud, java.util.Collection
    /* synthetic */ int size();
}
