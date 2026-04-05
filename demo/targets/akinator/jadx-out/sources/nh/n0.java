package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n0 extends m0 implements gh {
    @Override // nh.m0, nh.e0, nh.fc, nh.c8
    public Map<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    @Override // nh.m0, nh.w
    public final Collection h() {
        SortedSet sortedSet = (SortedSet) ((ed) this).f76222j.get();
        return sortedSet instanceof NavigableSet ? og.unmodifiableNavigableSet((NavigableSet) sortedSet) : Collections.unmodifiableSortedSet(sortedSet);
    }

    @Override // nh.w
    public final Collection i(Collection collection) {
        return collection instanceof NavigableSet ? og.unmodifiableNavigableSet((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // nh.w
    public final Collection j(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new t(this, obj, (NavigableSet) collection, null) : new v(this, obj, (SortedSet) collection, null);
    }

    @Override // nh.m0
    /* renamed from: k */
    public final Set h() {
        SortedSet sortedSet = (SortedSet) ((ed) this).f76222j.get();
        return sortedSet instanceof NavigableSet ? og.unmodifiableNavigableSet((NavigableSet) sortedSet) : Collections.unmodifiableSortedSet(sortedSet);
    }

    @Override // nh.m0, nh.w, nh.e0, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    public abstract /* synthetic */ Comparator valueComparator();

    @Override // nh.w, nh.e0, nh.fc
    public Collection<Object> values() {
        return super.values();
    }

    @Override // nh.m0, nh.w, nh.e0, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.m0, nh.w, nh.e0, nh.fc, nh.c8
    public SortedSet<Object> get(Object obj) {
        return (SortedSet) super.get(obj);
    }

    @Override // nh.m0, nh.w, nh.e0, nh.fc, nh.c8
    public SortedSet<Object> removeAll(Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @Override // nh.m0, nh.w, nh.e0, nh.fc, nh.c8
    public SortedSet<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (SortedSet) super.replaceValues(obj, iterable);
    }
}
