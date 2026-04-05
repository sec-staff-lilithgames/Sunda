package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ti extends qi implements gh {
    @Override // nh.qi, nh.ji
    public final fc c() {
        return (gh) super.c();
    }

    @Override // nh.qi
    /* renamed from: d */
    public final sf c() {
        return (gh) super.c();
    }

    @Override // nh.qi, nh.ji, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.gh
    public Comparator<Object> valueComparator() {
        Comparator<Object> comparatorValueComparator;
        synchronized (this.f76516c) {
            comparatorValueComparator = ((gh) super.c()).valueComparator();
        }
        return comparatorValueComparator;
    }

    @Override // nh.qi, nh.ji, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.qi, nh.ji, nh.fc, nh.c8
    public SortedSet<Object> get(Object obj) {
        si siVar;
        synchronized (this.f76516c) {
            siVar = new si(((gh) super.c()).get(obj), this.f76516c);
        }
        return siVar;
    }

    @Override // nh.qi, nh.ji, nh.fc, nh.c8
    public SortedSet<Object> removeAll(Object obj) {
        SortedSet<Object> sortedSetRemoveAll;
        synchronized (this.f76516c) {
            sortedSetRemoveAll = ((gh) super.c()).removeAll(obj);
        }
        return sortedSetRemoveAll;
    }

    @Override // nh.qi, nh.ji, nh.fc, nh.c8
    public SortedSet<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        SortedSet<Object> sortedSetReplaceValues;
        synchronized (this.f76516c) {
            sortedSetReplaceValues = ((gh) super.c()).replaceValues(obj, iterable);
        }
        return sortedSetReplaceValues;
    }
}
