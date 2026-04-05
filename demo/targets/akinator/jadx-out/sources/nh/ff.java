package nh;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ff extends b5 {

    /* renamed from: g, reason: collision with root package name */
    public static final ff f76271g = new ff(new Object[0], 0);

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f76272e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f76273f;

    public ff(Object[] objArr, int i10) {
        this.f76272e = objArr;
        this.f76273f = i10;
    }

    @Override // nh.b5, nh.u4
    public final int a(int i10, Object[] objArr) {
        Object[] objArr2 = this.f76272e;
        int i11 = this.f76273f;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // nh.u4
    public final Object[] c() {
        return this.f76272e;
    }

    @Override // nh.u4
    public final int d() {
        return this.f76273f;
    }

    @Override // nh.u4
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i10) {
        mh.p1.checkElementIndex(i10, this.f76273f);
        Object obj = this.f76272e[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76273f;
    }
}
