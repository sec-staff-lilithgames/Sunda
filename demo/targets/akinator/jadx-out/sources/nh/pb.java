package nh;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class pb extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final NavigableSet f76558b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.v0 f76559c;

    public pb(NavigableSet navigableSet, mh.v0 v0Var) {
        this.f76558b = (NavigableSet) mh.p1.checkNotNull(navigableSet);
        this.f76559c = (mh.v0) mh.p1.checkNotNull(v0Var);
    }

    @Override // nh.mb
    public final Iterator a() {
        return new o7(this.f76558b.iterator(), this.f76559c, 1);
    }

    @Override // nh.j0
    public final Iterator b() {
        return descendingMap().entrySet().iterator();
    }

    @Override // nh.mb, java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f76558b.clear();
    }

    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return this.f76558b.comparator();
    }

    @Override // nh.j0, java.util.NavigableMap
    public NavigableMap<Object, Object> descendingMap() {
        return ec.asMap(this.f76558b.descendingSet(), this.f76559c);
    }

    @Override // nh.j0, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        boolean zContains;
        NavigableSet navigableSet = this.f76558b;
        mh.p1.checkNotNull(navigableSet);
        try {
            zContains = navigableSet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f76559c.apply(obj);
        }
        return null;
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> headMap(Object obj, boolean z10) {
        return ec.asMap(this.f76558b.headSet(obj, z10), this.f76559c);
    }

    @Override // nh.j0, java.util.NavigableMap
    public NavigableSet<Object> navigableKeySet() {
        return new ka(this.f76558b);
    }

    @Override // nh.mb, java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f76558b.size();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return ec.asMap(this.f76558b.subSet(obj, z10, obj2, z11), this.f76559c);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> tailMap(Object obj, boolean z10) {
        return ec.asMap(this.f76558b.tailSet(obj, z10), this.f76559c);
    }
}
