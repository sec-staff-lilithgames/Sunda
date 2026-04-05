package io.odeeo.internal.u0;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v<K, V> extends t<K, V> {

    /* renamed from: l, reason: collision with root package name */
    public transient long[] f67104l;

    /* renamed from: m, reason: collision with root package name */
    public transient int f67105m;

    /* renamed from: n, reason: collision with root package name */
    public transient int f67106n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f67107o;

    public v() {
        this(3);
    }

    public static <K, V> v<K, V> create() {
        return new v<>();
    }

    public static <K, V> v<K, V> createWithExpectedSize(int i10) {
        return new v<>(i10);
    }

    @Override // io.odeeo.internal.u0.t
    public void a(int i10, float f10) {
        super.a(i10, f10);
        this.f67105m = -2;
        this.f67106n = -2;
        long[] jArr = new long[i10];
        this.f67104l = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // io.odeeo.internal.u0.t
    public int b(int i10) {
        return (int) this.f67104l[i10];
    }

    public final void c(int i10, int i11) {
        if (i10 == -2) {
            this.f67105m = i11;
        } else {
            d(i10, i11);
        }
        if (i11 == -2) {
            this.f67106n = i10;
        } else {
            b(i11, i10);
        }
    }

    @Override // io.odeeo.internal.u0.t, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.f67105m = -2;
        this.f67106n = -2;
    }

    public final void d(int i10, int i11) {
        long[] jArr = this.f67104l;
        jArr[i10] = (jArr[i10] & (-4294967296L)) | (i11 & 4294967295L);
    }

    @Override // io.odeeo.internal.u0.t
    public int e() {
        return this.f67105m;
    }

    @Override // io.odeeo.internal.u0.t
    public void g(int i10) {
        super.g(i10);
        this.f67104l = Arrays.copyOf(this.f67104l, i10);
    }

    public final int j(int i10) {
        return (int) (this.f67104l[i10] >>> 32);
    }

    public v(int i10) {
        this(i10, 1.0f, false);
    }

    public final void b(int i10, int i11) {
        long[] jArr = this.f67104l;
        jArr[i10] = (jArr[i10] & 4294967295L) | (i11 << 32);
    }

    public v(int i10, float f10, boolean z10) {
        super(i10, f10);
        this.f67107o = z10;
    }

    @Override // io.odeeo.internal.u0.t
    public void c(int i10) {
        int size = size() - 1;
        c(j(i10), b(i10));
        if (i10 < size) {
            c(j(size), i10);
            c(i10, b(size));
        }
        super.c(i10);
    }

    @Override // io.odeeo.internal.u0.t
    public void a(int i10, K k10, V v10, int i11) {
        super.a(i10, k10, v10, i11);
        c(this.f67106n, i10);
        c(i10, -2);
    }

    @Override // io.odeeo.internal.u0.t
    public void a(int i10) {
        if (this.f67107o) {
            c(j(i10), b(i10));
            c(this.f67106n, i10);
            c(i10, -2);
            this.f67066f++;
        }
    }

    @Override // io.odeeo.internal.u0.t
    public int a(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }
}
