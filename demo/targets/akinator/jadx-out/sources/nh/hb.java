package nh;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class hb extends db implements SortedSet {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ib f76328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(ib ibVar) {
        super(ibVar);
        this.f76328e = ibVar;
    }

    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        return ((SortedMap) this.f76328e.f76530f).comparator();
    }

    @Override // java.util.SortedSet
    public Object first() {
        return this.f76328e.firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> headSet(Object obj) {
        return (SortedSet) this.f76328e.headMap(obj).keySet();
    }

    @Override // java.util.SortedSet
    public Object last() {
        return this.f76328e.lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return (SortedSet) this.f76328e.subMap(obj, obj2).keySet();
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> tailSet(Object obj) {
        return (SortedSet) this.f76328e.tailMap(obj).keySet();
    }
}
