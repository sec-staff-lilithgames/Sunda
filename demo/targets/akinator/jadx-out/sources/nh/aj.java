package nh;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class aj extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final NavigableMap f76109b;

    /* renamed from: c, reason: collision with root package name */
    public final ze f76110c;

    public aj(NavigableMap navigableMap) {
        this.f76109b = navigableMap;
        this.f76110c = ze.all();
    }

    @Override // nh.mb
    public final Iterator a() {
        Map.Entry entryLowerEntry;
        ze zeVar = this.f76110c;
        boolean zHasLowerBound = zeVar.hasLowerBound();
        NavigableMap navigableMap = this.f76109b;
        Iterator it = (zHasLowerBound && (entryLowerEntry = navigableMap.lowerEntry((v2) zeVar.lowerEndpoint())) != null) ? zeVar.f76827b.g(((ze) entryLowerEntry.getValue()).f76828c) ? navigableMap.tailMap((v2) entryLowerEntry.getKey(), true).values().iterator() : navigableMap.tailMap((v2) zeVar.lowerEndpoint(), true).values().iterator() : navigableMap.values().iterator();
        return new u1(this, it, 3);
    }

    @Override // nh.j0
    public final Iterator b() {
        ze zeVar = this.f76110c;
        boolean zHasUpperBound = zeVar.hasUpperBound();
        NavigableMap navigableMap = this.f76109b;
        x7 x7Var = (x7) z7.peekingIterator((zHasUpperBound ? navigableMap.headMap((v2) zeVar.upperEndpoint(), false).descendingMap().values() : navigableMap.descendingMap().values()).iterator());
        if (x7Var.hasNext() && zeVar.f76828c.g(((ze) x7Var.peek()).f76828c)) {
            x7Var.next();
        }
        return new u1(this, x7Var, 4);
    }

    public final NavigableMap c(ze zeVar) {
        ze zeVar2 = this.f76110c;
        return zeVar.isConnected(zeVar2) ? new aj(this.f76109b, zeVar.intersection(zeVar2)) : s6.of();
    }

    @Override // java.util.SortedMap
    public Comparator<? super v2> comparator() {
        return we.natural();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f76110c.equals(ze.all()) ? this.f76109b.isEmpty() : !a().hasNext();
    }

    @Override // nh.mb, java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f76110c.equals(ze.all()) ? this.f76109b.size() : z7.size(a());
    }

    @Override // nh.j0, java.util.AbstractMap, java.util.Map
    public ze get(Object obj) {
        Map.Entry entryLowerEntry;
        if (obj instanceof v2) {
            try {
                v2 v2Var = (v2) obj;
                if (this.f76110c.contains(v2Var) && (entryLowerEntry = this.f76109b.lowerEntry(v2Var)) != null && ((ze) entryLowerEntry.getValue()).f76828c.equals(v2Var)) {
                    return (ze) entryLowerEntry.getValue();
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.NavigableMap
    public NavigableMap<v2, ze> headMap(v2 v2Var, boolean z10) {
        return c(ze.upTo(v2Var, r0.a(z10)));
    }

    @Override // java.util.NavigableMap
    public NavigableMap<v2, ze> subMap(v2 v2Var, boolean z10, v2 v2Var2, boolean z11) {
        return c(ze.range(v2Var, r0.a(z10), v2Var2, r0.a(z11)));
    }

    @Override // java.util.NavigableMap
    public NavigableMap<v2, ze> tailMap(v2 v2Var, boolean z10) {
        return c(ze.downTo(v2Var, r0.a(z10)));
    }

    public aj(NavigableMap navigableMap, ze zeVar) {
        this.f76109b = navigableMap;
        this.f76110c = zeVar;
    }
}
