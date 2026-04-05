package nh;

import java.io.Serializable;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class xc implements mh.v2, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f76767b;

    public xc(Comparator comparator) {
        this.f76767b = (Comparator) mh.p1.checkNotNull(comparator);
    }

    @Override // mh.v2
    public SortedSet<Object> get() {
        return new TreeSet(this.f76767b);
    }
}
