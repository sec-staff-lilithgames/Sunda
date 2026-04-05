package nh;

import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q3 extends f4 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76577b;

    public q3(Object obj) {
        this.f76577b = obj;
    }

    @Override // nh.e4, java.util.Collection
    public boolean add(Object obj) {
        add(0, obj);
        return true;
    }

    @Override // nh.e4, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        addAll(0, collection);
        return true;
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return Collections.EMPTY_LIST;
    }

    @Override // nh.e4, nh.l4
    public final Object delegate() {
        return Collections.EMPTY_LIST;
    }

    @Override // nh.f4, java.util.List
    public void add(int i10, Object obj) {
        mh.p1.checkPositionIndex(i10, 0);
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f76577b);
    }

    @Override // nh.f4, java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        mh.p1.checkNotNull(collection);
        mh.p1.checkPositionIndex(i10, 0);
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f76577b);
    }
}
