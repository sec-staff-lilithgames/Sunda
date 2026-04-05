package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class rd extends qd implements gh {
    @Override // nh.qd, nh.pd, nh.i4, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.gh
    public Comparator<Object> valueComparator() {
        return delegate().valueComparator();
    }

    @Override // nh.qd, nh.pd, nh.i4, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.qd, nh.pd, nh.i4, nh.fc, nh.c8
    public SortedSet<Object> get(Object obj) {
        return Collections.unmodifiableSortedSet(delegate().get(obj));
    }

    @Override // nh.qd, nh.pd, nh.i4, nh.fc, nh.c8
    public SortedSet<Object> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.qd, nh.pd, nh.i4, nh.fc, nh.c8
    public SortedSet<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.qd, nh.pd, nh.i4, nh.l4
    public gh delegate() {
        return (gh) super.delegate();
    }
}
