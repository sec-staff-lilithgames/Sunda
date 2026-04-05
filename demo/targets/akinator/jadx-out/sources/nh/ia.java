package nh;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ia extends m4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f76358b;

    public ia(Set set) {
        this.f76358b = set;
    }

    @Override // nh.e4, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e4, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return this.f76358b;
    }

    @Override // nh.m4
    public final Set d() {
        return this.f76358b;
    }

    @Override // nh.e4, nh.l4
    public final Object delegate() {
        return this.f76358b;
    }
}
