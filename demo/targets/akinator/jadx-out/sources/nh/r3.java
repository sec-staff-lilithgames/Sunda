package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r3 extends m4 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76595b;

    public r3(Object obj) {
        this.f76595b = obj;
    }

    @Override // nh.e4, java.util.Collection
    public boolean add(Object obj) {
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f76595b);
    }

    @Override // nh.e4, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        mh.p1.checkNotNull(collection);
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f76595b);
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return Collections.EMPTY_SET;
    }

    @Override // nh.m4
    public final Set d() {
        return Collections.EMPTY_SET;
    }

    @Override // nh.e4, nh.l4
    public final Object delegate() {
        return Collections.EMPTY_SET;
    }
}
