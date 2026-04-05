package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ge extends ke {

    /* renamed from: e, reason: collision with root package name */
    public final ud f76302e;

    /* renamed from: f, reason: collision with root package name */
    public final mh.q1 f76303f;

    public ge(ud udVar, mh.q1 q1Var) {
        this.f76302e = (ud) mh.p1.checkNotNull(udVar);
        this.f76303f = (mh.q1) mh.p1.checkNotNull(q1Var);
    }

    @Override // nh.h0, nh.ud
    public int add(Object obj, int i10) {
        mh.q1 q1Var = this.f76303f;
        mh.p1.checkArgument(q1Var.apply(obj), "Element %s does not match predicate %s", obj, q1Var);
        return this.f76302e.add(obj, i10);
    }

    @Override // nh.h0
    public final Set c() {
        return og.filter(this.f76302e.elementSet(), this.f76303f);
    }

    @Override // nh.ke, nh.h0, nh.ud
    public int count(Object obj) {
        int iCount = this.f76302e.count(obj);
        if (iCount <= 0 || !this.f76303f.apply(obj)) {
            return 0;
        }
        return iCount;
    }

    @Override // nh.h0
    public final Set d() {
        return og.filter(this.f76302e.entrySet(), new fe(this, 0));
    }

    @Override // nh.h0
    public final Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.h0
    public final Iterator g() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.h0, nh.ud
    public int remove(Object obj, int i10) {
        jh.i.o(i10, "occurrences");
        if (i10 == 0) {
            return count(obj);
        }
        if (contains(obj)) {
            return this.f76302e.remove(obj, i10);
        }
        return 0;
    }

    @Override // nh.ke, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, nh.ud, nh.qg, java.util.Set, java.util.NavigableSet
    public ej iterator() {
        return z7.filter(this.f76302e.iterator(), this.f76303f);
    }
}
