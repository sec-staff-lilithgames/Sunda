package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ed extends n0 {

    /* renamed from: j, reason: collision with root package name */
    public transient mh.v2 f76222j;

    /* renamed from: k, reason: collision with root package name */
    public transient Comparator f76223k;

    @Override // nh.w
    public final Collection g() {
        return (SortedSet) this.f76222j.get();
    }

    @Override // nh.n0, nh.gh
    public Comparator<Object> valueComparator() {
        return this.f76223k;
    }
}
