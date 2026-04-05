package nh;

import java.util.Collection;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ka extends k4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigableSet f76421b;

    public ka(NavigableSet navigableSet) {
        this.f76421b = navigableSet;
    }

    @Override // nh.e4, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e4, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return this.f76421b;
    }

    @Override // nh.m4
    public final Set d() {
        return this.f76421b;
    }

    @Override // nh.e4, nh.l4
    public final Object delegate() {
        return this.f76421b;
    }

    @Override // nh.k4, java.util.NavigableSet
    public NavigableSet<Object> descendingSet() {
        return new ka(super.descendingSet());
    }

    @Override // nh.o4
    public final SortedSet e() {
        return this.f76421b;
    }

    @Override // nh.o4, java.util.SortedSet
    public SortedSet<Object> headSet(Object obj) {
        return new ja(super.headSet(obj));
    }

    @Override // nh.o4, java.util.SortedSet
    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return new ja(super.subSet(obj, obj2));
    }

    @Override // nh.o4, java.util.SortedSet
    public SortedSet<Object> tailSet(Object obj) {
        return new ja(super.tailSet(obj));
    }

    @Override // nh.k4, java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj, boolean z10) {
        return new ka(super.headSet(obj, z10));
    }

    @Override // nh.k4, java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new ka(super.subSet(obj, z10, obj2, z11));
    }

    @Override // nh.k4, java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj, boolean z10) {
        return new ka(super.tailSet(obj, z10));
    }
}
