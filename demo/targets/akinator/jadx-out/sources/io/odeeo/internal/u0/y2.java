package io.odeeo.internal.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y2<E> extends q1<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final y2<Object> f67196h = new y2<>(new Object[0], 0, null, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f67197c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f67198d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f67199e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f67200f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f67201g;

    public y2(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f67197c = objArr;
        this.f67198d = objArr2;
        this.f67199e = i11;
        this.f67200f = i10;
        this.f67201g = i12;
    }

    @Override // io.odeeo.internal.u0.d1
    public Object[] a() {
        return this.f67197c;
    }

    @Override // io.odeeo.internal.u0.d1
    public int b() {
        return this.f67201g;
    }

    @Override // io.odeeo.internal.u0.d1
    public int c() {
        return 0;
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f67198d;
        if (obj == null || objArr == null) {
            return false;
        }
        int iA = b1.a(obj);
        while (true) {
            int i10 = iA & this.f67199e;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i10 + 1;
        }
    }

    @Override // io.odeeo.internal.u0.q1
    public h1<E> d() {
        return h1.b(this.f67197c, this.f67201g);
    }

    @Override // io.odeeo.internal.u0.q1
    public boolean e() {
        return true;
    }

    @Override // io.odeeo.internal.u0.q1, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f67200f;
    }

    @Override // io.odeeo.internal.u0.d1
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f67201g;
    }

    @Override // io.odeeo.internal.u0.d1
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f67197c, 0, objArr, i10, this.f67201g);
        return i10 + this.f67201g;
    }

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public q3<E> iterator() {
        return asList().iterator();
    }
}
