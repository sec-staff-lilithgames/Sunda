package io.odeeo.internal.u0;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o2<K> extends n2<K> {

    /* renamed from: i, reason: collision with root package name */
    public transient long[] f67014i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f67015j;

    /* renamed from: k, reason: collision with root package name */
    public transient int f67016k;

    public o2() {
        this(3);
    }

    public static <K> o2<K> create() {
        return new o2<>();
    }

    public static <K> o2<K> createWithExpectedSize(int i10) {
        return new o2<>(i10);
    }

    @Override // io.odeeo.internal.u0.n2
    public void a(int i10, float f10) {
        super.a(i10, f10);
        this.f67015j = -2;
        this.f67016k = -2;
        long[] jArr = new long[i10];
        this.f67014i = jArr;
        Arrays.fill(jArr, -1L);
    }

    public final void c(int i10, int i11) {
        long[] jArr = this.f67014i;
        jArr[i10] = (jArr[i10] & 4294967295L) | (i11 << 32);
    }

    @Override // io.odeeo.internal.u0.n2
    public void clear() {
        super.clear();
        this.f67015j = -2;
        this.f67016k = -2;
    }

    public final void d(int i10, int i11) {
        if (i10 == -2) {
            this.f67015j = i11;
        } else {
            e(i10, i11);
        }
        if (i11 == -2) {
            this.f67016k = i10;
        } else {
            c(i11, i10);
        }
    }

    public final void e(int i10, int i11) {
        long[] jArr = this.f67014i;
        jArr[i10] = (jArr[i10] & (-4294967296L)) | (i11 & 4294967295L);
    }

    @Override // io.odeeo.internal.u0.n2
    public int h(int i10) {
        int iN = n(i10);
        if (iN == -2) {
            return -1;
        }
        return iN;
    }

    @Override // io.odeeo.internal.u0.n2
    public void j(int i10) {
        super.j(i10);
        long[] jArr = this.f67014i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        this.f67014i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i10, -1L);
    }

    public final int m(int i10) {
        return (int) (this.f67014i[i10] >>> 32);
    }

    public final int n(int i10) {
        return (int) this.f67014i[i10];
    }

    public o2(int i10) {
        this(i10, 1.0f);
    }

    @Override // io.odeeo.internal.u0.n2
    public void e(int i10) {
        int iC = c() - 1;
        d(m(i10), n(i10));
        if (i10 < iC) {
            d(m(iC), i10);
            d(i10, n(iC));
        }
        super.e(i10);
    }

    public o2(int i10, float f10) {
        super(i10, f10);
    }

    public o2(n2<K> n2Var) {
        a(n2Var.c(), 1.0f);
        int iA = n2Var.a();
        while (iA != -1) {
            put(n2Var.c(iA), n2Var.d(iA));
            iA = n2Var.h(iA);
        }
    }

    @Override // io.odeeo.internal.u0.n2
    public int a() {
        int i10 = this.f67015j;
        if (i10 == -2) {
            return -1;
        }
        return i10;
    }

    @Override // io.odeeo.internal.u0.n2
    public int a(int i10, int i11) {
        return i10 == c() ? i11 : i10;
    }

    @Override // io.odeeo.internal.u0.n2
    public void a(int i10, K k10, int i11, int i12) {
        super.a(i10, k10, i11, i12);
        d(this.f67016k, i10);
        d(i10, -2);
    }
}
