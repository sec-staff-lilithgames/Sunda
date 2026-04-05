package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class dd extends m0 {

    /* renamed from: j, reason: collision with root package name */
    public transient mh.v2 f76187j;

    @Override // nh.w
    public final Collection g() {
        return (Set) this.f76187j.get();
    }

    @Override // nh.w
    public final Collection i(Collection collection) {
        return collection instanceof NavigableSet ? og.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
    }

    @Override // nh.w
    public final Collection j(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new t(this, obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new v(this, obj, (SortedSet) collection, null) : new u(this, obj, (Set) collection);
    }
}
