package nh;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class kf extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f76426e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f76427f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f76428g;

    public kf(Object[] objArr, int i10, int i11) {
        this.f76426e = objArr;
        this.f76427f = i10;
        this.f76428g = i11;
    }

    @Override // java.util.List
    public Object get(int i10) {
        mh.p1.checkElementIndex(i10, this.f76428g);
        Object obj = this.f76426e[(i10 * 2) + this.f76427f];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76428g;
    }
}
