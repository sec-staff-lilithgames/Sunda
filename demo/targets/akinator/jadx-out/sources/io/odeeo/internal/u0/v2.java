package io.odeeo.internal.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v2<E> extends h1<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final h1<Object> f67128e = new v2(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f67129c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f67130d;

    public v2(Object[] objArr, int i10) {
        this.f67129c = objArr;
        this.f67130d = i10;
    }

    @Override // io.odeeo.internal.u0.d1
    public Object[] a() {
        return this.f67129c;
    }

    @Override // io.odeeo.internal.u0.d1
    public int b() {
        return this.f67130d;
    }

    @Override // io.odeeo.internal.u0.d1
    public int c() {
        return 0;
    }

    @Override // java.util.List
    public E get(int i10) {
        io.odeeo.internal.t0.u.checkElementIndex(i10, this.f67130d);
        return (E) this.f67129c[i10];
    }

    @Override // io.odeeo.internal.u0.d1
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f67130d;
    }

    @Override // io.odeeo.internal.u0.h1, io.odeeo.internal.u0.d1
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f67129c, 0, objArr, i10, this.f67130d);
        return i10 + this.f67130d;
    }
}
