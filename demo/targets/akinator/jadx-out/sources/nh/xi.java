package nh;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class xi extends e4 implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f76775b;

    public xi(Collection collection) {
        this.f76775b = collection;
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return this.f76775b;
    }

    @Override // nh.e4, nh.l4
    public final Object delegate() {
        return this.f76775b;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return og.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return og.b(this);
    }
}
