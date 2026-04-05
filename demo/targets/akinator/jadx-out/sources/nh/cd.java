package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class cd extends w {

    /* renamed from: j, reason: collision with root package name */
    public transient mh.v2 f76156j;

    @Override // nh.w
    public final Collection g() {
        return (Collection) this.f76156j.get();
    }

    @Override // nh.w
    public final Collection i(Collection collection) {
        return collection instanceof NavigableSet ? og.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    @Override // nh.w
    public final Collection j(Object obj, Collection collection) {
        if (!(collection instanceof List)) {
            return collection instanceof NavigableSet ? new t(this, obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new v(this, obj, (SortedSet) collection, null) : collection instanceof Set ? new u(this, obj, (Set) collection) : new q(this, obj, collection, null);
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new m(this, obj, list, null) : new s(this, obj, list, null);
    }
}
